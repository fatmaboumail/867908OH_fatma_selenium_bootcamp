package searchlocation;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchLocation extends BasePage {
    public SearchLocation(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@id='content']/div[2]//div[@class='form__radio-indicator']")
    public WebElement collisionCenterRadioButton;
    @FindBy(xpath = "//button[@class='select-control__combobox']")
    public WebElement collisionCenterResult;




    public void clickOnCollisionCenter(){
        boolean isSelected= collisionCenterRadioButton.isSelected();
        safeClickOnElement(collisionCenterRadioButton);
    }


}
