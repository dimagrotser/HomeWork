package com.automated.test.pages.popup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PopupPageSteps {

    private PopupPage popupPage;

    public PopupPageSteps() {
        this.popupPage = new PopupPage();
    }

    @Then("popup element is displayed")
    public void popupElementIsDisplayed() {
        popupPage.checkPopUpDisplay();
    }

    @And("user closed the popup")
    public void userClosedThePopup() {
        popupPage.closePopUp();
    }
}
