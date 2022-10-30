package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
    WebDriver ldriver; //create local driver

    public homepage(WebDriver rdriver){
        ldriver= rdriver;
        PageFactory.initElements(rdriver,this);
    }


    //identify webelements
    @FindBy(linkText = "Sign in")
    WebElement signInLink;

     //action method for signIN
    public void clickonSignIn(){
        signInLink.click();
    }
}
