package com.sanchellios.selenium.demo.pages;

import com.sanchellios.selenium.demo.Urls;
import org.openqa.selenium.WebDriver;

import static com.sanchellios.selenium.demo.RadioButtonPageLocators.*;

public class RadioButtonPage extends Page {

    public RadioButtonPage(WebDriver driver) {
        super(driver);
        navigateTo();
    }

    @Override
    public void navigateTo() {
        driver.get(Urls.RADIO_BUTTON_PAGE_URL);
    }

    public void selectSimpleMaleRadio() {
        findByCss(MALE_RADIO_SIMPLE_CSS).click();
    }

    public void selectSimpleFemaleRadio() {
        findByCss(FEMALE_RADIO_SIMPLE_CSS).click();
    }

    public void clickGetCheckedValueButton() {
        findByCss(GET_CHECKED_VALUE_BUTTON_CSS).click();
    }

    public void clickGetValuesButton() {
        findByCss(GET_VALUES_BUTTON).click();
    }

    public void clickMaleSexButton() {
        findByCss(MALE_SEX_BUTTON_CSS).click();
    }

    public void clickFemaleSexButton() {
        findByCss(FEMALE_SEX_BUTTON_CSS).click();
    }

    public void clickRadio0to5() {
        findByCss(RADIO_0_TO_5_CSS).click();
    }

    public void clickRadio5to15() {
        findByCss(RADIO_5_TO_15_CSS).click();
    }

    public void clickRadio15to50() {
        findByCss(RADIO_15_TO_50_CSS).click();
    }

    public String getTextOfRadioButtonDemoLabel() {
        return findByCss(RADIO_BUTTON_DEMO_LABEL_CSS).getText();
    }

    public String getResultLabelText() {
        return findByCss(RESULT_LABEL_CSS).getText();
    }
}
