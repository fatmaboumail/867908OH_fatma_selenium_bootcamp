package test_contactus_page;

import base.BasePage;
import contact_us_page.ContactUsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class TestContactUsPage extends BasePage {
    public void testContactUs(){
        ContactUsPage contactUsPage= new ContactUsPage();
        String name= "Fatma";
        String email="sarafaty07@gmail.com";
        String phoneNumber= "1234567890";
        String comment= "Thank You ";
        contactUsPage.doContactUs(name,email,phoneNumber,comment);

        Assert.assertTrue(isElementVisible(contactUsPage.thankYouForContactingUsMessage));
    }
}
