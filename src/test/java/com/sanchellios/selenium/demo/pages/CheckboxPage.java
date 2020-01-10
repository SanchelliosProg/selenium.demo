package com.sanchellios.selenium.demo.pages;

import com.sanchellios.selenium.demo.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.sanchellios.selenium.demo.CheckBoxPageLocators.*;

public class CheckboxPage extends Page {

    @FindBy(css = SINGLE_CHECK_BOX_CSS)
    WebElement singleCheckBox;

    @FindBy(css = SINGLE_BOX_TEXT_CSS)
    WebElement singleBoxText;

    @FindBy(css = MULTI_CHECK_BOX_BUTTON_CSS)
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
        driver.get(Urls.CHECKBOX_PAGE_URL);
    }

    public void clickOnSingleCheckBox() {
        singleCheckBox.click();
    }

    public void clickOnSingleBoxLabel() {
        findByXpath(SINGLE_BOX_LABEL_XPATH).click();
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
