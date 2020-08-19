package com.automated.test.pages.result;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ResultPageSteps {

    private ResultPage resultPage;

    public ResultPageSteps() {
        this.resultPage = new ResultPage();
    }

    @And("select Dress")
    public void selectDress() {
        resultPage.setDress();
    }

    @And("click the filter")
    public void clickTheFilter() {
        this.resultPage.clickShopBtn();
    }

    @And("sort by Price Low to High")
    public void sortBy() throws InterruptedException {
        this.resultPage.sortBy();
    }

    @And("set the filter")
    public void setTheFilter() {
        this.resultPage.goToFilter();
    }


    @Then("validate that sum price of result not more than {string} dollar")
    public void validateThatSumPriceOfResultNotMoreThanDollar(String expectedValue) throws InterruptedException {
        List<Double> listOfResults = this.resultPage.getListResult();
        Assert.assertTrue("The actual value more than expected value" , this.resultPage.getSum(expectedValue, listOfResults));
    }
}
