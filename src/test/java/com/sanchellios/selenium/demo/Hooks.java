package com.sanchellios.selenium.demo;

import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void setupTests() {
        SeleniumWebDriverContext.getInstance().getWebDriver().manage().window().maximize();
    }

}
