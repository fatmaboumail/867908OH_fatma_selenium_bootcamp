package test_homepage;

import base.BasePage;
import home_page.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;
import serch_resultpage.SearchResultPage;

import static org.testng.Assert.assertTrue;

public class TestHomePage extends BasePage {
    @Test
    public void testNavigationToApplication(){
        HomePage homePage=new HomePage();
        Assert.assertTrue(isElementVisible(homePage.logo));
    }}

