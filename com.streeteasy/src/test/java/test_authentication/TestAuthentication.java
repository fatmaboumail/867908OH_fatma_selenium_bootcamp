package test_authentication;

import base.BasePage;

import homepage.HomePage;
import login_page.LogInPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {
    @Test(priority = 1)
    public void TestHomePage (String email, String password) {
        HomePage homePage = new HomePage();
        Assert.assertTrue(isElementVisible(homePage.marketDataButton));


    }
    @Test(priority = 2, dataProvider = "loginDataProvider")
    public void testLogin(String email, String password) {
        HomePage homePage = new HomePage();
        LogInPage logInPage=new LogInPage();
        homePage.doLogin(email, password);
        Assert.assertTrue(isElementVisible(logInPage.WelcomeBackText()));


    }


    @DataProvider(name = "loginDataProvider")
    public String[][] loginDataProvider() {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSignIn");
        return data;
    }

    @Test(priority = 3)
    public void testLogIn(){
        HomePage homePage=new HomePage();
        LogInPage logInPage=new LogInPage();

         String email="sarafaty07@gmail.com";
         String password="Sara07071994@";
         homePage.doLogin(email,password);
         Assert.assertTrue(isElementVisible(logInPage.WelcomeBackText()));

    }
}





