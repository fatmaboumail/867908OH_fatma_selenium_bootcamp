package home_page;

import authentication_page.SignInPage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import account_settingpage.AccountSettingPage;


public class HomePage extends BasePage {
    @FindBy(xpath = "//a[@title='Sign Up']")
    public WebElement signupButton;

    @FindBy(xpath = "//div[@id='username']/button/span")
    public WebElement loggedInUsername;
    @FindBy(xpath = "//span[.='Nancy']")
    public WebElement userName;
    @FindBy(xpath = "//a[.='Sign In']")
    public WebElement signInLink;



    public HomePage() {

        PageFactory.initElements(driver, this);
    }




    public SignInPage clickOnSignInLink() {
        safeClickOnElement(signInLink);
        return new SignInPage();
    }


}













