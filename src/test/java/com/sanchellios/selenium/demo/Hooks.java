package com.sanchellios.selenium.demo;
import cucumber.api.java.Before;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Hooks {

    Logger log = LogManager.getLogger(Hooks.class);

    @Before
    public void setupTests() {
        SeleniumWebDriverContext.getInstance().getWebDriver().manage().window().maximize();
    }

}
