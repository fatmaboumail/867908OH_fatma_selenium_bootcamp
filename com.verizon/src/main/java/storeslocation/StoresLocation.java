package storeslocation;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoresLocation extends BasePage {
    public StoresLocation() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='u-flex u-flexColumn--md u-flexColumn--xs']/a[@href='javascript:void(0)']")
    public WebElement useMyLocationLink;
    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchInputField;
    @FindBy(css = ".react-autosuggest__suggestion--first > #resultListId")
    public WebElement matchingSearchOption;



    @FindBy(xpath = "//*[@id=\"slSearch-TitleId\"]")
    public WebElement searchResultTitle;

    public void clickOnUseMyLocation(){
        safeClickOnElement(useMyLocationLink);
    }



    public void  enterZipCode(String zipCode) {
        sendKeysToElement(searchInputField, zipCode);
        searchInputField.click();

    }


    public void clickOnMatchingOption(){
        safeClickOnElement(matchingSearchOption);

    }
    public StoresResult doFindStores(String zipCode){
        clickOnUseMyLocation();
        enterZipCode(zipCode);
        clickOnMatchingOption();
        return new StoresResult();


    }
}

