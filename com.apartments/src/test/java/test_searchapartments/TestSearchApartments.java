package test_searchapartments;

import authentication_page.SignInPage;
import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import search_apartments.SearchApartments;
import search_apartments.SearchResult;
import utils.ExcelData;

public class TestSearchApartments extends BasePage {
    @Test(dataProvider = "searchDataProvider")

    public void testDoSearch(String searchTerm){
        HomePage homePage = new HomePage();
        SignInPage signInPage = new SignInPage();
        SearchApartments searchPage= new SearchApartments();
        SearchResult searchResult= new SearchResult();

        homePage.clickOnSignInLink();
        String email="sarafaty07@gmail.com";
        String password="Sara1994";

        signInPage.doSignIn(email,password);

        searchPage.searchTerm(searchTerm);
        searchResult.doSearch();


        Assert.assertTrue(isElementVisible(searchResult.favoriteSection));

    }
    @DataProvider(name="searchDataProvider")
    public Object[][] searchDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data1.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSearch");
        return data;

    }}
