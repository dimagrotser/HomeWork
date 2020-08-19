package com.automated.test.pages.result;

import com.automated.test.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ResultPage extends BasePage {

    ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div/div/h2")
    private WebElement filters;

    @FindBy(xpath = "//*[@id='listing-filters']//button[@class='btn js-apply-filters']")
    private WebElement shopBtn;


    @FindBy(linkText = "Dress")
    private WebElement dress;

    @FindBy(xpath = "//div[2]/h2")
    private WebElement sortBy;

    @FindBy(xpath = "//*[@id=\"listing-filters--sort-by\"]//*[@title=\"Price Low to High\"]")
    private WebElement price;

    @FindBy(xpath = "//*[@class='pricing__price pricing__price--new']")
    private List<WebElement> result;


    public void goToFilter() {
        wait.forClickable(this.filters).click();
    }

    public void setDress() {
        wait.forClickable(this.dress).click();
    }


    public void clickShopBtn() {
        wait.forClickable(this.shopBtn).click();
    }

    public void sortBy() throws InterruptedException {
        Thread.sleep(10000);
        wait.forClickable(this.sortBy).click();
        Thread.sleep(10000);
        wait.forClickable(this.price).click();
    }

    public List<Double> getListResult() throws InterruptedException {
        Thread.sleep(10000);
        List<Double> temp = new ArrayList<>();
        this.result.forEach(e -> temp.add(Double.parseDouble(e.getText()
                .replace("$", "")
                .replace("\u200C", ""))));
        return temp;

    }

    public Boolean getSum(String expectedValue, List<Double> actualValue) {
        Double sum = actualValue.stream().reduce(0.0, Double::sum);
        return Double.parseDouble(expectedValue) >= sum;
    }

}
