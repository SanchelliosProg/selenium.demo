package com.sanchellios.selenium.demo.definitions;

import com.sanchellios.selenium.demo.pages.SimpleInputPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import static com.sanchellios.selenium.demo.SeleniumWebDriverContext.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class InputFieldsDefs {
    private Logger log = LogManager.getLogger(InputFieldsDefs.class);
    private SimpleInputPage page;

    public InputFieldsDefs() {
        log.info("Going to initialize page " + SimpleInputPage.class);
        this.page = PageFactory.initElements(getInstance().getWebDriver(), SimpleInputPage.class);
    }

    @When("enter {string} into the single input field")
    public void enter_into_the_single_input_field(String string) {
        page.enterTextToSingleInput(string);
    }

    @When("press the button Show Message")
    public void press_the_button_Show_Message() {
        page.clickShowMessageButton();
    }

    @When("press the button {string}")
    public void press_the_button(String buttonName) {
        switch (buttonName) {
            case "Show Message":
                page.clickShowMessageButton();
                break;
            case "Get Total":
                page.clickGetTotalButton();
                break;
            default:
                throw new IllegalArgumentException(buttonName + " is not supported in " + InputFieldsDefs.class);
        }
    }


    @Then("{string} appears in the Single Input Field section")
    public void appears_in_the_Single_Input_Field_section(String string) {
        String expectedResult = page.scanSingleMessageLabel();
        assertThat("Where expecting " + expectedResult + ", but received " + string, expectedResult, equalTo(string));
    }

    @When("enter {int} value into the A input field")
    public void enter_value_into_the_A_input_field(Integer aValue) {
        page.passInputA(aValue);
    }

    @When("enter {int} value into the B input field")
    public void enter_value_into_the_B_input_field(Integer bValue) {
        page.passInputB(bValue);
    }

    @Then("receive {int} as a sum")
    public void receive_as_a_sum(Integer expectedSum) {
        String sum = page.getTotalResult();
        assertThat("Where expecting: " + expectedSum + "\nbut received: " + sum, sum, equalTo(expectedSum.toString()));
    }
}
