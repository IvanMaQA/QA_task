package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClocksPage extends BasePage{
    public ClocksPage(WebDriver driver) {
        super(driver);
    }
    By allFiltersButtonBy = By.id("search-filter-button");
    By minPriceFieldBy = By.id("search-filter-min-price-input");
    By maxPriceFieldBy = By.id("search-filter-max-price-input");
    By styleArtNouveauCheckboxBy = By.xpath(".//*[contains(@for,'attr_356-2383')]");
    By shopLocationAnywhereRadioBy = By.xpath(".//*[contains(@for,'shop-location-input-0')]");
    By itemTypeHandmadeRadioBy = By.xpath(".//*[contains(@for,'item-type-input-1')]");
    By shipToDropdownBy = By.xpath(".//select[@name='ship_to']");
    By applyButtonBy = By.xpath(".//*[contains(@class,'wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3')]");
    By clockFavoriteButtonBy = By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/div[8]/div/div/div/ol/li[1]/div/div/div/button");
    By favoritesButtonBy = By.id("nav-favorites-button");
    public void searchAndSelectClock(String minPrice, String maxPrice, String value){
        clickElement(allFiltersButtonBy);
        writeText(minPriceFieldBy, minPrice);
        writeText(maxPriceFieldBy, maxPrice);
        clickElement(itemTypeHandmadeRadioBy);
        clickElement(styleArtNouveauCheckboxBy);
        clickElement(shopLocationAnywhereRadioBy);
        selectFromDropdownByValue(shipToDropdownBy, value);
        clickElement(applyButtonBy);
    }
    public void addProductToFavorites(){
        clickElement(clockFavoriteButtonBy);
        clickElement(favoritesButtonBy);
    }

}
