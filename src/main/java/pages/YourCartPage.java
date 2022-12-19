package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage extends BasePage{
    public YourCartPage(WebDriver driver) {
        super(driver);
    }

    By removeButtonBy = By.xpath(".//*[contains(@class,'wt-list-inline__item wt-pb-xs-2 wt-pr-xs-1')]");
    By notificationMessageBy = By.xpath(".//*[contains(@class,'wt-text-heading-01 wt-pt-xs-2 wt-pb-xs-2')]");

    public void removeFromCart(){
        clickElement(removeButtonBy);
    }

    public void verifyRemove(String expectedText){
        assertStringEquals(readText(notificationMessageBy), expectedText);
    }
}
