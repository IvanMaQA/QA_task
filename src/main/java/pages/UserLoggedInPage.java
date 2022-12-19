package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoggedInPage extends BasePage{
    public UserLoggedInPage(WebDriver driver) {
        super(driver);
    }
    By clothingAndShoesMenuBy = By.id("catnav-primary-link-10923");
    By menSubcategoryMenuBy = By.id("side-nav-category-link-10936");
    By menBootsSubcategoryMenuBy = By.id("catnav-l4-11109");
    By vintageMenuBy = By.xpath(".//span[@class='wt-display-table-cell wt-text-left-xs']");
    By homeAndLivingMenuBy = By.id("catnav-primary-link-891");
    By homeMenuBy = By.id("side-nav-category-link-10960");
    By clocksMenuBy = By.id("catnav-l4-10966");
    By yourAccButtonBy = By.xpath(".//*[contains(@class,'wt-menu wt-tooltip ge-menu ge-menu--body-below-trigger ge-menu--you-menu wt-tooltip--disabled-touch')]");


    public void verifyRegistration(String expectedText){
        assertStringEquals(readAttribute(yourAccButtonBy, "data-menu-type"), expectedText);
    }
    public void navigateToMenBoots(){
        moveThePointerToElement(clothingAndShoesMenuBy);
        moveThePointerToElement(menSubcategoryMenuBy);
        clickElement(menBootsSubcategoryMenuBy);
    }
    public void navigateToVintageCategory(){
        clickElement(vintageMenuBy);
    }

    public void navigateToClocks(){
        moveThePointerToElement(homeAndLivingMenuBy);
        moveThePointerToElement(homeMenuBy);
        clickElement(clocksMenuBy);

    }
}
