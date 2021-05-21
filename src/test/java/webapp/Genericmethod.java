package webapp;

import locators.locato;
import org.openqa.selenium.WebElement;

public interface Genericmethod extends locato {


    public void scrollup();
    public int scrolldown();
    public void rightclick(WebElement rightclick);
    public void doubleclick();
    public void draganddrop();
    public void dropdownselectbytext();
    public void selectbyindex();




}
