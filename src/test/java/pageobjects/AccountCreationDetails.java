package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationDetails {

    WebDriver ldriver;
    public AccountCreationDetails(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }


    @FindBy(xpath = "//div/input[@id='user_name']")
    WebElement username;

    @FindBy(xpath = "//div/input[@id='user_email']")
    WebElement useremail;

    @FindBy(xpath = "//div/input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//div/input[@type='checkbox']")
    WebElement clickoncheckbox;

    @FindBy(xpath = "//div/input[@value='Sign up']")
    WebElement registerbutton;



    //actions methods

    public void enterusername(String email){
        username.clear();
        username.sendKeys(email);
    }

    public void enteremail(String email){
        useremail.clear();
        useremail.sendKeys(email);
    }

    public void enterpassword(String passwordenter){
        password.clear();
        password.sendKeys(passwordenter);
    }


    public void checkboxbutton(){
        clickoncheckbox.click();
    }


    public void registerbutton(){
        registerbutton.click();
    }






}
