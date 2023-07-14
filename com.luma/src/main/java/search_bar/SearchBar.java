package search_bar;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchBar extends BasePage {

    @FindBy(xpath = "//span[@class='base']")
    public WebElement textSearchTerm;

    @FindBy(xpath = "//div[@class='message notice']/div[contains(.,'Your search returned no results.')]")
    public WebElement resultInvalidSearchTerm;
    public SearchBar(){
        PageFactory.initElements(driver,this);

    }
    public List<WebElement> getResultPage(){
        return driver.findElements(By.xpath("//div[@class='search results']"));

    }
}