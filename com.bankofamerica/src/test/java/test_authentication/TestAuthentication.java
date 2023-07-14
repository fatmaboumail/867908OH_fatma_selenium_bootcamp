package test_authentication;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestAuthentication extends BasePage {
    @Test( priority = 1)
    public void testNavigationToApplication(){
        HomePage homePage=new HomePage();
        Assert.assertTrue(isElementVisible(homePage.FDICDataTable));
    }
}
