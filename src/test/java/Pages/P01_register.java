package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.D01_registerStepDef;
import stepDefs.Hooks;
public class P01_register {

    public WebElement Register()
    {
        WebElement register = Hooks.driver.findElement(By.linkText("Register"));
        return register;
    }
    public WebElement gender()
    {
        WebElement gender = Hooks.driver.findElement(By.cssSelector("label[class=\"forcheckbox\"]"));
        return gender;
    }

    public WebElement firstname()
    {
        WebElement firstname = Hooks.driver.findElement(By.id("FirstName"));
        return firstname;
    }

    public WebElement lastname()
    {
        WebElement lastname = Hooks.driver.findElement(By.id("LastName"));
        return lastname;
    }
    public WebElement date_of_birth()
    {
        WebElement date_of_birth = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        return date_of_birth;
    }
    public WebElement month6 ()
    {
        WebElement x = Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
        return x;
    }
    public WebElement date_year()
    {
        WebElement year = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        return year;
    }

   public WebElement email ()
   {
       WebElement email = Hooks.driver.findElement(By.id("Email"));
       return email;

   }
    public WebElement password ()
    {
        return Hooks.driver.findElement(By.id("Password"));

    }

    public WebElement pass_confirm()
    {
        WebElement pass_con_firm = Hooks.driver.findElement(By.id("ConfirmPassword"));
        return pass_con_firm;
    }
    public WebElement click_button ()
    {
        WebElement click__button = Hooks.driver.findElement(By.id("register-button"));
        return click__button;
    }








































}
