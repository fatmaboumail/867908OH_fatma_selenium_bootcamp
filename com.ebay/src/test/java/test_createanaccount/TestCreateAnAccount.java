package test_createanaccount;

import base.BasePage;
import com.beust.ah.A;
import createanaccount.CreateAnAccount;
import home_page.HomePage;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import welcompage.WelcomePage;

public class TestCreateAnAccount extends BasePage {
    @Test
            public void testCreateAccount() {


        HomePage homePage = new HomePage();

        WelcomePage welcomePage=new WelcomePage();
    CreateAnAccount createAnAccount=new CreateAnAccount();
    Assert.assertTrue(isElementVisible(homePage.SignInButton));

    }
}

