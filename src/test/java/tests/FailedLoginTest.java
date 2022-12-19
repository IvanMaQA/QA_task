package tests;

import dataGenerator.DataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class FailedLoginTest extends BaseTest{

    @Test(dataProvider = "failedLogin", dataProviderClass = DataProviders.class)

    public void FailedLogin(String email, String password, String notification){
        HomePage homePage = new HomePage(driver);
        homePage.login(email, password);
        try {
            homePage.verifyFailedLogin(notification);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}