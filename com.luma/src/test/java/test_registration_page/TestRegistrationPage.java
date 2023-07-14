package test_registration_page;

import authentication_page.LoginPageWithValidCredential;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import registration_page.RegistrationPage;


@Test
public class TestRegistrationPage extends BasePage {

        @Test
        public void testRegistration(){
            RegistrationPage registrationPage;
            LoginPageWithValidCredential loginPageWithValidCredential=new LoginPageWithValidCredential();

            registrationPage= new RegistrationPage();

            String firstName= "Fatma";
            String lastName ="Boumail";
            String email="sarafaty07@gmail.com";
            String password="Fatma2023";

            registrationPage.doRegistration(firstName,lastName,email,password);

            Assert.assertTrue(isElementVisible(loginPageWithValidCredential.loginLink));

        }
    }


