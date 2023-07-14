package test_selectedpage;

import base.BasePage;
import home_page.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selectedpage.SelectedPage;

public class TestSelectedPage extends BasePage {
    @Test
    public void testSelectedPage() {
        HomePage homePage = new HomePage();
        SelectedPage selectedPage= homePage.clickOnVehicleModel();


        Assert.assertTrue(isElementVisible(homePage.logInLink));

    }}
