package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P05_HoverHomePage2 {

    public WebElement desktopps()
    {
        WebElement is_desplay = Hooks.driver.findElement(By.linkText("Desktops"));
        return is_desplay;

    }
    public WebElement text ()
    {
        WebElement get = Hooks.driver.findElement(By.linkText("Desktops"));
        return get;
    }








}
