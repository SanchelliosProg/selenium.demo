package com.sanchellios.selenium.demo.pages;

import com.sanchellios.selenium.demo.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.sanchellios.selenium.demo.AjaxFormSubmitPageLocators.*;

public class AjaxFormSubmitPage extends Page {

    private final String invalidNameFieldStyle = "border: 1px solid rgb(255, 0, 0);";

    @FindBy(css = SUBMIT_BUTTON_CSS)
    WebElement submitButton;

    @FindBy(css = NAME_FIELD_CSS)
    WebElement nameField;

    public AjaxFormSubmitPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void navigateTo() {
        driver.get(Urls.AJAX_FORM_SUBMIT_URL);
    }

    public void fillNameField(String name) {
        nameField.sendKeys(name);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean isSubmitControlLabelVisible() {
        return findElementByCss(SUBMIT_CONTROL_LABEL_CSS).isDisplayed();
    }

    public boolean isSubmitButtonVisible() {

        try {
            return findElementByCss(SUBMIT_BUTTON_CSS).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean isNameFieldRed() {
        if (nameField.getAttribute("style").equals(invalidNameFieldStyle)) {
            return true;
        } else {
            return false;
        }
    }
}
