package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P03_homePage {

   public WebElement drop ()
    {
        WebElement drop_down = Hooks.driver.findElement(By.id("customerCurrency"));
        return drop_down;
    }










}
