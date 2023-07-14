package test_search;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import searchpage.ResultSearch;
import searchpage.SearchPage;
import utils.ExcelData;

public class TestSearchPhones extends BasePage {
    @Test(dataProvider = "searchDataProvider")

    public void testSearch(String searchTerm){
        HomePage homePage = new HomePage();
        SearchPage searchPage= homePage.clickOnSearchButton();
        ResultSearch resultSearchPage=searchPage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(resultSearchPage.resultNumber));

    }

    @DataProvider(name = "searchDataProvider")
    public String[][] searchDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data1.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("SearchPhones");
        return data;

    }
}

