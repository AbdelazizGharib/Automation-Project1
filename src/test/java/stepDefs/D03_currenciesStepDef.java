package stepDefs;

import Pages.P03_homePage;
import Pages.P03_homePage_2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stepDefs.Hooks;

import java.awt.*;

public class D03_currenciesStepDef {
    P03_homePage home = new P03_homePage();
    P03_homePage_2 home1 = new P03_homePage_2();

@Given("Select Euro currency from the dropdown list")
public void Select_Euro_currency_from_the_dropdown_list()
{
    WebElement dropdown = home.drop();
    Select see = new Select(dropdown);
    see.selectByIndex(1);
    System.out.println(dropdown);
}
@Then("verify Euro Symbol is shown on the 4 products")
public void verify_Euro_Symbol_is_shown_on_the_4_products()
{
   WebElement Euro = home1.firstloc();
   // String Euro = Hooks.driver.findElements(By.cssSelector("span[class=\"actual-price\"]\n")).get(1).getText();
//String Euro = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span")).getText();
    boolean euro = Euro.getText().contains("€");
    System.out.println(euro);
    Assert.assertTrue(euro,"tia");
//String Euro2 = Hooks.driver.findElements(By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]//parent::a//parent::div//parent::div//parent::div//span")).get(0).getText();
   // String Euro2 = Hooks.driver.findElements(By.cssSelector("span[class=\"actual-price\"]\n")).get(2).getText();
// String Euro2 = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span")).getText();
    WebElement Euro2 =home1.secondloc();
    boolean euro2 = Euro2.getText().contains("€");
    System.out.println(euro2);
    Assert.assertTrue(euro2,"zizo");
//String Euro3 = Hooks.driver.findElements(By.xpath("//img[@alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]//paernt::a//parent::div//parent::div//parent::div//span")).get(0).getText();
   // String Euro3 = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span")).getText();
   // String Euro3 = Hooks.driver.findElements(By.cssSelector("span[class=\"actual-price\"]\n")).get(3).getText();
    WebElement Euro3 = home1.thirdloc();
    boolean euro3 = Euro3.getText().contains("€");
    System.out.println(euro3);
    Assert.assertTrue(euro3,"tamim");
//String Euro4 = Hooks.driver.findElements(By.cssSelector("span[class=\"actual-price\"]\n")).get(4).getText();
    WebElement Euro4 = home1.fourthloc();
    boolean euro4 = Euro4.getText().contains("€");
    System.out.println(euro4);
    Assert.assertTrue(euro4,"lara");


}


























}
