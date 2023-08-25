package home_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resultpage.ResultPage;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[@class=\"topBarLogo\"]")
    public WebElement logo;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }


    public WebElement getLogo() {
        return logo;
    }

    @FindBy(xpath = "//*[@id=\"userAccount\"]/div/a[1]")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@id='loginFormUser_email']")
    public WebElement emailInputField;
    @FindBy(xpath = "//input[@id='loginForm_password']")
    public WebElement passwordInputField;
    @FindBy(xpath = "//div[@id='signup']/a[.='Sign In']")
    public WebElement sigInButton;
    @FindBy(xpath = "//span[@class='myAccount topBarText']")
    public WebElement userName;
    @FindBy(xpath = "//input[@class='searchText arial_12 lightgrayFont js-main-search-bar']")
    public WebElement searchBar;

    @FindBy(xpath = "//label[@class='searchGlassIcon js-magnifying-glass-icon']")
    public WebElement searchIcon;
    @FindBy(xpath = "//div[@class='js-section-wrapper searchSection allSection']/div[@class='resultsSum']")
    public WebElement resultsSum;

    @FindBy(xpath = "//span[@class='myAccount topBarText']")
    public WebElement myNameTopBarText;
    @FindBy(xpath = "//a[normalize-space()='Sign out']")
    public WebElement signOutButton;

    @FindBy(xpath = "//a[@href='//www.investing.com/charts/']")
    public WebElement chartsLink;
    @FindBy(xpath = "//a[.='Futures Chart']")
    public WebElement futureChartsButton;


    public void clickOnLoginLink() {
        safeClickOnElement(loginLink);

    }

    public void enterEmailAddress(String emailAddress) {
        safeClickOnElement(emailInputField);

        sendKeysToElement(emailInputField, emailAddress);
    }

    public void enterPassword(String password) {
        sendKeysToElement(passwordInputField, password);
    }

    public void clickSignIn() {
        safeClickOnElement(sigInButton);
    }

    public void doSignIn(String emailAddress, String password) {
        clickOnLoginLink();
        enterEmailAddress("sarafaty07@gmail.com");
        enterPassword("Sara07071994");
        clickSignIn();
    }

    public void enterSearch(String searchTerm) {
        sendKeysToElement(searchBar, searchTerm);
    }

    public void clickOnSearchIcon() {
        safeClickOnElement(searchIcon);
    }

    public ResultPage doSearch(String searchTerm) {
        enterSearch(searchTerm);
        clickOnSearchIcon();
        return new ResultPage();
    }

    public void hoverOverMyNameText() {
        hoverOverElement(myNameTopBarText);
    }

    public void clickOnSignOutButton() {
        safeClickOnElement(signOutButton);
    }

    public void doSignOut() {
        hoverOverMyNameText();
        clickOnSignOutButton();
    }

    public void clickOnChartsLink() {
        safeClickOnElement(chartsLink);
    }




}



