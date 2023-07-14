package test_resultpage;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resultpage.ResultPage;
import utils.ExcelData;

public class TestResultPage extends BasePage {

    @Test(dataProvider = "testSearchDataProvider")

    public void testSearchDataProvider(String searchTerm){

        HomePage homePage=new HomePage();
        ResultPage resultPage= homePage.doSearch(searchTerm);

        Assert.assertTrue(isElementVisible(resultPage.resultsSum));
    }
    @DataProvider(name="testSearchDataProvider")
    public Object [][] testSearchDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("test_data");
        return data;

    }

}
