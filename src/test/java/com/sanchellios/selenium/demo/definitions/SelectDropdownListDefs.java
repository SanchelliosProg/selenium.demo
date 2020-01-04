package com.sanchellios.selenium.demo.definitions;

import com.sanchellios.selenium.demo.pages.SelectDropdownPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import static com.sanchellios.selenium.demo.SeleniumWebDriverContext.getInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SelectDropdownListDefs {
    private Logger log = LogManager.getLogger(SelectDropdownListDefs.class);
    private SelectDropdownPage page;

    public SelectDropdownListDefs() {
        this.page = PageFactory.initElements(getInstance().getWebDriver(), SelectDropdownPage.class);
    }

    @When("select a day: {string}")
    public void select_a_day(String day) {
        page.selectDay(day);
    }

    @Then("label with text {string} appears")
    public void label_with_text_appears(String expectedText) {
        assertThat(page.getTextOfSelectedValueLabel(), equalTo(expectedText));
    }

    @Given("nothing is selected")
    public void nothing_is_selected() {
        log.debug("No city was selected on the page " + page.PAGE_NAME);
    }

    @When("press {string} button")
    public void press_button(String buttonName) {
        switch (buttonName) {
            case "First Selected":
                page.pressFirstSelectedButton();
                break;
            case "Get All Selected":
                page.pressGetAllSelectedButton();
                break;
            default:
                throw new IllegalArgumentException(buttonName + " is not supported");
        }
    }

    @Then("text {string} appears")
    public void text_appears(String expectedText) {
        assertThat(page.getTextOfMultiSelectedValueLabel(), equalTo(expectedText));
    }

    @Given("select {string}")
    public void select(String state) {
        page.selectState(state);
    }

}
