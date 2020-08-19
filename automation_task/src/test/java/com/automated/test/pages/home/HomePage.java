package com.automated.test.pages.home;

import com.automated.test.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = "https://www.wooloverslondon.com/";


    @FindBy(xpath = "//span/span")
    private WebElement countrySelection;

    @FindBy(xpath = "/html/body/header")
    private WebElement header;

    @FindBy(xpath = "//*[@class=\"dropdown hasSubmenu New Arrivals\"]")
    private WebElement newArrivals;


    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToHomePage() {
        driver.get(HOME_PAGE_URL);
        wait.forLoading(5);
    }

    void goToCurrencyPage() throws InterruptedException {
        Thread.sleep(10000);
        this.countrySelection.click();
    }

    void goToNewArrivalsPage() throws InterruptedException {
        Thread.sleep(10000);
        this.newArrivals.click();
    }


}
