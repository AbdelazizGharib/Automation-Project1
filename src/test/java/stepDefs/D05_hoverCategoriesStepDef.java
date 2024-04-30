package stepDefs;

import Pages.P05_HoverHomePage;
import Pages.P05_HoverHomePage2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import stepDefs.Hooks;
public class D05_hoverCategoriesStepDef {
    P05_HoverHomePage hover = new P05_HoverHomePage();
    P05_HoverHomePage2 hover1 = new P05_HoverHomePage2();

    @Given("user select computer from categories")
    public void user_select_computer_from_categories()
    {
        Actions act = new Actions(Hooks.driver);
        act.moveToElement(hover.computer()).perform();
    }
    @And("user select Desktops from sub_categories")
    public void user_select_Desktops_from_sub_categories()
    {
        String desk = hover.desktopp().getText();
        hover.click0().click();
        String urrll = Hooks.driver.getCurrentUrl();
        System.out.println(urrll);
    }
        @Then("The sub_category will open successfully")
        public void The_sub_category_will_open_successfully()
        {
            boolean ops = hover1.desktopps().isDisplayed();
            Assert.assertTrue(ops);
            String desktop = hover1.text().getText();
            boolean top = desktop.contains("Desk");
            Assert.assertEquals(top,true);
            System.out.println(desktop);

        }


    }






