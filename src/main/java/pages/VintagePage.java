package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VintagePage extends BasePage{
    public VintagePage(WebDriver driver) {
        super(driver);
    }

    By allFiltersButtonBy = By.id("search-filter-button");
    By maxProcessingDays3CheckBoxBy = By.xpath(".//*[contains(@for,'max-processing-days-3')]");
    By minCustomPriceFieldBy = By.id("search-filter-min-price-input");
    By maxCustomPriceFieldBy = By.id("search-filter-max-price-input");
    By shopLocationAnywhereRadioBy = By.xpath(".//*[contains(@for,'shop-location-input-0')]");
    By shipToDropdownBy = By.id("ship_to_select");
    By applyButtonBy = By.xpath(".//*[contains(@class,'wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3')]");
    By vintageBookBy = By.xpath(".//*[contains(@src,'https://i.etsystatic.com/5662568/r/il/d4255c/258419568/il_340x270.258419568.jpg')]");


    public void searchProduct(String minPrice, String maxPrice, String country){
        clickElement(allFiltersButtonBy);
        clickElement(maxProcessingDays3CheckBoxBy);
        writeText(minCustomPriceFieldBy, minPrice);
        writeText(maxCustomPriceFieldBy, maxPrice);
        clickElement(shopLocationAnywhereRadioBy);
        selectFromDropdownByValue(shipToDropdownBy, country);
        clickElement(applyButtonBy);


    }   public void selectProduct(){
        clickElement(vintageBookBy);
    }
}
