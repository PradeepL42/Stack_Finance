package steps;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;

public class Listener implements ITestListener
{
    AppiumDriver driver;

    @AfterMethod
    public void tearDown(ITestResult result) {


        if (ITestResult.FAILURE == result.getStatus())
        {
            //Take the screenshot
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            //Copy the file to a location and use try catch block to handle exception
            try {
                FileUtils.copyFile(screenshot, new File("/Users/pradeep/Kasier/target/screenshot.png"));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {

                System.out.println("Exception while taking screenshot " + e.getMessage());
            }

            if (ITestResult.SUCCESS == result.getStatus()) {
                System.out.println(result.getName());
            }

        }
    }}
