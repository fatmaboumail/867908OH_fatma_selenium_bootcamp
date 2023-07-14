package test_account_sittingpage;

import account_settingpage.AccountSettingPage;
import authentication_page.SignInPage;
import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAccountSittingPage extends BasePage {

    @Test(priority = 1, groups = {"BAT"})
    public void testAccountSettings() {
        HomePage homePage = new HomePage();
        SignInPage signInPage = new SignInPage();
        AccountSettingPage accountSettingPage = new AccountSettingPage();
        Assert.assertTrue(isElementVisible(homePage.signInLink));

    }

}

