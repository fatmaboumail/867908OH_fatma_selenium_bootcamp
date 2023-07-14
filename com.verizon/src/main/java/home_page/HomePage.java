package home_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import searchpage.SearchPage;
import storeslocation.StoresLocation;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[@class=\"gnav20-logoWhiteBg\"]")
    public WebElement logo;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }


    public WebElement getLogo() {
        return logo;
    }

    @FindBy(xpath = "//button[@id='gnav20-search-icon']")
    public WebElement searchButton;
    @FindBy(xpath = "//div[@class='gnav20-row-one opacityOne']//a[contains(.,'Stores')]")
    public WebElement storesLink;

    public SearchPage clickOnSearchButton(){
        safeClickOnElement(searchButton);
        return new SearchPage();
    }

    public StoresLocation clickOnStoreLink(){
        safeClickOnElement(storesLink);
        return new StoresLocation();
    }


}




