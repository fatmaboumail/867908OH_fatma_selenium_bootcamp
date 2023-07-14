package testsearchcontact;

import base.BasePage;
import create_contact_page.ContactPage;
import dashboard_page.DashboardPage;
import home_page.HomePage;
import loginpage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestSearchContact extends BasePage {
    @Test(dataProvider = "searchContactsDataProvider")

    public void testSearchContacts(String value){
        HomePage homePage = new HomePage();
        LoginPage logInPage=homePage.clickOnLoginButton();
        String email="sarafaty07@gmail.com";
        String password="Sara1994";
        DashboardPage dashboardPage =logInPage.doLogin(email,password);
        Assert.assertTrue(isElementVisible(dashboardPage.userName));
        ContactPage contactPage= dashboardPage.clickOnContactsIcon();
        contactPage.doFilterSearchInContacts(value);
        Assert.assertTrue(isElementVisible(contactPage.filterApplied));

    }
    @DataProvider(name="searchContactsDataProvider")
    public String[][] contactsDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data1.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("searchContact");
        return data;

    }
}

