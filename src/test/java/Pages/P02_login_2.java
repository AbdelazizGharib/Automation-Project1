package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P02_login_2 {

    public WebElement my_account()
    {
        WebElement account = Hooks.driver.findElement(By.linkText("My account"));
        return account;
    }

    public WebElement errormessage()
    {
       return Hooks.driver.findElement(By.className("validation-summary-errors"));

    }









}
