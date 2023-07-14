package search_apartments;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchApartments extends BasePage {
    public SearchApartments(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//input[@id='quickSearchLookup']")
    public WebElement searchBar;
    @FindBy(xpath="//span[.='Search']")
    public WebElement searchButton;


    public void enterSearchTerm(String searchTerm){
        sendKeysToElement(searchBar, searchTerm);
    }

    public void  clickOnSearchButton(){
        safeClickOnElement(searchButton);

    }

    public SearchResult searchTerm(String searchTerm){
        enterSearchTerm(searchTerm);
        clickOnSearchButton();
        return new SearchResult();

    }
}
