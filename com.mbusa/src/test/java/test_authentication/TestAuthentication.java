package test_authentication;

import base.BasePage;
import confirmation_page.ConfirmationPage;
import home_page.HomePage;
import loginpage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {
    @Test(priority = 1,dataProvider = "loginDataProvider")
    public void testLogin(String email, String password) {
        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.doLogin();
        ConfirmationPage confirmationPage = loginPage.confirmEmail(email);
        confirmationPage.confirmPassword(password);
        Assert.assertTrue(loginPage.isElementVisible(confirmationPage.nextButton));

    }

    @DataProvider(name = "loginDataProvider")
    public String[][] loginDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSignIn");
        return data;

    }

    @Test(priority = 2)
    public void testLogin() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.doLogin();
        ConfirmationPage confirmationPage = new ConfirmationPage();
        homePage.doLogin();
        String email = "sarafaty07@gmail.com";
        String password = "Sara07071994@";
        Assert.assertTrue(loginPage.isElementVisible(confirmationPage.nextButton));

    }
}

