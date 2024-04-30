package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P03_homePage_2 {

    public WebElement firstloc()
    {
        WebElement one = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span\n"));
        return one;
    }
    public WebElement secondloc ()
    {
        WebElement two = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[1]/span\n"));
        return two;
    }

    public WebElement thirdloc()
    {
        WebElement three = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[1]/span\n"));
        return three;
    }

    public WebElement fourthloc()
    {
        WebElement four = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[4]/div/div[2]/div[3]/div[1]/span\n"));
        return four;
    }
















}
