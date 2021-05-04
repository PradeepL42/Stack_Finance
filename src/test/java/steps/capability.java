package steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;


public class capability

{


     AndroidDriver<AndroidElement> driver;
    //@Parameters({"platformName", "automationName"})
    @Test
    public String andcap() throws IOException
    {
        File fis = new File("/Users/pradeep/OiTest/org.openintents.shopping_2.1.3-100213_minAPI14(nodpi)_apkmirror.com.apk");
        //Properties prop = new Properties();
        //prop.load(fis);

        {

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "AOSP on IA Emulator");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "9");
            cap.setCapability("app", fis.getAbsolutePath());
            cap.setCapability("appPackage", "org.openintents.shopping");
            cap.setCapability("appActivity", "org.openintents.shopping.ShoppingActivity");
            cap.setCapability("noReset ", false);
            cap.setCapability("fullReset ", true);
            //cap.setCapability("automationName ", "appium");
            cap.setCapability("autoGrantPermissions" , true);
            //driver = new AndroidDriver((new URL("http://127.0.0.1:4723/wd/hub")), cap);
            driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);


        }


        return "driver";

    }
    public AndroidDriver<AndroidElement> getDriver() throws IOException {
        return driver;
    }




    }












