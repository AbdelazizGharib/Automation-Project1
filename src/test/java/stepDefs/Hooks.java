package stepDefs;

import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;



    public class Hooks {

        public static ChromeDriver driver;

        @Before
        public void open_browser() {
            driver= new ChromeDriver();
            driver.get("https://demo.nopcommerce.com");
            driver.manage().window().maximize();
        }

        }


///html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span
///html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[1]/span
///html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[1]/span
///html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[4]/div/div[2]/div[3]/div[1]/span

