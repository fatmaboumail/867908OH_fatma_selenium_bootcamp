package searchbar;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchBar extends BasePage {
    public SearchBar() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//td[@class=\"gh-td gh-sch-btn\"]")
    public WebElement textSearchTerm;





}