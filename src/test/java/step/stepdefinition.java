package step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

//@Listeners(steps.Listener.class)
public class stepdefinition extends capability {

    capability c = new capability();
    //Listener l = new Listener();
    //signinlocators l =new signinlocators();

    //signinlocators ls = PageFactory.initElements(driver, signinlocators.class);
    AppiumDriver<MobileElement> driver;


    @Test
    @Given("^I open the app$")
    public void i_open_the_app() throws Throwable {
        //Reporter.log("Tested");

        {
            {
                c.Capability("Android");

                driver = c.getAndroidDriver();
                System.out.println("hello");
//
//                c.Capability("Ios");
//                driver = c.getIOSDriver();
            }
        }

    }

    @Test
    @Then("^I tap on skip button$")
    public void i_tap_on_skip_button() throws Throwable {

        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Skip\"]")).click();
        //driver.findElement(By.id("android:id/content")).getText();
        //driver


    }

    @Test
    @Then("^I tap on Login button$")
    public void i_tap_on_login_button() throws Throwable {

        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Login\"]")).click();

    }


    @Test
    @Then("^I wait for the screen to load$")
    public void i_wait_for_the_screen_to_load() throws Throwable {
        Thread.sleep(20000);
        System.out.println("I am on the right screen");
    }

    @Test
    @Then("^I tap on email field$")
    public void i_tap_on_email_field() throws Throwable {
        driver.findElement(By.xpath("//android.widget.EditText[@index=5]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@index=5]")).clear();
        // driver.hideKeyboard();
        //driver.findElement(By.xpath("//android.widget.EditText[@index=5]")).sendKeys("tested");
        Actions a = new Actions(driver);
        a.sendKeys("pradlingan@gmail.com");
        a.perform();
        //action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        //JavascriptExecutor js =(JavascriptExecutor)driver;
        //js.executeScript("document.getElementByXPath('//android.widget.EditText[@index=5]').value = 'abc'");
    }

    @Test
    @Then("^I tap on password field$")
    public void i_tap_on_password_field() throws Throwable {
        driver.findElement(By.xpath("//android.widget.EditText[@index=6]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@index=6]")).clear();
        // driver.hideKeyboard();
        //driver.findElement(By.xpath("//android.widget.EditText[@index=5]")).sendKeys("tested");
        Actions a = new Actions(driver);
        a.sendKeys("Pradeep42@");
        a.perform();

    }

    @Test
    @Then("^I tap on proceed button$")
    public void i_tap_on_proceed_button() throws Throwable {
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Proceed\"]")).click();
    }


    @Then("^I enter stack pin$")
    public void i_enter_stack_pin() throws Throwable {
        //driver.findElement(By.xpath("android.widget.EditText[@index=2]"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).click();
        Actions as = new Actions(driver);
        as.sendKeys("111111");
        as.perform();
        Thread.sleep(20000);
        try {


            if (driver.findElement(By.id("android:id/button1")).isEnabled()) {

                driver.findElement(By.id("android:id/button1")).click();

            }
        } catch (NoSuchElementException e) {
            System.out.println("Element not fount");


        }


        Thread.sleep(30000);
        driver.findElement(By.xpath("//android.view.View[@index=12]")).click();

        Thread.sleep(20000);


        driver.findElement(By.xpath("//android.widget.Button[@index=4]")).click();

        Thread.sleep(10000);
        Set<String> contextNames = driver.getContextHandles();
        for (String contextName : contextNames) {
            System.out.println(contextName);
            driver.context("NATIVE_APP");
            //String nativeButtonImage = getRefImage ("native-button");
            //driver.findElementByImage().click();

            TouchAction action = new TouchAction(driver);
            action.tap(PointOption.point(213, 453)).perform().release();
            Thread.sleep(20000);
//          List<MobileElement> s=  driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View\n"));
//
//            System.out.println(s.size());
//            s.get(3).click();
            TouchAction actions = new TouchAction(driver);
        actions.tap(PointOption.point(430, 1510)).perform().release();
        Thread.sleep(20000);

        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Prepaid\"]")).click();
        driver.findElement(By.xpath("android.widget.EditText[@index=0")).click();


            //List<MobileElement> m = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.widget.ImageView[@content-desc=\"Mobile and Connectivity\"]/android.view.View/android.view.View"));
            // List<MobileElement> k= m.findElements(By.xpath("/android.widget.ImageView[@content-desc=\"Mobile and Connectivity\"]/android.view.View/android.view.View"));
            // MobileElement r= m.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Mobile\"]"));

            //System.out.println(r.getSize());
            //System.out.println(m.size());




//       }


//driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Mobile\"]")).isEnabled();
                //driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Mobile\"]")).isSelected();
                //driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Broadband\"]")).click();
            }
            //Actions as= new Actions(driver);
            //as.click();
            //driver.getScreenshotAs(OutputType.FILE);


        }
    }



    /*@Test
        @When("^I search the items$")
        public void i_search_the_items() throws Throwable {
           driver.findElement(By.id("autocomplete_add_item")).sendKeys("coffer");

        }*/

















