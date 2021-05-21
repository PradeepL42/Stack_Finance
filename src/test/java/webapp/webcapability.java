package webapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class webcapability {
    WebDriver driver;
@Test
@Ignore()
@Parameters({"browser"})
    public String firefox(String browser) {


        if(driver.equals("firefox")) {
            driver = new FirefoxDriver();
            System.setProperty("wwebdriver.gecko.driver", "path of the firefox driver");

        }
        else if(driver.equals("chrome"))
        {
            driver = new ChromeDriver();
            System.setProperty("wwebdriver.chrome.driver", "path of the chrome driver");

        }
        else
        {
            System.out.println("Driver not started");
        }



        return "driver";


    }

    public  WebDriver getDriver() {
        return driver;
    }
}

