package com.sanchellios.selenium.demo.definitions;

import com.sanchellios.selenium.demo.SeleniumWebDriverContext;
import com.sanchellios.selenium.demo.pages.JQuerySelectDropdownPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class JQueryDropdownDefs {

    private JQuerySelectDropdownPage page;

    public JQueryDropdownDefs() {
        page = PageFactory.initElements(SeleniumWebDriverContext.getInstance().getWebDriver(), JQuerySelectDropdownPage.class);
    }

    @When("select country {string}")
    public void select_country(String countryName) {
        page.selectCountry(countryName);
    }

    @Then("{string} is viewed as selected on Select Country element")
    public void is_viewed_as_selected_on_Select_Country_element(String expectedCountryName) {
        assertThat(page.getSelectedCountryName(), equalTo(expectedCountryName));
    }

    @When("choose {string} from select state")
    public void choose_from_select_state(String state) {
        page.selectState(state);
    }

    @Then("{string} is viewed in the Select State element")
    public void is_viewed_in_the_Select_State_element(String expectedStates) {
        assertThat(page.checkTitlesInSelectState(), equalTo(expectedStates));
    }

}
