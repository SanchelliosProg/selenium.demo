package com.sanchellios.selenium.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverContext {

    private static Logger log = LogManager.getLogger(SeleniumWebDriverContext.class);

    private static SeleniumWebDriverContext instance;

    private WebDriver webDriver;

    private SeleniumWebDriverContext() {
         this.webDriver = new ChromeDriver();
    }

    public static SeleniumWebDriverContext getInstance() {
        if (instance == null) {
            log.info("Going to initialize ");
            instance = new SeleniumWebDriverContext();
        }
        return instance;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
