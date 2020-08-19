package com.automated.test.pages.popup;

import com.automated.test.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopupPage extends BasePage {

    PopupPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="globale_popup")
    private WebElement popUp;

    @FindBy(xpath = "//input[@value='המשך לקנות']")
    private WebElement continueBtn;

    public void checkPopUpDisplay() {
        wait.forElementToBeDisplayed(5, this.popUp, "PopUp");
    }

    public void closePopUp() {
        wait.forClickable(continueBtn).click();
    }


}
