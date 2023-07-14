package registration_page;

import autentication.LoginPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage {
    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id=\"custom-select-plus-salutation\"]")
    public WebElement SituationButton;
    @FindBy(xpath = "//input[@id=\"firstName\"]")
    public WebElement firstNameInputField;
    @FindBy(xpath = "//input[@id=\"lastName\"]")
    public WebElement lstNameInputField;


    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInputField;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputField;
    @FindBy(xpath = "//span[@class=\"checkbox__mark __b\"]")
    public WebElement checkBoxButton;

    @FindBy(xpath = "//button[@class='custom-button __b primary']")
    public WebElement loginButton;

    public void clickOnSituationButton() {
        safeClickOnElement(SituationButton);
    }

    public void enterFirstName(String FirstName) {
        sendKeysToElement(firstNameInputField, FirstName);
    }

    public void enterLastName(String LastName) {
        sendKeysToElement(lstNameInputField, LastName);
    }

    public void enterEmailAddress(String emailAddress) {
        sendKeysToElement(emailInputField, emailAddress);
    }

    public void enterPassword(String Password) {
        sendKeysToElement(passwordInputField, Password);
    }

    public void clickOnBoxButton() {
        safeClickOnElement(checkBoxButton);
    }

    public void clickOnLoginButton() {
        safeClickOnElement(loginButton);
    }

    public LoginPage doRegister(String FirstName, String LastName, String Email, String Password) {
        clickOnSituationButton();
        enterFirstName(FirstName);
        enterLastName(LastName);
        enterEmailAddress(Email);
        enterPassword(Password);
        clickOnBoxButton();
        clickOnLoginButton();
        return new LoginPage();
    }
}


