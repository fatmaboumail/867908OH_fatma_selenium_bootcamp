package home_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

        @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+sitenav_tennis']//span[@class='link-text']")
        public WebElement tennisButton;



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
        public void hoverOverTennis(){
                hoverOverElement(tennisButton);
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
        }}




