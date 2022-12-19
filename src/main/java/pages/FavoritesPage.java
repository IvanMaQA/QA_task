package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoritesPage extends BasePage{
    public FavoritesPage(WebDriver driver) {
        super(driver);
    }

    By favoritesButtonInProductAreaBy = By.xpath(".//button[@data-listing-id='1354139210']");
    By favoritesItemsCheckBoxBy = By.xpath(".//div[@class='wt-pl-xs-2 wt-pr-xs-2 wt-width-full wt-max-width" +
            "-full wt-display-flex-xs wt-justify-content-space-between wt-align-items-center']");
    By doneButtonBy = By.xpath(".//button[@class='wt-btn wt-btn--primary wt-pr-md-7 wt-pl-md-7']");
    By notificationMessageBy = By.xpath(".//p[@class='wt-text-heading-01 wt-text-black wt-pt-xs-5 wt-pb-xs-1 wt-text-center-xs']");

    public void removeFromFavorites(){
        clickElement(favoritesButtonInProductAreaBy);
        clickElement(favoritesItemsCheckBoxBy);
        clickElement(doneButtonBy);
        refreshPage();

    }
    public void verifyRemove(String expectedText){
        assertStringEquals(readText(notificationMessageBy),expectedText);
    }
}
