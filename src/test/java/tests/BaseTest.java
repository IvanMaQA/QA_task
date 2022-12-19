package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest  {
    WebDriver driver;
    @BeforeMethod
    public void setChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications", "--start-maximized"));
        driver.get("https://www.etsy.com/");
    }

    /*public void setOpera(){
        WebDriverManager.operadriver().setup();
        driver = new OperaDriver(new OperaOptions().addArguments("--disable-notifications", "--start-maximized"));
        driver.get("https://www.etsy.com/");
    }*/

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
