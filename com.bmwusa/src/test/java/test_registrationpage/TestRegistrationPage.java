package test_registrationpage;

import autentication.DashboardPage;
import autentication.LoginPage;
import base.BasePage;
import home_page.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.serviceworker.model.RegistrationID;
import org.testng.Assert;
import org.testng.annotations.Test;
import registration_page.RegistrationPage;

import static org.testng.Assert.*;

public class TestRegistrationPage extends BasePage {
    @Test
  public void testRegister()  {
      HomePage homePage=new HomePage();

      RegistrationPage registrationPage=new RegistrationPage();
      String FirstName="Fatma";
      String LastName="Boumail";
      String EmailAddress="sarafaty07@gmail.com";
      String Password="Sara07071994@";
      LoginPage loginPage=registrationPage.doRegister(FirstName,LastName,EmailAddress,Password);
     Assert.assertTrue(isElementVisible(registrationPage.loginButton));









  }
}
