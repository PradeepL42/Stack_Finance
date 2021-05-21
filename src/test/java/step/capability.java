package step;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;


public class capability

{


     AppiumDriver <MobileElement>driver;
    File fis = new File("/Users/pradeep/Documents/co.stackfinance.apk");
    //Properties prop = new Properties();
    //prop.load(fis);
    //@Parameters({"platformName", "automationName"})
    @Test
    @Parameters({"PlatformName"})
    public String Capability( String PlatformName) throws IOException
    {

        if (PlatformName.equals("Android"))
        {

            {

                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setCapability("deviceName", "AOSP on IA Emulator");
                cap.setCapability("platformName", "Android");
                cap.setCapability("platformVersion", "9");
                cap.setCapability("app", fis.getAbsolutePath());
                cap.setCapability("appPackage", "co.stackfinance.stackfinanceapp");
                cap.setCapability("appActivity", "co.stackfinance.stackfinanceapp.MainActivity");
                cap.setCapability("noReset ", false);
                cap.setCapability("fullReset ", true);
                cap.setCapability("unicodeKeyboard", "true");
                cap.setCapability("resetKeyboard", "true");
                //cap.setCapability("automationName ", "appium");
                cap.setCapability("autoGrantPermissions", true);
                //cap.setCapability("autoWebview","true");
                //driver = new AndroidDriver((new URL("http://127.0.0.1:4723/wd/hub")), cap);
                driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);

            }

            return "driver";
        }

        else if(PlatformName.equals("Ios"))

        {
                    DesiredCapabilities cap = new DesiredCapabilities();
                    cap.setCapability("deviceName", "AOSP on IA Emulator");
                    cap.setCapability("platformName", "Ios");
                    cap.setCapability("platformVersion", "9");
                    cap.setCapability("app", fis.getAbsolutePath());
                    cap.setCapability("appPackage", "org.openintents.shopping");
                    cap.setCapability("appActivity", "org.openintents.shopping.ShoppingActivity");
                    cap.setCapability("noReset ", false);
                    cap.setCapability("fullReset ", true);
                    //cap.setCapability("automationName ", "appium");
                    cap.setCapability("autoGrantPermissions", true);
                    //driver = new AndroidDriver((new URL("http://127.0.0.1:4723/wd/hub")), cap);
                    driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4724/wd/hub"), cap);


                }


                    return "driver";

            }


            public AppiumDriver getIOSDriver () throws IOException
            {
                return driver;
            }
            public AppiumDriver getAndroidDriver () throws IOException
            {
                return driver;
            }
        }


















