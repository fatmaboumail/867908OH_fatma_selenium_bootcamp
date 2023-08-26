package signin_page;

import base.BasePage;
import home_page.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {
    public SignInPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[2]/a")
    public WebElement SignInLink;
    @FindBy(xpath = "//input[@id=\"email\"]")
    public  WebElement inputEmail;
    @FindBy(xpath = "//input[@name='login[password]']")
    public  WebElement inputPassword;
    @FindBy(xpath = "//button[@class='action login primary']/span[.='Sign In']")
    public  WebElement SignInButton;
    public void ClickSignInLink(){safeClickOnElement(SignInLink);}
    public void setInputEmail(String validEmail){sendKeysToElement(inputEmail, validEmail);}
    public void setInputPassword(String validPassword){sendKeysToElement(inputPassword,validPassword);}
    public void ClickSignInButton(){safeClickOnElement(SignInButton);}



}
