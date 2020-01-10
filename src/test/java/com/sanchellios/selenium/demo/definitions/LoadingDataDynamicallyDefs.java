package com.sanchellios.selenium.demo.definitions;

import com.sanchellios.selenium.demo.SeleniumWebDriverContext;
import com.sanchellios.selenium.demo.pages.LoadingDataDynamicallyPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.support.PageFactory;

public class LoadingDataDynamicallyDefs {

    private LoadingDataDynamicallyPage page;

    public LoadingDataDynamicallyDefs() {
        page = PageFactory.initElements(SeleniumWebDriverContext.getInstance().getWebDriver(), LoadingDataDynamicallyPage.class);
    }

    @When("user click Get New User button")
    public void user_click_Get_New_User_button() throws InterruptedException {
        page.clickGetNewUser();
    }

    @Then("photo of random user is loaded")
    public void profile_of_random_user_is_loaded() {
        MatcherAssert.assertThat(page.isPhotoLoaded(), Matchers.equalTo(true));
    }
}
