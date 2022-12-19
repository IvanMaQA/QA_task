package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HuntingBootsPage extends BasePage{
    public HuntingBootsPage(WebDriver driver) {
        super(driver);
    }

    By allFiltersButtonBy = By.id("search-filter-button");

    public void verifySuccessOpenOfHuntingBootsPage(String expectedText){
        assertStringEquals(readText(allFiltersButtonBy),expectedText);
    }
}