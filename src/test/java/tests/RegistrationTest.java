package tests;

import dataGenerator.DataCreation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserLoggedInPage;
import utilities.PropertyManager;

public class RegistrationTest extends BaseTest{

    @Test

    public void registerNewUser() {
        HomePage homePage = new HomePage(driver);
        String email = DataCreation.generateEmail();
        String password = DataCreation.generatePassword();
        homePage.registration(email, DataCreation.generateFirstName(), password);
        try {
            UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
            userLoggedInPage.verifyRegistration("action");
            PropertyManager.changeProperty("goodEmail", email);
            PropertyManager.changeProperty("goodPassword", password);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}