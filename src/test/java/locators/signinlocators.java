package locators;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class signinlocators {

    public static AppiumDriver driver;

    @FindBy(how = How.XPATH, using = "")

    public static WebElement username1;

    @FindBy(how = How.XPATH, using = "")

    public static WebElement password;

    public WebElement enterUsername() {
        driver.findElement((By) signinlocators.username1);
        return enterUsername();



    }
}
