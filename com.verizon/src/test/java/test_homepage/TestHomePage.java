package test_homepage;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {
    @Test
    public void testNavigationToApplication(){
        HomePage homePage=new HomePage();
        Assert.assertTrue(homePage.isElementVisible(homePage.getLogo()));
    }
}

