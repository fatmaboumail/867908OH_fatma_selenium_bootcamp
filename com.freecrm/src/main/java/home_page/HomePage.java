package home_page;

import base.BasePage;
import loginpage.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(xpath = "//span[.='Log In']")
    public WebElement loginButton;

    public HomePage() { PageFactory.initElements(driver,this);


        }
        public LoginPage clickOnLoginButton() {

            safeClickOnElement(loginButton);
            return new LoginPage();
        }

    }









