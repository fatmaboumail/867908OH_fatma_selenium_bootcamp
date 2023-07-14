package test_location;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import searchlocation.SearchLocation;
import utils.ExcelData;

public class TestLocation extends BasePage {
    @Test(dataProvider = "SearchLocationDataProvider")
    public void testSearchLocation(String zipCode){
        HomePage homePage=new HomePage();
        SearchLocation searchPage= homePage.doSearch(zipCode);
        searchPage.clickOnCollisionCenter();
        Assert.assertTrue(isElementVisible(searchPage.collisionCenterResult));
    }
    @DataProvider(name = "SearchLocationDataProvider")
    public Object[][] SearchLocationDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data1.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSearch");
        return data;

    }

}
