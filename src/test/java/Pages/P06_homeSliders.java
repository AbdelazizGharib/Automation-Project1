package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P06_homeSliders {

   public WebElement home ()
   {
       WebElement sliders = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[1]/a[1]"));
      return sliders;


   }








}
