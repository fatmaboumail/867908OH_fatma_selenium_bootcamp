package test_authentication;

import autentication.DashboardPage;
import autentication.LoginPage;
import autentication.LoginPageWithInvalidCredentials;
import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

import static org.testng.Assert.assertTrue;

public class TestAuthentication extends BasePage {

    @Test(priority = 1, dataProvider = "loginDataProvider")

    public void testLogin(String email, String password) {
        HomePage homePage = new HomePage();

        LoginPage loginPage = homePage.clickOnLogInLink();
        DashboardPage dashboardPage = loginPage.doSign(email, password);
        Assert.assertTrue(isElementVisible(dashboardPage.myAccountButton));


    }

    @DataProvider(name = "loginDataProvider")
    public String[][] loginDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data1.xlsx";

        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSignIn");
        return data;

    }

    @Test(priority = 2)
    public void testSignIn() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.clickOnLogInLink();
        String Email = "sarafaty07@gmail.com";
        String Password = "Sara07071994@";
        DashboardPage dashboardPage = loginPage.doSign(Email, Password);
        Assert.assertTrue(isElementVisible(dashboardPage.myAccountButton));


    }

    @Test(priority = 3)
    public void testSignInWithInvalidCredentials() {
        HomePage homePage=new HomePage();
        LoginPage loginPage=homePage.clickOnLogInLink();

        LoginPageWithInvalidCredentials loginPageWithInvalidCredentials = new LoginPageWithInvalidCredentials();
        String invalidEmail = "nor@gmail.com";
        String invalidPassword = "saha2019";
        loginPageWithInvalidCredentials.doSign(invalidEmail, invalidPassword);
        Assert.assertTrue(isElementVisible(loginPageWithInvalidCredentials.loginButton));
    }
}







