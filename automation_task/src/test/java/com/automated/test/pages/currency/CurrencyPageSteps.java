package com.automated.test.pages.currency;

import io.cucumber.java.en.And;
import org.junit.Assert;

public class CurrencyPageSteps {

    private CurrencyPage currencyPage;

    public CurrencyPageSteps() {
        this.currencyPage = new CurrencyPage();
    }

//    @And("user change from {string} to {string}")
//    public void userChangeFromTo(String CurrentCurrency, String expectedCurrency) {
//        this.currencyPage.changeCurrency(CurrentCurrency, expectedCurrency);
//    }


    @And("validate the las currency is {string}")
    public void validateTheLasCurrencyIs(String value) throws InterruptedException {
        Assert.assertEquals(value, this.currencyPage.getCurrency());
    }

    @And("user change the currency to {string}")
    public void userChangeTheCurrencyTo(String expectedCurrency) throws InterruptedException {
        this.currencyPage.changeCurrency(expectedCurrency);
    }
}
