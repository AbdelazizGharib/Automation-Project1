package stepDefs;

import Pages.P01_register;
import Pages.P01_register_2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register regi = new P01_register();
    P01_register_2 regist = new P01_register_2();
       public static ChromeDriver driver;
        @Given("user open  register page")
        public void user_open_register_page()
        {
            regi.Register().click();
        }
        @When("user select gender type")
        public void user_select_gender_type()
        {
            regi.gender().click();
        }
        @And("user enter first name and last name")
        public void user_enter_first_name_and_last_name()
        {
            regi.firstname().sendKeys("automation");
            regi.lastname().sendKeys("tester");
        }
        @And("user enter date of birth")
        public void user_enter_date_of_birth() throws InterruptedException {

            WebElement day = regi.date_of_birth();
            Select sel = new Select(day);
            sel.selectByIndex(8);
           Select sel1 = new Select(regi.month6());
           sel1.selectByValue("6");
            Select sel2 = new Select(regi.date_year());
            sel2.selectByVisibleText("1991");
        }
        @And("user enter email")
        public void user_enter_email__field()
        {
            regi.email().sendKeys("zizonezam5@gmail.com");
        }
        @And("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
        public void user_fills_Password_fields()
        {
           regi.password().sendKeys("P@ssw0rd");
           regi.pass_confirm().sendKeys("P@ssw0rd");
        }
        @And("user clicks on register button")
        public void user_clicks_on_register_button()
        {
            regi.click_button().click();
        }
        @Then("success message is displayed")
        public void    success_message_is_displayed()
        {
            boolean message11 = regist.success_msg().isDisplayed();
            SoftAssert soft = new SoftAssert();
            soft.assertTrue(message11);
            System.out.println(message11);
            String color_is_Green = regist.color_message().getCssValue("color");
            System.out.println("color is Green" + color_is_Green);
           soft.assertEquals(color_is_Green,"rgba(76, 177, 124, 1)");
            soft.assertAll();
        }




    }


