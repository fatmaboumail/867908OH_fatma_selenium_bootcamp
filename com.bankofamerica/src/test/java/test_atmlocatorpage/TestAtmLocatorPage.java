package test_atmlocatorpage;

import atm_locatorpage.AtmLocatorPage;
import bankofamericapage.BankOfAmericaPage;
import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAtmLocatorPage extends BasePage {
    @Test(priority = 1, dataProvider = "searchatmlocatordataprovider")

    public void testSearchAtmLocator(String zip) {

        HomePage homePage = new HomePage();
        BankOfAmericaPage bankOfAmericaPage = new BankOfAmericaPage();
        AtmLocatorPage atmLocatorPage = new AtmLocatorPage();

        bankOfAmericaPage.clickOnAtmButton();
        atmLocatorPage.searchForAtm(zip);
        Assert.assertTrue(isElementVisible(atmLocatorPage.resultForATM));
    }


    @DataProvider(name = "searchatmlocatordataprovider")
    public String[][] atmLocatorDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("test_data");
        return data;

    }

    @Test(priority = 2, dataProvider = "searchinvalidatmlocatordataprovider")
    public void testInvalidSearchAtmLocator(String zip) {

        HomePage homePage = new HomePage();
        BankOfAmericaPage bankOfAmericaPage = new BankOfAmericaPage();
        AtmLocatorPage atmLocatorPage = new AtmLocatorPage();

        bankOfAmericaPage.clickOnAtmButton();
        atmLocatorPage.searchForAtm(zip);
        Assert.assertTrue(isElementVisible(atmLocatorPage.resultForATM));
    }


    @DataProvider(name = "searchinvalidatmlocatordataprovider")
    public String[][] atmInvalidLocatorDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("test_data");
        return data;
    }
}



