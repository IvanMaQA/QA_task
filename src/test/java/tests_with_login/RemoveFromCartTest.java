package tests_with_login;

import org.testng.annotations.Test;
import pages.BookBundlePage;
import pages.UserLoggedInPage;
import pages.VintagePage;
import pages.YourCartPage;

import java.awt.*;

public class RemoveFromCartTest extends BaseTestWIthLogin{

    @Test

    public void removeProductFromCart() {

        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        userLoggedInPage.navigateToVintageCategory();
        VintagePage vintagePage = new VintagePage(driver);
        vintagePage.searchProduct("9", "50","NZ");
        vintagePage.selectProduct();
        BookBundlePage bookBundlePage = new BookBundlePage(driver);
        bookBundlePage.addBundleToCart();
        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.removeFromCart();
        try {
            yourCartPage.verifyRemove("Your cart is empty.");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
