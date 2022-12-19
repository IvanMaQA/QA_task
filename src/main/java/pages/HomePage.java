package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By navigateToSignInButtonBy = By.xpath(".//*[contains(@class,'wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin')]");
    By emailFieldBy = By.id("join_neu_email_field");
    By passwordFieldBy = By.id("join_neu_password_field");
    By signInButtonBy = By.xpath(".//button[@name='submit_attempt']");
    By errorNotificationBy = By.id("aria-join_neu_email_field-error");
    By navigateToRegistrationButtonBy = By.id("register");
    By registerEmailFieldBy = By.id("join_neu_email_field");
    By registerFirstNameFieldBy = By.id("join_neu_first_name_field");
    By registerPasswordFieldBy = By.id("join_neu_password_field");
    By registerButtonBy = By.xpath(".//button[@value='register']");

    public void login(String email, String password){
        clickElement(navigateToSignInButtonBy);
        writeText(emailFieldBy, email);
        writeText(passwordFieldBy, password);
        clickElement(signInButtonBy);
    }
    public void verifyFailedLogin(String expectedText){
        assertStringEquals(readText(errorNotificationBy), expectedText);
    }

    public void registration(String email, String firstName, String password){
        clickElement(navigateToSignInButtonBy);
        clickElement(navigateToRegistrationButtonBy);
        writeText(registerEmailFieldBy, email);
        writeText(registerFirstNameFieldBy, firstName);
        writeText(registerPasswordFieldBy, password);
        clickElement(registerButtonBy);
    }

}