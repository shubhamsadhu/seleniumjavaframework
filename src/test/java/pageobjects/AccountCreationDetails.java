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

    @FindBy(xpath = "//div/label[@for='id_gender2']")
    WebElement selecttitle;

    @FindBy(xpath = " //div/input[@name='customer_firstname']")
    WebElement firstname;

    @FindBy(xpath = " //div/input[@name='customer_lastname']")
    WebElement lastname;

    @FindBy(xpath = " //div/input[@name='email']")
    WebElement emailField;

    @FindBy(xpath = " //div/input[@name='passwd']")
    WebElement passwordfield;

    @FindBy(xpath = "//p/input[@name='firstname']")
    WebElement addressFirstName;

    @FindBy(xpath = "//p/input[@name='lastname']")
    WebElement addresslastName;

    @FindBy(xpath = "//p/input[@id='company']")
    WebElement companyname;

    @FindBy(xpath = "//p/input[@name='address1']")
    WebElement addressfield;

    @FindBy(xpath = "//p/input[@name='city']")
    WebElement cityfield;

    @FindBy(id = "uniform-id_state")
    WebElement state;

    @FindBy(id = "postcode")
    WebElement postcode;

    @FindBy(id = "uniform-id_country")
    WebElement country;

    @FindBy(xpath = "//p/input[@name='phone_mobile']")
    WebElement mobilenumberfield;

    @FindBy(xpath = "//p/input[@name='alias']")
    WebElement addressfeild2;

    @FindBy(xpath = "//p/input[@name='submitAccount']")
    WebElement registerbutton;

    @FindBy(xpath = "//p/textarea[@id='other']")
    WebElement additionalinfo;

    //actions methods
    public void selecttitle(){
        selecttitle.click();
    }

    public void enterfirstname(String fname){
        firstname.sendKeys(fname);
    }

    public void enterlastname(String lname){
        lastname.sendKeys(lname);
    }

    public void enteremail(String email){
        emailField.sendKeys(email);
    }

    public void enterpassword(String password){
        passwordfield.sendKeys(password);
    }

    public void addressfname(String addressname1){
        addressFirstName.sendKeys(addressname1);
    }

    public void addresslname(String addressname2){
        addresslastName.sendKeys(addressname2);
    }

    public void company(String cmpny){
        companyname.sendKeys(cmpny);
    }

    public void enteraddress(String address){
        addressfield.sendKeys(address);
    }

    public void entercity(String cityname){
        cityfield.sendKeys(cityname);
    }

    public void selectstate(String enterstate){
        state.sendKeys(enterstate);
    }

    public void entermobilenumber(String mobilenumber){
        mobilenumberfield.sendKeys(mobilenumber);
    }

    public void entercountry(String coutryname){
        country.sendKeys(coutryname);
    }

    public void enterpostcode(String enterpostal){
        postcode.sendKeys(enterpostal);
    }


    public void enterdiscription(String discription){
        additionalinfo.sendKeys(discription);
    }

    public void registerbutton(){
        registerbutton.click();
    }

    public void secondaddressfield(String enteradds){
        addressfeild2.sendKeys(enteradds);
    }






}
