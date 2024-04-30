package stepDefs;
import Pages.P02_login;
import Pages.P02_login_2;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;

public class D02_loginStepDef {
    SoftAssert soft1 = new SoftAssert();
    P02_login login = new P02_login();
    P02_login_2 login1 = new P02_login_2();

@Given("user go to login page")
public void user_go_to_login_page() 
{
    login.login_button().click();
}
@When("user login with valid email and password")
    public void user_login_with_valid_email_and_password ()
{
    login.valid__email().sendKeys("zizozidane2011@yahoo.com");
    login.valid__password().sendKeys("P@ssw0rd");
}
@And("user press on login button")
public void user_press_on_login_button()
{
    login.click_login().click();
}
@Then("user login to the system successfully")
    public void user_login_to_the_system_successfully()
{
    boolean account = login1.my_account().isDisplayed();
    soft1.assertTrue(account);
   String Url = Hooks.driver.getCurrentUrl();
    System.out.println(Url);
    soft1.assertEquals(Url,"https://demo.nopcommerce.com/");
    soft1.assertAll();

}
    @When("login_with_invalid_email_and_Password")
    public void login_with_invalid_email_and_Password()
    {
        login.invalid_email().sendKeys("zizozidane2012@yahoo.com");
        login.invalid_password().sendKeys("P@ssw0rd");
    }

    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system()
    {
        boolean error = login1.errormessage().isDisplayed();
        soft1.assertTrue(error);
    String color_is_red = login1.errormessage().getCssValue("color");
        System.out.println(color_is_red);
       String RED = Color.fromString("rgba(228, 67, 75, 1)").asHex();
        System.out.println(RED);
        soft1.assertEquals(RED,"#e4434b");
        System.out.println( "the color of this message is red "+RED);
       soft1.assertAll();

    }




















}
