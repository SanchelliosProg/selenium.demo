package com.sanchellios.selenium.demo;
import cucumber.api.java.Before;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Hooks {

    Logger log = LogManager.getLogger(Hooks.class);


    @Before("@simple-form")
    public void goToPage() {
        log.info("Going to page with Simple forms via HOOK");
        SeleniumWebDriverContext.getInstance().getWebDriver().get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }


}
