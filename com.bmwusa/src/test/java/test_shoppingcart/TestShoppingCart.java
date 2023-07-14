package test_shoppingcart;

import autentication.DashboardPage;
import autentication.LoginPage;
import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import shopping_page.ShoppingPage;

public class TestShoppingCart extends BasePage {
    @Test
    public void testShoppingCart()  {

        HomePage homePage = new HomePage();
    LoginPage loginPage = homePage.clickOnLogInLink();
    String email = "sarafaty07@gmail.com";
    String password = "Sara07071994@";
    DashboardPage dashboardPage = loginPage.doSign(email, password);
    ShoppingPage shoppingPage =dashboardPage.switchToNewTab();
    shoppingPage.doShop();

        Assert.assertTrue(isElementVisible(shoppingPage.descriptiveAccessory));
}
}
