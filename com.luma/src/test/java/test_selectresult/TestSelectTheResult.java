package test_selectresult;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelectTheResult extends BasePage {
    @Test
    public void testCategoryResult() {
        HomePage homepage = new HomePage();
        homepage.doSelect();
        Assert.assertTrue(isElementVisible(homepage.categoryJacketResult));
    }
}
