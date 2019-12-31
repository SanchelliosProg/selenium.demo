package com.sanchellios.selenium.demo.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckboxDefs {
    @When("click on single checkbox")
    public void click_on_single_checkbox() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("{string} appears on Single Checkbox Demo")
    public void appears_on_Single_Checkbox_Demo(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("click on {string} to check all checkboxes at once")
    public void click_on_to_check_all_checkboxes_at_once(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("All checkboxes are {string}")
    public void all_checkboxes_are(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
