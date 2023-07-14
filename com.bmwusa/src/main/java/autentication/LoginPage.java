package autentication;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@id=\"wrapper\"]")
    public WebElement registerSpace;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInputField;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//button[@class='custom-button __b primary']")
    public WebElement loginButton;

    public void clickOnRegisterSpace(){safeClickOnElement(registerSpace);}
    public void enterEmailAddress(String emailAddress){
        sendKeysToElement(emailInputField,emailAddress);
    }
    public void enterPassword(String Password){
        sendKeysToElement(passwordInputField, Password);
    }
    public void clickOnLoginButton(){
        safeClickOnElement(loginButton);
    }
    public DashboardPage doSign(String emailAddress,String password){
        clickOnRegisterSpace();
        enterEmailAddress(emailAddress);
        enterPassword(password);
        clickOnLoginButton();
        return new DashboardPage();
    }


}


