package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

import javax.swing.plaf.PanelUI;
import java.nio.file.WatchEvent;

public class P08_WishlistS {

    public WebElement Scenario1_given ()
    {
        WebElement Given1 = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
        return Given1;
    }
 public WebElement Scenario1_Then ()
    {
     WebElement Then = Hooks.driver.findElement(By.xpath("/html/body/div[5]/div"));
     return Then;
    }
 public WebElement Scenario1_Background ()
    {
     WebElement Background = Hooks.driver.findElement(By.xpath("/html/body/div[5]/div"));
     return Background;
    }
 public WebElement Scenario2_Given ()
    {
        WebElement Given2 = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
        return Given2;
    }
public WebElement Scenario2_Then ()
    {
    WebElement THEN = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]"));
    return THEN;
    }
public WebElement Scenario2_QTY ()
    {
    WebElement qty = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input"));
    return qty;

    }



}
