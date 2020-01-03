package com.sanchellios.selenium.demo.definitions;

import com.sanchellios.selenium.demo.pages.CheckboxPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import static com.sanchellios.selenium.demo.SeleniumWebDriverContext.getInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CheckboxDefs {
    private Logger log = LogManager.getLogger(CheckboxDefs.class);
    private CheckboxPage page;

    public CheckboxDefs() {
        log.info("Starting the tests of " + CheckboxPage.class);
        this.page = PageFactory.initElements(getInstance().getWebDriver(), CheckboxPage.class);
        page.navigateTo();
    }

    @When("click on single checkbox")
    public void click_on_single_checkbox() {
        page.clickOnSingleCheckBox();
    }

    @When("click on text near single checkbox")
    public void click_on_text_near_single_checkbox() {
        page.clickOnSingleBoxLabel();
    }

    @Then("{string} appears on Single Checkbox Demo")
    public void appears_on_Single_Checkbox_Demo(String expctedLabelText) {
        String actualLabelText = page.getTextOfSingleBoxText();

        assertThat("Single checkbox success-label is not visible", page.isSingleBoxTextIsVisible(), equalTo(true));

        assertThat(String.format("Was expecting %s but received %s", expctedLabelText, actualLabelText),
                actualLabelText,
                equalTo(expctedLabelText));
    }

    @When("click on multi-checkbox-button")
    public void click_on_to_check_all_checkboxes_at_once() {
        page.clickOnMultiCheckboxButton();
    }

    @Then("All checkboxes are {string}")
    public void all_checkboxes_are(String checkBoxStatuses) {
        switch (checkBoxStatuses) {
            case "checked":
                assertThat(page.isGroupOfBoxesChecked(), equalTo(true));
                break;
            case "unchecked":
                assertThat(page.isGroupOfBoxesChecked(), equalTo(false));
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Then("single checkbox is selected")
    public void single_checkbox_is_selected() {
        assertThat(page.isSingleCheckboxSelected(), equalTo(true));
    }

    @Then("Text on a button became {string}")
    public void text_on_a_button_became_UncheckAll(String expectedLabel) {
        assertThat(page.getTextValueOfButton(), equalTo(expectedLabel));
    }
}
