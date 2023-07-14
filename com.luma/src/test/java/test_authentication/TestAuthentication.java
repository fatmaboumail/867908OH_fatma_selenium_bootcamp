package test_authentication;

import authentication_page.LoginPageWithInvalidCredentials;
import authentication_page.LoginPageWithValidCredential;
import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {

    @Test(priority = 1)
    public void testNavigationToApplication() {
        HomePage homepage = new HomePage();

        Assert.assertTrue(isElementVisible(homepage.logo));


    }

    @Test(priority = 2)
    public void testLoginWithValidCredentials() {

        LoginPageWithValidCredential logInPage = new LoginPageWithValidCredential();
        String validEmail = "sarafaty07@gmail.com";
        String validPassword = "Fatma2023";
        logInPage.getLoginPage(validEmail, validPassword);
        Assert.assertTrue(isElementVisible(logInPage.resultLoginMessage));
    }

    @Test(priority = 3)
    public void testLoginWithInvalidCredentials() {
        LoginPageWithInvalidCredentials loginPageWithInvalidCredentials = new LoginPageWithInvalidCredentials();
        String invalidEmail = "nor@gmail.com";
        String invalidPassword = "saha2019";
        loginPageWithInvalidCredentials.getLogIn(invalidEmail, invalidPassword);
        Assert.assertTrue(isElementVisible(loginPageWithInvalidCredentials.errorMessageLogin));
    }


    @Test(priority = 4,dataProvider = "loginDataProvider")
            public void testLogin(String validEmail,String validPassword){
        HomePage homePage=new HomePage();
        LoginPageWithValidCredential loginPage=new LoginPageWithValidCredential();
        loginPage.getLoginPage(validEmail,validPassword);
        Assert.assertTrue(isElementVisible(loginPage.resultLoginMessage));
    }


    @DataProvider(name = "loginDataProvider")
    public Object[][] loginDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data1.xlsx";

        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSignIn");
        return data;
    }

    }