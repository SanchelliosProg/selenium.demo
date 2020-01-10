package com.sanchellios.selenium.demo.definitions;

import com.sanchellios.selenium.demo.SeleniumWebDriverContext;
import com.sanchellios.selenium.demo.pages.DragAndDropDemoPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class DragAndDropDemoDefs {

    private DragAndDropDemoPage page;

    public DragAndDropDemoDefs() {
        this.page = PageFactory.initElements(SeleniumWebDriverContext.getInstance().getWebDriver(), DragAndDropDemoPage.class);
    }

    @When("drag and drop first element of list")
    public void drag_and_drop_first_element_of_list() throws InterruptedException, AWTException {
        page.dragAndDropElementWithIndex(1);
        Thread.sleep(10000);
    }

    @Then("it appears on the dropped items list")
    public void it_appears_on_the_dropped_items_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
