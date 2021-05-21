package webapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class steps extends webcapability implements Genericmethod

{

    WebDriver driver;


    webcapability web= new webcapability();
   // signinlocators sl= new signinlocators();

    @Test
    public void openapp()
    {

        driver= web.getDriver();
        driver.get("");
    }



    public void scrolldown(int x, int y){



    }


    public void scrollup()
    {

            //WebElement scroll = driver.findElement(By.cssSelector("ur selector"));//u can use By.xpath or By.id here
            Actions actions = new Actions(driver);
            //actions.moveToElement();
            actions.perform();







        }


    public void scrollup(WebElement scroll) {

       // sl.enterUsername().sendKeys("");
        //sl.scrollup();

    }

    public int scrolldown() {
        return 0;
    }

    public void rightclick(WebElement rightclick) {
        Actions actions = new Actions(driver);
       // WebElement elementLocator = driver.findElement(By.id("ID"));
        actions.contextClick(rightclick).perform();



    }

    public void doubleclick() {

    }

    public void draganddrop() {

    }

    public void dropdownselectbytext() {

    }

    public void selectbyindex() {

    }
}
