package tests;
import dataGenerator.RegistrationData;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserLoggedInPage;
import utilities.PropertyManager;

public class RegistrationTest extends BaseTest{

    @Test

    public void registerNewUser() {
        HomePage homePage = new HomePage(driver);
        RegistrationData registrationData = RegistrationData.generateUser();
        homePage.registerRandomUser(registrationData);
        try {
            UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
            userLoggedInPage.verifyRegistration("action");
            PropertyManager.changeProperty("goodEmail", registrationData.getEmail());
            PropertyManager.changeProperty("goodPassword", registrationData.getPassword());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}