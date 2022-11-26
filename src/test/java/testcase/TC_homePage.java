package testcase;

import org.testng.annotations.Test;
import pageobjects.loginpage;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TC_homePage extends BaseClass{

    //object creations
    loginpage obj = new loginpage(driver);
    Logger log=LogManager.getLogManager().getLogger("TC login");

    @Test()
    public void performlogout(){
        obj.enterusername("standard_user");
        obj.enterpassword("secret_sauce");
        obj.clickonlogin();
    }
}
