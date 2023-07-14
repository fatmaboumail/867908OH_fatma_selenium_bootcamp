package testsearch;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resultpage.ResultPage;
import searchresultpage.SearchResultPage;
import utils.ExcelData;

public class TestSearch extends BasePage {
    @Test(priority = 1,dataProvider = "SearchDataProvider")
    public void testSearch(String searchTerm) {
        HomePage homePage = new HomePage();
       SearchResultPage searchResultPage = homePage.doSearch(searchTerm);


        Assert.assertTrue(isElementVisible(searchResultPage.searchResult));
    }
    @DataProvider(name = "SearchDataProvider")
    public String[][] searchDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("test_data");
        return data;


}
    @Test(priority = 2)
    public void testSearch() {
        HomePage homePage = new HomePage();
        ResultPage resultPage = new ResultPage();
        String searchTerm = "Tom Braddy";
        homePage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(resultPage.TopResult));
    }

}
