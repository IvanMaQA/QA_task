package tests_with_login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utilities.PropertyManager;

public class BaseTestWIthLogin {
    WebDriver driver;
    @BeforeMethod
    public void setChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications", "--start-maximized"));
        driver.get("https://www.etsy.com/");
        /*public void setOpera(){
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver(new OperaOptions().addArguments("--disable-notifications", "--start-maximized"));
            driver.get("https://www.etsy.com/");*/


        HomePage homePage = new HomePage(driver);
        homePage.login(PropertyManager.getInstance().getGoodEmail(),
                       PropertyManager.getInstance().getGoodPassword());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
