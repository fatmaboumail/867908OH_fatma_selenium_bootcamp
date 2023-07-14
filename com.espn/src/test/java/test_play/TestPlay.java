package test_play;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPlay extends BasePage {
    @Test
    public void doPlayVideo(){
        HomePage homePage = new HomePage();
        homePage.doPlayVideo();
    Assert.assertTrue(isElementVisible(homePage.videoButton));}


    }
