package com.sanchellios.selenium.demo.pages;

import com.sanchellios.selenium.demo.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static com.sanchellios.selenium.demo.InputFormSubmitPageLocators.*;

public class InputFormSubmitPage extends Page {

    @FindBy(css = FIRST_NAME_FIELD_CSS)
    WebElement firstNameField;

    @FindBy(css = LAST_NAME_FIELD_CSS)
    WebElement lastNameField;

    @FindBy(css = EMAIL_FIELD_CSS)
    WebElement emailField;

    @FindBy(css = PHONE_FIELD_CSS)
    WebElement phoneField;

    @FindBy(css = ADDRESS_FIELD_CSS)
    WebElement addressField;

    @FindBy(css = CITY_FIELD_CSS)
    WebElement cityField;

    @FindBy(css = ZIP_CODE_FIELD_CSS)
    WebElement zipCodeField;

    @FindBy(css = WEBSITE_DOMAIN_NAME_FIELD_CSS)
    WebElement websiteField;

    @FindBy(css = POST_DESCRIPTION_FIELD)
    WebElement descriptionField;

    @FindBy(css = HOSTING_YES_RADIO_BUTTON)
    WebElement hostigYesRadioButton;

    @FindBy(css = HOSTING_NO_RADIO_BUTTON)
    WebElement hostingNoRadioButton;

    @FindBy(css = STATE_SELECT_CSS)
    WebElement stateSelectElement;

    @FindBy(css = SEND_BUTTON_CSS)
    WebElement sendButton;

    public InputFormSubmitPage(WebDriver driver) {
        super(driver);
        navigateTo();
    }

    @Override
    public void navigateTo() {
        driver.get(Urls.INPUT_FROM_SUBMIT_PAGE_URL);
    }

    public boolean isFormEmpty() {

        if(!isFieldEmpty(firstNameField)) return false;

        if(!isFieldEmpty(lastNameField)) return false;

        if(!isFieldEmpty(emailField)) return false;

        if(!isFieldEmpty(phoneField)) return false;

        if(!isFieldEmpty(addressField)) return false;

        if(!isFieldEmpty(cityField)) return false;

        if(!isFieldEmpty(zipCodeField)) return false;

        if(!isFieldEmpty(websiteField)) return false;

        if(!(new Select(stateSelectElement).getAllSelectedOptions().get(0).getText().equals("Please select your state"))) return false;

        if(hostigYesRadioButton.isSelected()) return false;

        if(hostingNoRadioButton.isSelected()) return false;

        if(!isFieldEmpty(descriptionField)) return false;

        return true;
    }


    public void fillFirstNameField(String name) {
        firstNameField.sendKeys(name);
    }

    public void fillLastNameField(String name) {
        lastNameField.sendKeys(name);
    }

    public void fillEmailField(String email) {
        emailField.sendKeys(email);
    }

    public void fillPhoneField(String phone) {
        phoneField.sendKeys(phone);
    }

    public void fillAddressField(String address) {
        addressField.sendKeys(address);
    }

    public void fillCityField(String city) {
        cityField.sendKeys(city);
    }

    public void fillZipCodeField(String zip) {
        zipCodeField.sendKeys(zip);
    }
    public void fillWebsiteField(String website) {
        websiteField.sendKeys(website);
    }

    public void fillPostDescriptionField(String description) {
        descriptionField.sendKeys(description);
    }

    public void checkYesRadioButton() {
        hostigYesRadioButton.click();
    }

    public void checkNoRadioButton() {
        hostingNoRadioButton.click();
    }

    public void selectState(String state) {
        new Select(stateSelectElement).selectByVisibleText(state);
    }

    public void clickSubmitButton() {
        sendButton.click();
    }

    private boolean isFieldEmpty(WebElement field) {
        return field.getText().equals("");
    }
}
