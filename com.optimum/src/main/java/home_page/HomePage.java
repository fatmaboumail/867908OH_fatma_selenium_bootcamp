package home_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@class=\"site-logo\"]")
    public WebElement logo;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }


    public WebElement getLogo() {
        return logo;
    }
}


