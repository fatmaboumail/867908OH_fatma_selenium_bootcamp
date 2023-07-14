package search_apartments;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResult extends BasePage {
    public SearchResult(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[@id='rentRangeLink']//i[@class='storyicon down2StoryIcon']")
    public WebElement priceDropDown;

    @FindBy(xpath="//ul[@class='minRentOptions js-minRentOptions active']/li[@class='active']")
    public WebElement noMinOption;
    @FindBy(xpath="//input[@id='max-input']")
    public WebElement maxRentButton;

    @FindBy(xpath="//ul[@id='maxRentOptions']/li[.='$1,800']")
    public WebElement maxRentSelected;
    @FindBy(xpath="//span[.='< $1.8k']")
    public WebElement searchResult;

    @FindBy(xpath="//div[@id='placardContainer']//li[1]//a[@href='javascript:void(0);']")
    public WebElement heartIcon1;
    @FindBy(xpath="//div[@id='placardContainer']//li[2]//a[@href='javascript:void(0);']")
    public WebElement heartIcon2;
    @FindBy(xpath="//div[@id='notificationsFavorites']/i[@class='storyicon favoriteOutlineStoryIcon']")
    public WebElement favoriteSection;
    @FindBy(xpath="//div[@id='notificationsFavorites']/span[@class='label']")
    public WebElement favoriteResult;



    public void clickOnPriceDropDown(){
        safeClickOnElement(priceDropDown);
    }
    public void clickOnNoMinOption(){
        safeClickOnElement(noMinOption);
    }

    public void clickOnMaxRentButton(){
        safeClickOnElement(maxRentButton);
    }
    public void clickOnMaxRentSelected(){
        safeClickOnElement(maxRentSelected);
    }

    public  SearchResult doSearch(){
        clickOnPriceDropDown();
        clickOnNoMinOption();
        clickOnMaxRentButton();
        clickOnMaxRentSelected();
        return new SearchResult();
    }}



