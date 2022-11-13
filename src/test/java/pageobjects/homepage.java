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
    @FindBy(xpath = "//div/a[@class='theme-btn register-btn']")
    WebElement clickonregister;

    @FindBy(xpath = "//a/span[@class='navbar-current-user']")
    WebElement getprofilename;

     //action method for signIN
    public void clickonSignIn(){
        clickonregister.click();
    }

    public void getprofilename(){
        System.out.println(getprofilename.getText());
    }
}
