package com.sanchellios.selenium.demo.pages;

import com.sanchellios.selenium.demo.Urls;
import org.openqa.selenium.WebDriver;

import static com.sanchellios.selenium.demo.RadioButtonPageLocators.*;

public class RadioButtonPage extends Page {

    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void navigateTo() {
        driver.get(Urls.RADIO_BUTTON_PAGE_URL);
    }

    public void selectSimpleMaleRadio() {
        findElementByCss(MALE_RADIO_SIMPLE_CSS).click();
    }

    public void selectSimpleFemaleRadio() {
        findElementByCss(FEMALE_RADIO_SIMPLE_CSS).click();
    }

    public void clickGetCheckedValueButton() {
        findElementByCss(GET_CHECKED_VALUE_BUTTON_CSS).click();
    }

    public void clickGetValuesButton() {
        findElementByCss(GET_VALUES_BUTTON).click();
    }

    public void clickMaleSexButton() {
        findElementByCss(MALE_SEX_BUTTON_CSS).click();
    }

    public void clickFemaleSexButton() {
        findElementByCss(FEMALE_SEX_BUTTON_CSS).click();
    }

    public void clickRadio0to5() {
        findElementByCss(RADIO_0_TO_5_CSS).click();
    }

    public void clickRadio5to15() {
        findElementByCss(RADIO_5_TO_15_CSS).click();
    }

    public void clickRadio15to50() {
        findElementByCss(RADIO_15_TO_50_CSS).click();
    }

    public String getTextOfRadioButtonDemoLabel() {
        return findElementByCss(RADIO_BUTTON_DEMO_LABEL_CSS).getText();
    }

    public String getResultLabelText() {
        return findElementByCss(RESULT_LABEL_CSS).getText();
    }
}
