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


}



