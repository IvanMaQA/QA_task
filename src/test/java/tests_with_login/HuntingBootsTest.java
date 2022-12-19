package tests_with_login;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.HuntingBootsPage;
import pages.MenBootsPage;
import pages.UserLoggedInPage;

public class HuntingBootsTest extends BaseTestWIthLogin{

    @Test
    public void huntingBoots() {
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        userLoggedInPage.navigateToMenBoots();
        MenBootsPage menBootsPage = new MenBootsPage(driver);
        menBootsPage.navigateToHuntingBootsCategory();
        HuntingBootsPage hbp = new HuntingBootsPage(driver);
        try {
            hbp.verifySuccessOpenOfHuntingBootsPage("All Filters");
        }catch (Exception e) {
            e.printStackTrace();
        }
        }
}
