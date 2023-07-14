package home_page;

import base.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import serch_resultpage.SearchResultPage;

import javax.naming.directory.SearchResult;

public class HomePage extends BasePage {
    @FindBy(xpath = "//img[@id=\"gh-logo\"]")
    public WebElement logo;


    @FindBy (xpath = "//input[@class=\"gh-tb ui-autocomplete-input\"]")
    public WebElement inputSearchBar;

    @FindBy (xpath = "//td[@class=\"gh-td gh-sch-btn\"]")
    public WebElement buttonSearchSubmit;
    @FindBy(xpath = "//span[@id=\"gh-ug\"]")
    public WebElement SignInButton;

    @FindBy(xpath = "//input[@id=\"pass\"]")
    public WebElement inputPassword;
    @FindBy(xpath = "//button[@id=\"sgnBt\"]")
    public WebElement SignButton;
    @FindBy(xpath = "//button[@id='gh-ug']")
    public WebElement welcomeUserDropdown;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    public void inputSearchTerm(String searchTerm) {
        clearSendKeysToElement(inputSearchBar, searchTerm);
    }

    public void clickSearchSubmitButton() {
        clickOnElement(buttonSearchSubmit);
    }
    public void clickSignInButton(){clickOnElement(SignInButton);}
    public void inputPassword(String Password){clearSendKeysToElement(inputPassword,Password);}
    public void clickOnSignButton(){clickOnElement(SignButton);}


    public SearchResultPage doSearch(String searchTerm) {
        inputSearchTerm(searchTerm);
        clickSearchSubmitButton();
        return new SearchResultPage();
    }




    }
