package home_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resultpage.ResultPage;
import searchresultpage.SearchResultPage;
import utils.Database;

public class HomePage extends BasePage {
        public HomePage() {
                PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//a[@id='global-search-trigger']")
        public WebElement searchInput;
        @FindBy(xpath = "//input[@id='global-search-input']")
        public WebElement searchBarInput;
        @FindBy(xpath = "//input[@type='submit']")
        public WebElement searchButton;







        @FindBy(xpath = "//article[@id='sideLogin-left-rail']//button[@class='button-alt med'][normalize-space()='Log In']")
        public WebElement logInButton;


        @FindBy(xpath = "//input[@id=\"InputIdentityFlowValue\"]")
        public WebElement emailAddressTxTInput;

        @FindBy(xpath = "//button[@id='BtnSubmit']\n")
        public WebElement continueButton;

        @FindBy(xpath = "//input[@id=\"InputPassword\"]\n")
        public WebElement passwordTxtInput;
        @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+sitenav_soccer']//span[@class='link-text']")
        public WebElement soccerButton;


        @FindBy(xpath = "//button[@id='BtnSubmit']\n")
        public WebElement passwordSubmitButton;
        @FindBy(xpath ="//*[@id='submenu-button-submenu-sportsactivemenusoccer']")
        public WebElement dropDownSoccerSection;
        @FindBy(xpath ="//span[@class='video-play-button video-play-button--onefeed']")
        public WebElement videoButton;
        @FindBy(xpath ="//*[@id=\"vjs_video_3\"]/div[6]/button[1]")
        public WebElement pauseButton;
        @FindBy(xpath ="//button[@class='vjs-mute-control vjs-control vjs-button vjs-vol-3']")
        public WebElement muteButton;


        public void clickSearchInputButton(){
                safeClickOnElement(searchInput);
        }

        public void inputSearchBar(String searchTerm){
                sendKeysToElement(searchBarInput, searchTerm);
        }

        public void clickSearchButton(){
                safeClickOnElement(searchButton);
        }

        public void searchPlayer(String searchTerm){
                clickSearchInputButton();
                inputSearchBar(searchTerm);
                clickSearchButton();
        }

        public void clickLoginButton(){
                safeClickOnElement(logInButton);
        }



        public void inputEmailAddress(String email){
                driver.switchTo().frame("oneid-iframe");
                sendKeysToElement(emailAddressTxTInput, email);
        }

        public void pressContinueButton(){
                safeClickOnElement(continueButton);
        }

        public void inputPassword(String password){
                sendKeysToElement(passwordTxtInput, password);
        }

        public void pressPasswordSubmitButton(){
                safeClickOnElement(passwordSubmitButton);
        }
        public void hoverOverSoccer(){
                hoverOverElement(soccerButton);
        }
        public void clickOnVideoButton(){
                safeClickOnElement(videoButton);
        }
        public void pauseTheVideo(){
                safeClickOnElement(pauseButton);
        }
        public void muteTheVideo(){
                safeClickOnElement(muteButton);
        }

        public void doPlayVideo(){
                clickOnVideoButton();
                pauseTheVideo();
                muteTheVideo();
        }

        public void doSignIn(String email, String password){
                clickLoginButton();
                inputEmailAddress(email);
                pressContinueButton();
                inputPassword(password);
                pressPasswordSubmitButton();
        }
        public SearchResultPage doSearch(String searchTerm){
                clickSearchButton();

                clickSearchButton();
                return new SearchResultPage();



        }}
