package confirmation_page;

import base.BasePage;
import home_page.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends BasePage {
    public ConfirmationPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='password']")
    public WebElement inputPasswordBar;

    @FindBy(xpath = "//button[@id='confirm']")
    public WebElement nextButton;

    public void inputPassword(String password){
        sendKeysToElement(inputPasswordBar, password);
    }
    public void clickOnNextButton(){
        safeClickOnElement(nextButton);
    }
    public HomePage confirmPassword(String password){
        inputPassword(password);
        clickOnNextButton();

        return new HomePage();

    }
}

