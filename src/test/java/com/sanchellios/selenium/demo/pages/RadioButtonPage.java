package com.sanchellios.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage extends Page {

    @FindBy(css = "input[value=Male][name=optradio]")
    WebElement maleRadioSimple;

    @FindBy(css = "input[value=Female][name=optradio]")
    WebElement femaleRadioSimple;

    @FindBy(css = "button#buttoncheck")
    WebElement getCheckedValueButton;

    @FindBy(css = "div.panel-body > button")
    WebElement getValuesButton;

    @FindBy(css = "p.radiobutton")
    WebElement radioButtonDemoLabel;

    @FindBy(css = "input[name=gender][value=Male]")
    WebElement maleSexButton;

    @FindBy(css = "input[name=gender][value=Female]")
    WebElement femaleSexButton;

    @FindBy(css = "input[name=ageGroup][value='0 - 5']")
    WebElement radio0to5;

    @FindBy(css = "input[name=ageGroup][value='5 - 15']")
    WebElement radio5to15;

    @FindBy(css = "input[name=ageGroup][value='15 - 50']")
    WebElement radio15to50;

    @FindBy(css = "p.groupradiobutton")
    WebElement resultLabel;

    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void navigateTo() {
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
    }

    public void selectSimpleMaleRadio() {
        maleRadioSimple.click();
    }

    public void selectSimpleFemaleRadio() {
        femaleRadioSimple.click();
    }

    public void clickGetCheckedValueButton() {
        getCheckedValueButton.click();
    }

    public void clickGetValuesButton() {
        getValuesButton.click();
    }

    public void clickMaleSexButton() {
        maleSexButton.click();
    }

    public void clickFemaleSexButton() {
        femaleSexButton.click();
    }

    public void clickRadio0to5() {
        radio0to5.click();
    }

    public void clickRadio5to15() {
        radio5to15.click();
    }

    public void clickRadio15to50() {
        radio15to50.click();
    }

    public String getTextOfRadioButtonDemoLabel() {
        return radioButtonDemoLabel.getText();
    }

    public String getResultLabelText() {
        return resultLabel.getText();
    }
}
