package testcase;

import org.testng.annotations.Test;
import pageobjects.AccountCreationDetails;
import pageobjects.homepage;
import pageobjects.myaccountpage;
import org.apache.logging.log4j.*;


public class TC_myaccount extends BaseClass {

    Logger log = LogManager.getLogger("TC_myaccount");

    @Test
    public void verifyRegistrationAndLogin(){

       homepage pg = new homepage(driver);
       pg.clickonSignIn();
        log.info("click on signIn");


        AccountCreationDetails accountcreationdetails = new AccountCreationDetails(driver);
        accountcreationdetails.enterusername("akash tiyagi");
        log.info("enter username");
        accountcreationdetails.enteremail("vivek22@gmail.com");
        log.info("enter email");
        accountcreationdetails.enterpassword("12345678");
        log.info("enter password");
        accountcreationdetails.checkboxbutton();
        log.info("checkbox");
        accountcreationdetails.registerbutton();
        log.info("click on register button");
        pg.getprofilename();
        log.info("fetch profile name");

    }
}
