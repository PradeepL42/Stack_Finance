package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chrome {

    public WebDriver ff() {
        System.setProperty("wwebdriver.gecko.driver", "path of the firefox driver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.id("")).click();


        return driver;


    }


    public static void main(String args[]) {
        chrome c= new chrome();
        c.ff();

    }
}
