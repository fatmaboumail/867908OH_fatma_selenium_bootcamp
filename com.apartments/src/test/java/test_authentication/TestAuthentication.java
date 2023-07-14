package test_authentication;

import authentication_page.SignInPage;

import base.BasePage;
import home_page.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {
    @Test( priority = 1)
    public void testNavigationToApplication(){
        HomePage homePage=new HomePage();
        Assert.assertTrue(isElementVisible(homePage.signInLink));
    }
    @Test(priority = 2)
    public void testSignIn(){
        HomePage homePage=new HomePage();
        SignInPage signInPage = new SignInPage();
        String email="sarafaty07@gmail.com";
        String password="Sara1994";
        signInPage.doSignIn(email,password);




        Assert.assertTrue(isElementVisible(homePage.loggedInUsername));
    }}




