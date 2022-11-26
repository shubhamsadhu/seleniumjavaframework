package testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import utilities.readConfig;

import java.time.Duration;

public class BaseClass {
//   readConfig Read = new readConfig();
//    String url = Read.geturl();
//    String Browser = Read.getbrowser();

    public static WebDriver driver;
    @BeforeMethod
    public void setup(){
        String url="https://www.saucedemo.com/";
        String Browser="edge";
        switch (Browser.toLowerCase())
        {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;

            default:
                System.out.println("enter correct browser name");
                break;
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.get(url);
    }


    @AfterMethod
    public void teardown(){
        driver.close();
        driver.quit();
    }
}
