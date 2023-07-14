package serch_resultpage;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage {
    @FindBy(xpath = "//a[@id=\"ui-id-18\"]")
    public WebElement textSearchTerm;

    @FindBy (xpath = "//h1[@class='srp-controls__count-heading']")
    public WebElement resultsNumber;
    public SearchResultPage() {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getSearchResults() {
        return driver.findElements(By.xpath("//a[@id=\"ui-id-18\"]"));


    }




}
