package com.sanchellios.selenium.demo.definitions;

import com.sanchellios.selenium.demo.pages.InputFormSubmitPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

import static com.sanchellios.selenium.demo.SeleniumWebDriverContext.getInstance;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class InputFormSubmitDefs {

    private InputFormSubmitPage page;

    public InputFormSubmitDefs() {
        this.page = PageFactory.initElements(getInstance().getWebDriver(), InputFormSubmitPage.class);
    }

    @Given("fill form with data")
    public void fill_form_with_data(Map<String, String> dataTable) {
        System.out.println(dataTable);
        page.fillFirstNameField(dataTable.get("First Name"));
        page.fillLastNameField(dataTable.get("Last Name"));
        page.fillEmailField(dataTable.get("email"));
        page.fillPhoneField(dataTable.get("phone"));
        page.fillAddressField(dataTable.get("address"));
        page.fillCityField(dataTable.get("City"));
        page.selectState(dataTable.get("State"));
        page.fillZipCodeField(dataTable.get("Zip"));
        page.fillWebsiteField(dataTable.get("Website of domain name"));

        boolean isHosted = Boolean.parseBoolean(dataTable.get("Hosting"));
        if (isHosted) {
            page.checkYesRadioButton();
        } else {
            page.checkNoRadioButton();
        }

        page.fillPostDescriptionField(dataTable.get("Project Description"));
    }

    @When("press the Send button")
    public void press_the_Send_button() {
        page.clickSubmitButton();
    }

    @Then("all the form becomes empty")
    public void all_the_form_becomes_empty() {
        assertThat(page.isFormEmpty(), equalTo(true));
    }
}
