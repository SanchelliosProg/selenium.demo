package com.sanchellios.selenium.demo.definitions;

import com.sanchellios.selenium.demo.pages.RadioButtonPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static com.sanchellios.selenium.demo.SeleniumWebDriverContext.getInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RadioButtonDefs {
    private RadioButtonPage page;

    public RadioButtonDefs() {
        this.page = PageFactory.initElements(getInstance().getWebDriver(), RadioButtonPage.class);
        page.navigateTo();
    }

    @When("select {string} radio-button")
    public void select_radio_button(String radioButtonName) {
        switch (radioButtonName) {
            case "Male":
                page.selectSimpleMaleRadio();
                break;
            case "Female":
                page.selectSimpleFemaleRadio();
                break;
            default:
                throw new IllegalArgumentException(radioButtonName + "is not supported in test");
        }
    }

    @When("click {string} button")
    public void click_button(String button) {
        switch (button) {
            case "Get Checked value":
                page.clickGetCheckedValueButton();
                break;
            case "Get values":
                page.clickGetValuesButton();
                break;
            default:
                throw new IllegalArgumentException(button + " is not supported in test");
        }
    }

    @Then("label with text {string} should appear")
    public void label_with_text_should_appear(String expectedText) {
        String actualText = page.getTextOfRadioButtonDemoLabel();
        assertThat(actualText, equalTo(expectedText));
    }

    @When("select sex: {string} radio-button")
    public void select_sex_radio_button(String sexButton) {
        switch (sexButton) {
            case "Male":
                page.clickMaleSexButton();
                break;
            case "Female":
                page.clickFemaleSexButton();
                break;
            default:
                throw new IllegalArgumentException(sexButton + " is not supported");
        }
    }

    @When("select age group: {string}")
    public void select_age_group(String ageGroupRadioButton) {
        switch (ageGroupRadioButton) {
            case "0 to 5":
                page.clickRadio0to5();
                break;
            case "5 to 15":
                page.clickRadio5to15();
                break;
            case "15 to 50":
                page.clickRadio15to50();
                break;
            default:
                throw new IllegalArgumentException("No such an age group: " + ageGroupRadioButton);
        }
    }

    @Then("result label contains text: {string}")
    public void first_line_of_result_contains_text(String expectedText) {
        String actualText = page.getResultLabelText();
        assertThat(actualText, equalTo(expectedText));
    }

}
