package test_authentication;

import base.BasePage;
import home_page.HomePage;
import login_page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {

   @Test(priority = 1)

   public void testHomePage() {
       HomePage homePage = new HomePage();
       LoginPage loginPage = new LoginPage();

       Assert.assertTrue(loginPage.isElementVisible(homePage.signInLink));}


   @Test(priority= 2,dataProvider = "LoginDataProvider")

    public void testLogin(String email,String password){
       HomePage homePage = new HomePage();
            LoginPage loginPage = new LoginPage();
       homePage.clickOnSignInLink();
        homePage.clickOnSignIButton1();
       loginPage.doSignIn(email,password);
          }
    @DataProvider(name="loginDataProvider")
    public Object[][] loginDataProvider(){


        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
             ExcelData ex=new ExcelData(path);
       String data[][]=ex.readStringArrays("test_data");
        return data;

   }

}

