package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P01_register_2 {

    public WebElement success_msg()
    {
        WebElement message = Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
        return message;
    }
    public WebElement color_message()
    {
        WebElement color_msg = Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
        return color_msg;

    }




    }
