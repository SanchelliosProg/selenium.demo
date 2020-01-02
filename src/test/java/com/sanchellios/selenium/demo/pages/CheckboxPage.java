package com.sanchellios.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckboxPage extends Page {
    private final String URL = "https://www.seleniumeasy.com/test/basic-checkbox-demo.html";

    @FindBy(css = "input#isAgeSelected")
    WebElement singleCheckBox;

    @FindBy(xpath = "//label[text()[contains(.,'Click on this')]]")
    WebElement singleBoxLabel;

    @FindBy(css = "div#txtAge")
    WebElement singleBoxText;

    @FindBy(css = "input#check1")
    WebElement multiCheckboxButton;

    @FindAll({
            @FindBy(css = "div.checkbox:nth-child(3) label input"),
            @FindBy(css = "div.checkbox:nth-child(4) label input"),
            @FindBy(css = "div.checkbox:nth-child(5) label input"),
            @FindBy(css = "div.checkbox:nth-child(6) label input")
    })
    List<WebElement> checkboxes;

    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void navigateTo() {
        driver.get(URL);
    }

    public void clickOnSingleCheckBox() {
        singleCheckBox.click();
    }

    public void clickOnSingleBoxLabel() {
        singleBoxLabel.click();
    }

    public void clickOnMultiCheckboxButton() {
        multiCheckboxButton.click();
    }

    public String getTextOfSingleBoxText() {
        return singleBoxText.getText();
    }

    public boolean isSingleCheckboxSelected() {
        return singleCheckBox.isSelected();
    }

    public boolean isSingleBoxTextIsVisible() {
        return singleBoxText.isDisplayed();
    }

    public boolean isGroupOfBoxesChecked() {

        for (WebElement e : checkboxes) {
            if(!e.isSelected()){
                return false;
            }
        }

        return true;
    }

    public String getTextValueOfButton() {
        return multiCheckboxButton.getAttribute("value");
    }

}
