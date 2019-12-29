package com.sanchellios.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleInputPage {

    private WebDriver driver;

    @FindBy(css = "input#user-message")
    WebElement singleInput;

    @FindBy(css = "form#get-input button.btn.btn-default")
    WebElement showMessageButton;

    @FindBy(css = "#user-message #display")
    WebElement yourMessageLabel;

    @FindBy(css = "input#sum1")
    WebElement aInput;

    @FindBy(css = "input#sum2")
    WebElement bInput;

    @FindBy(css = "form#gettotal button")
    WebElement getTotalButton;

    @FindBy(css = "span#displayvalue")
    WebElement totalResultLabel;

    public SimpleInputPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterTextToSingleInput(String input) {
        singleInput.sendKeys(input);
    }

    public void clickShowMessageButton() {
        showMessageButton.click();
    }

    public String scanSingleMessageLabel() {
        return yourMessageLabel.getText();
    }

    public void passInputA(Object number) {
        aInput.sendKeys(number.toString());
    }

    public void passInputB(Object number) {
        bInput.sendKeys(number.toString());
    }

    public void clickGetTotalButton() {
        getTotalButton.click();
    }

    public String getTotalResult() {
        return totalResultLabel.getText();
    }

}
