package stepDefs;

import Pages.P08_WishlistS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {
    P08_WishlistS wish = new P08_WishlistS();

    @Given("click  choose HTC from  wishlist  button")
    public void click_choose_HTC_from_wishlist_button ()
    {
        WebElement HTC = wish.Scenario1_given();
        HTC.click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
    }

    @Then("success Green message will appear")
    public void success_Green_message_will_appear ()
    {

       // WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(1000));
      //  wait.until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div"))));
        WebElement message = wish.Scenario1_Then();
       boolean msg = message.isDisplayed();
        SoftAssert soft7 = new SoftAssert();
     soft7.assertTrue(msg);
     WebElement background = wish.Scenario1_Background();
    String back_ground = background.getCssValue("background-color");
        System.out.println(back_ground + "color is Green");
        System.out.println(back_ground);

    }

    @Given("user click on HTC category")
    public void user_click_on_HTC_category () throws InterruptedException {
        WebElement HTCC = wish.Scenario2_Given();
        HTCC.click();
//        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(2000));
//        wait.until(ExpectedConditions.invisibilityOf(Hooks.driver.findElement(By.xpath("/html/body/div[5]/div/p"))));
        Thread.sleep(3000);
    }
    @Then("check The Qty on wishlist")
            public void check_The_Qty_on_wishlist ()
    {
         WebElement wishList = wish.Scenario2_Then();
        wishList.click();
         String Qty = wish.Scenario2_QTY().getText();
        System.out.println(Qty);

    }























}
