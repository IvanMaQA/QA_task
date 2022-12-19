package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookBundlePage extends BasePage{
    public BookBundlePage(WebDriver driver) {
        super(driver);
    }

    By sizeDropdownBy = By.id("variation-selector-0");
    By quantityDropdownBy = By.id("listing-page-quantity-select");
    By addToCartButtonBy = By.xpath(".//*[contains(@data-selector,'add-to-cart-button')]");
    By yourCartButtonBy = By.xpath(".//*[contains(@href,'https://www.etsy.com/cart?ref=hdr-cart')]");

    public void addBundleToCart(){
        selectRandomFromDropdown(sizeDropdownBy, 1);
        selectRandomFromDropdown(quantityDropdownBy, 0);
        clickElement(addToCartButtonBy);
        refreshPage();
        clickElement(yourCartButtonBy);
    }
}
