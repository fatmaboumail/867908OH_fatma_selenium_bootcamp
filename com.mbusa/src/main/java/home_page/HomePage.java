package home_page;

import base.BasePage;
import loginpage.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class=\"top-bar__logo \"]")
    public WebElement logo;
    public WebElement getLogo() {
        return logo;
    }
    @FindBy(xpath = "//button[contains(@aria-label,'OK')]")
    public WebElement okButton;

    @FindBy(xpath = "//span[@class='global-headerbutton-label global-headerbutton-utility-inner']")
    public WebElement myAccountButton;

    @FindBy(id = "text-zoom-tracker")
    public WebElement iframe;

    @FindBy(xpath = "//button[@class='nav-profilelogin nav-profilebutton button button_primary button--wide ']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='global-headerbutton-label global-headerbutton-utility-inner']")
    public WebElement usernameHeader;
    @FindBy(xpath="//span[.='Find a Dealer']")
    public WebElement findDealer;
    @FindBy(xpath = "//div[@class='form__input form__input--inline']/input[@class='form__input-field form__input-field--can-reset']")
    public WebElement zipCodeInputField;
    @FindBy(xpath = "//button[@class='button button_primary']")
    public WebElement searchButton;

    @FindBy(xpath= "//ul[@class='location-search__list']/li[contains(.,'Philadelphia, PA')]")
    public WebElement firstOption;

    public void clickOnMyAccountButton(){

        safeClickOnElement(myAccountButton);
    }
    public void switchToIframe(){

        driver.switchTo().frame(iframe);
    }
    public void clickOnLoginButton(){
        safeClickOnElement(loginButton);


    }
    public void clickOnOkButton()
    {
        safeClickOnElement(okButton);
    }
    public LoginPage doLogin(){
        getVisibleElement((By) myAccountButton);

        clickOnMyAccountButton();

        clickOnLoginButton();

        return new LoginPage();
    }
   public void clickOnFindDealer(){
        safeClickOnElement(findDealer);
    }
    public void enterZipCode(String zipCode){
        //safeClickOnElement(zipCodeInputField);
        sendKeysToElement(zipCodeInputField,zipCode);
    }
    public void clickOnFirstOption(){
        safeClickOnElement(firstOption);
    }
    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);
    }






}



