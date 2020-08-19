package com.automated.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/automated/test/HomeWork.feature"},
        plugin = {"pretty",
                "json:target/cucumber_json_reports/home-page.json",
                "html:target/home-page-html"},
                glue = {"com.automated.test.infrastructure.driver",
                "com.automated.test.pages.home",
                "com.automated.test.pages.currency",
                "com.automated.test.pages.popup",
                "com.automated.test.pages.result"})
public class HomeWorkTest {

}
