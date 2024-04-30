package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;
public class P05_HoverHomePage {

public WebElement computer()
{
   WebElement Disk_category = Hooks.driver.findElement(By.linkText("Computers"));
   return Disk_category;

}
public WebElement desktopp()
{
  WebElement topp = Hooks.driver.findElement(By.linkText("Desktops"));
   return topp;
}

public WebElement click0()
{
   WebElement click1 = Hooks.driver.findElement(By.linkText("Desktops"));
   return click1;
}





}
