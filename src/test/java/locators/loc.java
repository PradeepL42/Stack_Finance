package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loc {
    WebDriver driver;

   // @FindBy(how = How.XPATH, using = "")
    @FindAll({
            @FindBy(id =""),
    @FindBy(name ="")})

    WebElement username;



    public static WebElement username1;

    @FindBy(how = How.XPATH, using = "")

    public static WebElement password;

    public WebElement enterUsername() {
        //driver.findElement((By) signinlocators.username1);
        username.sendKeys();
        return enterUsername();


    }
}
