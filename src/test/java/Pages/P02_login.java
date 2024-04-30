package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;
public class P02_login {

    public WebElement login_button() {
        WebElement login_page = Hooks.driver.findElement(By.linkText("Log in"));
        return login_page;
    }

    public WebElement valid__email() {
        WebElement valid_email = Hooks.driver.findElement(By.id("Email"));
        return valid_email;
    }

    public WebElement valid__password() {
        WebElement valid_password = Hooks.driver.findElement(By.id("Password"));
        return valid_password;
    }

    public WebElement click_login() {
        WebElement login_button = Hooks.driver.findElement(By.className("login-button"));
        return login_button;
    }

    public WebElement myaccount() {
        WebElement myaccounttab = Hooks.driver.findElement(By.linkText("My account"));
        return myaccounttab;
    }
    public WebElement invalid_email()
    {
        WebElement invalid_email = Hooks.driver.findElement(By.id("Email"));
        return invalid_email;
    }

    public WebElement invalid_password ()
    {
        WebElement invalid_pass = Hooks.driver.findElement(By.id("Password"));
    return invalid_pass;
    }





















}
