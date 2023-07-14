package test_searchlocation;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import storeslocation.StoresLocation;
import utils.ExcelData;

public class TestSearchLocation extends BasePage {
    @Test( dataProvider = "findStoresDataProvider")

    public void testFindStores(String zipCode)  {
        HomePage homePage = new HomePage();
        StoresLocation storesLocation = homePage.clickOnStoreLink();
        storesLocation.doFindStores(zipCode);


        Assert.assertTrue(isElementVisible(storesLocation.searchResultTitle));

    }

    @DataProvider(name = "findStoresDataProvider")
    public String[][] searchDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSearch");
        return data;

    }
}
