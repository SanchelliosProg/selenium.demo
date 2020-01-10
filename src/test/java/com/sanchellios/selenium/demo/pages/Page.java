package com.sanchellios.selenium.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class Page {
    WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
        navigateTo();
    }

    public abstract void navigateTo();

    protected WebElement findElementByCss(String cssSelector) {
        return driver.findElement(By.cssSelector(cssSelector));
    }

    protected List<WebElement> findElementsByCss(String cssSelector) {
        return driver.findElements(By.cssSelector(cssSelector));
    }

    protected WebElement findByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }
}
