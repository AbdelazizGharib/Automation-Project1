package stepDefs;
import Pages.P07_FollowUs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P07_FollowUs follow = new P07_FollowUs();

    @Given("user opens facebook link")
    public void user_opens_facebook_link() throws InterruptedException
    {
        WebElement face = follow.facebook();
        face.click();
        Thread.sleep(5000);
    }

    @Then("facebook will open in new tab")
    public void facebook_will_open_in_new_tab()
    {
        ArrayList<String> AAA = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(AAA.get(1));
        String facebook_url = Hooks.driver.getCurrentUrl();
        System.out.println(facebook_url);
        Assert.assertEquals(facebook_url, "https://www.facebook.com/nopCommerce");
//        boolean password = Hooks.driver.findElement(By.linkText("Create New Account")).isDisplayed();
//        Assert.assertTrue(password);
        Hooks.driver.close();
    }

    @Given("user opens twitter link")
    public void user_opens_twitter_link() throws InterruptedException {
        WebElement twitter = follow.twitter();
        twitter.click();
        Thread.sleep(5000);
    }

    @Then("twitter will open in new tab")
    public void twitter_will_open_in_new_tab()
    {
        ArrayList<String> BBB = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(BBB.get(1));
        String twitter_url = Hooks.driver.getCurrentUrl();
        System.out.println(twitter_url);
        Assert.assertEquals(twitter_url, "https://twitter.com/nopCommerce");
        Hooks.driver.close();

    }

    @Given("user opens youtube link")
    public void user_opens_youtube_link() throws InterruptedException {
        WebElement youtube = follow.youtube();
        youtube.click();
        Thread.sleep(5000);
    }

    @Then("youtube will open in new tab")
    public void youtube_will_open_in_new_tab()
    {
        ArrayList<String> BBB = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(BBB.get(1));
        String youtube_url = Hooks.driver.getCurrentUrl();
        System.out.println(youtube_url);
        Assert.assertEquals(youtube_url, "https://www.youtube.com/user/nopCommerce");
        Hooks.driver.close();

    }


    @Given("user opens rss link")
    public void user_opens_rss_link() throws InterruptedException {
        WebElement rss = follow.rss();
        rss.click();
        Thread.sleep(5000);

    }

    @Then("rss will not open in new tab")
    public void rss_will_not_open_in_new_tab()
    {
        ArrayList<String> BBB = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(BBB.get(1));
        String rss_url = Hooks.driver.getCurrentUrl();
        System.out.println(rss_url);
    Assert.assertEquals(rss_url,"https://demo.nopcommerce.com/news/rss/1");

    }

}