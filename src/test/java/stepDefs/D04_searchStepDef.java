package stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.plugin.event.Node;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import stepDefs.Hooks;
public class D04_searchStepDef {

    @Given("user can search(.*)in search field$")
    public void user_can_search_about_book_laptop_nike(String A)
    {
        WebElement search = Hooks.driver.findElement(By.id("small-searchterms"));
        search.sendKeys(A);
        WebElement click = Hooks.driver.findElement(By.className("search-box-button"));
        click.click();
    }
    @Then("search should be successful")
    public void search_should_be_successful()
    {
        SoftAssert soft = new SoftAssert();
       String url = Hooks.driver.getCurrentUrl();
       Boolean urll = url.contains("https://demo.nopcommerce.com/search?q=");
        System.out.println(urll+url);
       soft.assertEquals(url,true);

    }
    @Given("user can search (.*) in field$")
    public void user_can_search_in_field (String B)
    {
        WebElement search = Hooks.driver.findElement(By.id("small-searchterms"));
        search.sendKeys(B);
        WebElement click = Hooks.driver.findElement(By.className("search-box-button"));
        click.click();

    }

    @Then("searching successfully")
    public void searching_successfully()
    {

        WebElement SCI = Hooks.driver.findElement(By.cssSelector("img[alt=\"Picture of Science & Faith\"]"));
        SCI.click();
        String sku = Hooks.driver.findElement(By.id("sku-36")).getText();
        System.out.println(sku);
        boolean FAITH = sku.contains("SCI_FAITH");
        Assert.assertTrue(FAITH);
     WebElement cam = Hooks.driver.findElement(By.cssSelector("By.cssSelector(\"div[class=\\\"picture\\\"]"));
     cam.click();

      // Hooks.driver.get("https://demo.nopcommerce.com/apple-icam");
        String sku1 = Hooks.driver.findElement(By.id("sku-17")).getText();
        System.out.println(sku1);
        boolean sku111 = sku1.contains("APPLE_CAM");
        Assert.assertTrue(sku111);
        WebElement sku2 = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a"));
        sku2.click();
     //   Hooks.driver.get("https://demo.nopcommerce.com/sound-forge-pro-11-recurring");
       String pro10 = Hooks.driver.findElement(By.id("sku-12")).getText();
        System.out.println(pro10);
       boolean pro100 = pro10.contains("SF_PRO_11");
        Assert.assertTrue(pro100);






    }























}
