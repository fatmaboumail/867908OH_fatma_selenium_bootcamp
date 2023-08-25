package home_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import searchresultpage.SearchResult;

public class HomePage extends BasePage {


    @FindBy (xpath = "//a[@href='https://magento.softwaretestingboard.com/']")
       public WebElement logo;

    @FindBy (xpath = "//input[@id='search']")
    public WebElement inputSearchBar;

    @FindBy(xpath = "//button[@class='action search']")
    public WebElement buttonActionSearch;


    @FindBy(xpath = "//span[.='Women']")
    public WebElement womenButton;
    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/women/tops-women.html']")
    public WebElement topsButton;
    @FindBy(xpath = "//div[.='Category']")
    public WebElement categoryButton;
    @FindBy(xpath = " //*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a")
    public WebElement jacketButton ;
    @FindBy(xpath = "//div[@class='filter-current']//li[@class='item']")
    public WebElement categoryJacketResult;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement inputValidEmailField;
    @FindBy(xpath = "//span[.='Subscribe']")
    public WebElement subscribeButton;
    @FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement confirmSubscriptionMessage;





    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    // single responsibility methods
    public void inputSearchTerm(String searchTerm){
        clearSendKeysToElement(inputSearchBar,searchTerm);
    }
    public void clickActionSearchButton(){
        safeClickOnElement(buttonActionSearch);
    }



    public void clickOnWomenButton(){
        hoverOverElement(womenButton);
    }
    public void clickOnTopsButton(){
        safeClickOnElement(topsButton);
    }
    public void clickOnCategoryButton(){
        safeClickOnElement(categoryButton);
    }
    public void clickOnJacketsButton(){
        safeClickOnElement(jacketButton);
    }

    public void doSelect(){
        clickOnWomenButton();
        clickOnTopsButton();
        clickOnCategoryButton();
        clickOnJacketsButton();

    }
    public void getInputEmail(String email){
        sendKeysToElement(inputValidEmailField, email);
    }
    public void clickOnSubscribeButton(){
        safeClickOnElement(subscribeButton);
    }

    public void DoSubscribe(String email){
        getInputEmail(email);
        clickOnSubscribeButton();
    }




    public SearchResult doSearch(String searchTerm) {
        inputSearchTerm(searchTerm);
        clickActionSearchButton();
        return new SearchResult();
    }









}


