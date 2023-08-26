package test_signinpage;

import authentication_page.LoginPageWithInvalidCredentials;
import authentication_page.LoginPageWithValidCredential;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import signin_page.SignInPage;
import utils.ExcelData;

public class TestSignInPage extends BasePage {
    @Test(priority = 1)
    public void testSignInWithValidCretedentials() {
        SignInPage signInPage = new SignInPage();
        LoginPageWithValidCredential loginPage = new LoginPageWithValidCredential();
        String validEmail = "sarafaty07@gmail.com";
        String validPassword = "Fatma2023";
        loginPage.getLoginPage(validEmail, validPassword);
        Assert.assertTrue(isElementVisible(loginPage.resultLoginMessage));


    }

    @Test(priority = 2)
    public void testloginWithInvalidCredentials() {
        LoginPageWithInvalidCredentials loginPage = new LoginPageWithInvalidCredentials();
        String invalidEmail = "safartahayha@gamil.com";
        String invalidPassword = "sara2023";
        loginPage.getLogIn(invalidEmail, invalidPassword);
        Assert.assertTrue(isElementVisible(loginPage.errorMessageLogin));
    }

    @Test(priority = 3, dataProvider = "loginDataProvider")
    public void testlogin(String validEmail, String validPassword) {
        LoginPageWithValidCredential loginPage = new LoginPageWithValidCredential();
        loginPage.getLoginPage(validEmail, validPassword);
        Assert.assertTrue(isElementVisible(loginPage.resultLoginMessage));
    }

    @DataProvider(name = "loginDataProvider")
    public Object[][] loginDataProvider() {
        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data2.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doLoginInPage");
        return data;

    }







}
