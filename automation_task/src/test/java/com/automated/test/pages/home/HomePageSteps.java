package com.automated.test.pages.home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("A user navigates to HomePage")
    public void aUserNavigatesToHomePage() {
        this.homePage.goToHomePage();
    }

    @And("user select the change currency options")
    public void userSelectTheChangeCurrencyOptions() throws InterruptedException {
        this.homePage.goToCurrencyPage();
    }

    @And("user click on new arrivals options")
    public void userClickOnNewArrivalsOptions() throws InterruptedException {
        this.homePage.goToNewArrivalsPage();
    }
}
