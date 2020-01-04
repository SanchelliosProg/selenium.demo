package com.sanchellios.selenium.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/sanchellios/selenium/demo/features"},
        plugin = {"pretty"}
        , tags = {"@input-form"}
        )
public class RunCucumberTest {
    private static Logger log = LogManager.getLogger();

    @AfterClass
    public static void closeDriver() {
        log.info("Going to close WebDriver via Hook");
        SeleniumWebDriverContext.getInstance().getWebDriver().close();
    }
}
