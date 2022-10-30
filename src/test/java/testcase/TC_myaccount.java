package testcase;

import org.testng.annotations.Test;
import pageobjects.AccountCreationDetails;
import pageobjects.homepage;
import pageobjects.myaccountpage;

public class TC_myaccount extends BaseClass {

    @Test
    public void verifyRegistrationAndLogin(){
        driver.get(url);

       homepage pg = new homepage(driver);
       pg.clickonSignIn();
        System.out.println("click on signIn");

       myaccountpage pg1 = new myaccountpage(driver);
       pg1.entermailid("shubh@gmail.com");
        System.out.println("enter email");
       pg1.clickOnsubmit();

        AccountCreationDetails accountcreationdetails = new AccountCreationDetails(driver);
        accountcreationdetails.selecttitle();
        accountcreationdetails.enterfirstname("raman");
        accountcreationdetails.enterlastname("sharma");

    }
}
