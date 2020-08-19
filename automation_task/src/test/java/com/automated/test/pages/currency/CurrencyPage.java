package com.automated.test.pages.currency;

import com.automated.test.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CurrencyPage extends BasePage {

    CurrencyPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "gle_selectedCurrency")
    private WebElement currencyElement;

    @FindBy(xpath = "//*[@class=\"glDefaultBtn glCancelBtn\"]")
    private WebElement safeBtn;

    public void changeCurrency(String expectedCurrency) throws InterruptedException {
        Thread.sleep(10000);
        new Select(this.currencyElement).selectByVisibleText(expectedCurrency);
        wait.forClickable(safeBtn).click();
    }

    public String getCurrency() throws InterruptedException {
        Thread.sleep(10000);
        return currencyElement.getAttribute("value");
    }
}
