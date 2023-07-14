package test_authentication;

import base.BasePage;
import dashboard_page.DashboardPage;
import home_page.HomePage;
import loginpage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {
    @Test(priority= 1,dataProvider = "loginDataProvider")

    public void testLogin(String email,String pass){
        HomePage homePage = new HomePage();
        LoginPage logInPage=homePage.clickOnLoginButton();
        DashboardPage dashboardUserPage =logInPage.doLogin(email, pass);
        Assert.assertTrue(isElementVisible(dashboardUserPage.userName));

    }
    @DataProvider(name="loginDataProvider")
    public String[][] loginDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }

    @Test(priority = 2, dataProvider = "logOutDataProvider")

    public void testLogOut(String email,String pass){
        HomePage homePage= new HomePage();
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardUserPage=new DashboardPage();

        homePage.clickOnLoginButton();


        loginPage.doLogin(email,pass);
        dashboardUserPage.doLogOut();

        Assert.assertTrue(isElementVisible(loginPage.LoginButton));
    }
    @DataProvider(name="logOutDataProvider")
    public String[][] logOutDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }

}

