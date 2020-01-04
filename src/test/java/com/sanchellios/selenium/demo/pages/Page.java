package com.sanchellios.selenium.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page {
    WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public abstract void navigateTo();

    protected WebElement findByCss(String cssSelector) {
        return driver.findElement(By.cssSelector(cssSelector));
    }

    protected WebElement findByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }
}
