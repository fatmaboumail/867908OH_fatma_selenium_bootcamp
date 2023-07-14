package createanaccount;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import welcompage.WelcomePage;

import javax.naming.Name;

public class CreateAnAccount extends BasePage {


    @FindBy(id = "//a[@id=\"create-account-link\"]")
    public WebElement CreateAccountButton;
    @FindBy(id = "//input[@id=\"firstname\"]")
    public WebElement inputFirstname;
    @FindBy(id = "//input[@id=\"lastname\"]")
    public WebElement inputLastname;
    @FindBy(id = "//input[@id=\"Email\"]")
    public WebElement inputEmail;
    @FindBy(id = "//input[@id=\"password\"]")
    public WebElement inputPassword;
    @FindBy(id = "//button[@id=\"EMAIL_REG_FORM_SUBMIT\"]")
    public WebElement SubmitButton;
    @FindBy(id = "//button[@id=\"gh-ug\"]")
    public WebElement visibleName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public CreateAnAccount() {
        PageFactory.initElements(driver, this);
    }
    public void clickOnCreateAccountButton(){safeClickOnElement(CreateAccountButton);}
    public void  enterFirstName(String FirstName){sendKeysToElement(inputFirstname,FirstName);}
    public void enterLastName(String LastName){sendKeysToElement(inputLastname,LastName);}

    public void enterEmailAddress(String email){sendKeysToElement(inputEmail,email);
    }
    public void enterPassword(String Password){
        sendKeysToElement(inputPassword, Password);
    }
    public void clickOnSubmitButton(){
        safeClickOnElement(SubmitButton);
    }

public  WelcomePage doRegistration (String FirstName,String LastName, String Email, String Password){

    enterFirstName("Fatma");
    enterLastName("Boumail");
    enterEmailAddress("sarafaty07@gmail.com");
    enterPassword("Sara1994");
    return new WelcomePage();


}






    }

