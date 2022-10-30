package testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.readConfig;

import java.time.Duration;
import java.util.Locale;

public class BaseClass {
    readConfig Read = new readConfig();
    String url = Read.geturl();
    String Browser = Read.getbrowser();

    public static WebDriver driver;
    @BeforeClass
    public void setup(){
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
                driver=null;
                break;
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }
    @AfterClass
    public void teardown(){
        driver.close();
        driver.quit();
    }
}
