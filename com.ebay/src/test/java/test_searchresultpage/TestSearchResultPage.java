package test_searchresultpage;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import serch_resultpage.SearchResultPage;
import utils.ExcelData;

public class TestSearchResultPage extends BasePage {


   @Test( dataProvider = "searchDataProvider")
    public void testDoSearch(String searchTerm) {
        HomePage homepage = new HomePage();
        SearchResultPage searchResultsPage = new SearchResultPage();
        homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultsPage.resultsNumber));

    }

    @DataProvider(name = "searchDataProvider")
    public String[][] searchDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSearch");
        return data;
    }
}





