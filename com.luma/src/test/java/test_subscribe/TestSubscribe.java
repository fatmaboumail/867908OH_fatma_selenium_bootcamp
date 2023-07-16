package test_subscribe;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSubscribe extends BasePage {
    @Test
    public void testSubscribe(){
        HomePage homepage= new HomePage();
        String email="sarafaty07@gmail.com";
        homepage.DoSubscribe(email);

        Assert.assertTrue(isElementVisible(homepage.confirmSubscriptionMessage));
    }
}

