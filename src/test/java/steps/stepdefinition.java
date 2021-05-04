package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

@Listeners(steps.Listener.class)
public class stepdefinition extends capability {

    capability c = new capability();
    Listener l = new Listener();
    //signinlocators l =new signinlocators();

    //signinlocators ls = PageFactory.initElements(driver, signinlocators.class);
    AndroidDriver<AndroidElement> driver;


    @Test
    @Given("^I open the app$")
    public void i_open_the_app() throws Throwable {

        c.andcap();
        driver = c.getDriver();


    }

    @Test
    @Then("^I choose layout$")
    public void i_choose_layout() throws Throwable {


        driver.findElement(By.id("layout_choice_bottom")).click();
    }

    @Test
    @Then("^I wait for the screen to load$")
    public void i_wait_for_the_screen_to_load() throws Throwable {
        Thread.sleep(2000);
        System.out.println("I am on the right screen");
    }

    /*@Test
        @When("^I search the items$")
        public void i_search_the_items() throws Throwable {
           driver.findElement(By.id("autocomplete_add_item")).sendKeys("coffer");

        }*/
    @Test
    @When("^I search the items (.+)$")
    public void i_search_the_items(String name) throws Throwable {
        driver.findElement(By.id("autocomplete_add_item")).sendKeys(name);
    }

    @Test
    @Then("^I add item to the list$")
    public void i_add_item_to_the_list() throws Throwable {
        driver.findElement(By.id("button_add_item")).click();
    }

    @Test
    @Then("^I delete items from the list$")
    public void i_delete_items_from_the_list() throws Throwable {
        List<AndroidElement> ls = driver.findElements(By.id("list_items"));
        // int b=  ls.size();

        for (WebElement e : ls) {
            System.out.println(e.getSize());
        }
        AndroidElement Select = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
        Select.click();
        Thread.sleep(3000);
        WebElement options= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView\n"));
        options.click();
        Thread.sleep(2000);
        driver.findElement(By.id("android:id/button1")).click();

    }}







           // driver.findElementByXPath("//android.view.ViewGroup[@index ='1']");
            //List<WebElement> el = driver.findElementsById("environments_recycler_view");
            //androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
            //for(WebElement es: el)

//search = org.openintents.shopping:id/autocomplete_add_item


