package test_addtocart;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import searchpage.ResultSearch;
import searchpage.SearchPage;

public class TestAddToCart extends BasePage {
    @Test
    public void testAddToCart() {
        HomePage homePage = new HomePage();
        SearchPage searchPage = homePage.clickOnSearchButton();
        String searchTerm="Samsung";
         ResultSearch resultSearch = searchPage.doSearch(searchTerm);
        resultSearch.doSorting();
        String zipCode="43035";
        searchPage.doAddToCart(zipCode);
        Assert.assertTrue(isElementVisible(searchPage.confirmationText));

    }
}
