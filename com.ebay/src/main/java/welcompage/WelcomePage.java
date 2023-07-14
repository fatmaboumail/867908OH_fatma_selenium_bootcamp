package welcompage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BasePage {
    public WelcomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="//h1[@id=\"welcome-msg\"]")
    public WebElement welcomepage;

}
