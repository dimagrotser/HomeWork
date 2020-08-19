package com.automated.test.pages.base;

import com.automated.test.infrastructure.driver.Setup;
import com.automated.test.infrastructure.driver.Wait;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }
}
