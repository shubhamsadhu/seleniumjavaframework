package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myaccountpage {
    WebDriver ldriver;

    public myaccountpage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(id = "email_create")
    WebElement enteremail;

    @FindBy(id = "SubmitCreate")
    WebElement clickonsubmitbutton;

    //action classes
    public void entermailid(String emailid){
        enteremail.sendKeys(emailid);
    }

    public void clickOnsubmit(){
        clickonsubmitbutton.click();
    }
}
