package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
   WebDriver driver;
   public loginpage(WebDriver rdriver){
       driver=rdriver;
       PageFactory.initElements(rdriver,this);
   }

   @FindBy(xpath = "(//div/input)[1]")
    WebElement enteremailId;

    @FindBy(xpath = "(//div/input)[2]")
    WebElement enterpassword;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement clickonloginbutton;

    public void enterusername(String user){
        enteremailId.sendKeys(user);
    }

    public void enterpassword(String password){
        enterpassword.sendKeys(password);
    }

    public void clickonlogin(){
        clickonloginbutton.click();
    }
}
