package com.sanchellios.selenium.demo.pages;

import org.openqa.selenium.WebDriver;

public abstract class Page {
    WebDriver driver;

    Page(WebDriver driver) {
        this.driver = driver;
    }

    public abstract void navigateTo();
}
