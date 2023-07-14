package test_authentication;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestLogIn extends BasePage {
    @Test(priority = 1, dataProvider = "testLogInDataProvider")
    public void testUserSignIn(String email, String password) {

        HomePage homePage = new HomePage();
        homePage.doSignIn(email, password);
        Assert.assertTrue(isElementVisible(homePage.logInButton));

    }

    @DataProvider(name = "testLogInDataProvider")
    public String[][] testLogInDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data1.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSignIn");
        return data;

    }
}



