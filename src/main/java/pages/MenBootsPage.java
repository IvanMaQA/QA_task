package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenBootsPage extends BasePage{
    public MenBootsPage(WebDriver driver) {
        super(driver);
    }

    By navigateToHuntingBootButtonBy = By.xpath(".//*[contains(@src,'https://i.etsystatic.com/16033912/r/il/e0442f/3358562002/il_300x300.3358562002_pywt.jpg')]");

    public void navigateToHuntingBootsCategory(){
        clickElement(navigateToHuntingBootButtonBy);
    }

}
