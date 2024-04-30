package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P07_FollowUs {

public WebElement facebook ()
{
   WebElement facebook1 = Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    return facebook1;
}
public WebElement twitter ()
{
    WebElement twitter1 = Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    return twitter1;
}
public WebElement youtube()
{
    WebElement youtube1 = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a"));
    return youtube1;
}

public WebElement rss ()
{
    WebElement rss1 = Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
return rss1;

}

























}
