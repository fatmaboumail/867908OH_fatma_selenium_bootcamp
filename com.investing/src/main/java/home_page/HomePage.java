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



    @FindBy(xpath = "//input[@class='searchText arial_12 lightgrayFont js-main-search-bar']")
    public WebElement searchBar;

    @FindBy(xpath = "//label[@class='searchGlassIcon js-magnifying-glass-icon']")
    public WebElement searchIcon;
    @FindBy(xpath = "//div[@class='js-section-wrapper searchSection allSection']/div[@class='resultsSum']")
    public WebElement resultsItem;



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




}



