package test_authentication;

import base.BasePage;
import home_page.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage{
    @Test( priority = 1)
    public void testNavigationToApplication(){
        HomePage homePage=new HomePage();
        Assert.assertTrue(isElementVisible(homePage.getLogo()));
    }
    @Test(priority = 2)
    public void testLogin(String email,String password){
        HomePage homePage = new HomePage();
        homePage.doSignIn(email, password);


        Assert.assertTrue(isElementVisible(homePage.userName));
    }

    @Test(priority = 3)
    public void testLogout(String email,String password){
        HomePage homePage = new HomePage();
        homePage.doSignIn(email, password);
        homePage.doSignOut();
        Assert.assertTrue(isElementVisible(homePage.loginLink));
    }
}



