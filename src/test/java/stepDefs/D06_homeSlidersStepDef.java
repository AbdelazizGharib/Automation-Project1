package stepDefs;

import Pages.P05_HoverHomePage2;
import Pages.P06_homeSliders;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.applicationcache.model.ApplicationCacheStatusUpdated;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P06_homeSliders slide = new P06_homeSliders();

    @Given("user click on iphone mobile photo")
    public void user_click_on_iphone_mobile_photo ()
    {
        Actions zizo = new Actions(Hooks.driver);
       zizo.moveToElement(slide.home()).perform();
//        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(3000));
//        wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/iphone-14"));

    }
    @Then("user can NOT move to next page")
    public void user_can_NOT_move_to_next_page ()
    {
        String url= Hooks.driver.getCurrentUrl();
      boolean iphone14 = url.contains("iphone-14");
        System.out.println(url);
        Assert.assertFalse(iphone14);
        Assert.assertNotEquals(url,"\"https://demo.nopcommerce.com/iphone-14\"");


    }





















}
