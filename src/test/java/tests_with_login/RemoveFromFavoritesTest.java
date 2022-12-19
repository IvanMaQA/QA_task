package tests_with_login;

import org.testng.annotations.Test;
import pages.ClocksPage;
import pages.FavoritesPage;
import pages.UserLoggedInPage;

public class RemoveFromFavoritesTest extends BaseTestWIthLogin{

    @Test

    public void removeItemFromFavorites() {
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        userLoggedInPage.navigateToClocks();
        ClocksPage clocksPage = new ClocksPage(driver);
        clocksPage.searchAndSelectClock("40", "105", "CA");
        clocksPage.addProductToFavorites();
        FavoritesPage favoritesPage = new FavoritesPage(driver);
        favoritesPage.removeFromFavorites();
        try {
            favoritesPage.verifyRemove("Nothing to see here yet");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
