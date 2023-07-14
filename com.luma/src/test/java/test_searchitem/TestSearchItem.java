package test_searchitem;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import searchresultpage.SearchResult;
import utils.ExcelData;

public class TestSearchItem extends BasePage {

    @Test( dataProvider = "searchDataProvider")
    public void testDoSearch(String searchTerm) {
        HomePage homepage = new HomePage();
        SearchResult searchResultsPage = new SearchResult();
        homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultsPage.textSearchTerm));

    }

    @DataProvider(name = "searchDataProvider")
    public String[][] searchDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSearch");
        return data;
    }
}
