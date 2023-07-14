package login_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {
    public LogInPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class=\"styled__ModalContent-sc-16frzwi-16 cPPJgE\"]")
    WebElement WelcomeBackText;
    public WebElement WelcomeBackText(){return WelcomeBackText ;}
}
