package com.sanchellios.selenium.demo.definitions;

import com.sanchellios.selenium.demo.SeleniumWebDriverContext;
import com.sanchellios.selenium.demo.pages.AjaxFormSubmitPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class AjaxFormSubmitDefs {

    private AjaxFormSubmitPage page;
    private Logger log = LogManager.getLogger(AjaxFormSubmitDefs.class);

    public AjaxFormSubmitDefs() {
        this.page = PageFactory.initElements(SeleniumWebDriverContext.getInstance().getWebDriver(), AjaxFormSubmitPage.class);
    }

    @Given("name field is filled with name {string}")
    public void name_field_is_filled_with_name(String name) {
        page.fillNameField(name);
    }

    @When("click submit button")
    public void click_submit_button() {
        page.clickSubmitButton();
    }

    @Then("form is submitted and label Form submited Successfully! appears")
    public void form_is_submitted_and_label_Form_submited_Successfully_appears() {
        assertThat(page.isSubmitControlLabelVisible(), equalTo(true));
    }

    @Given("nothing is written to the fields of the form")
    public void nothing_is_written_to_the_fields_of_the_form() {
        log.debug("We are going to just to skip entering any data to the field NAME");
    }

    @Then("name field becomes red")
    public void name_field_becomes_red() {
        assertThat(page.isNameFieldRed(), equalTo(true));
    }

    @Then("submit button is not visible")
    public void submit_button_is_not_visible() {
        assertThat(page.isSubmitButtonVisible(), equalTo(false));
    }
}
