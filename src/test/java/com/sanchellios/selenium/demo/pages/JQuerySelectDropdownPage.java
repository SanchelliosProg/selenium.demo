package com.sanchellios.selenium.demo.pages;

import com.sanchellios.selenium.demo.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static com.sanchellios.selenium.demo.JQuerySelectDropdownPageLocators.*;

public class JQuerySelectDropdownPage extends Page {

    @FindBy(css = SELECT_COUNTRY_SELECT_CSS)
    WebElement selectCountrySelect;

    @FindBy(css = SELECT_STATE_SELECT_CSS)
    WebElement selectStateSelect;

    public JQuerySelectDropdownPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void navigateTo() {
        driver.get(Urls.JQUERY_SELECT_DROPDOWN_PAGE_URL);
    }

    public void selectCountry(String country) {
        Select select = new Select(selectCountrySelect);
        select.selectByValue(country);
    }

    public void selectState(String state) {
        Select select = new Select(selectStateSelect);
        select.selectByVisibleText(state);

    }

    public String getSelectedCountryName() {
        return findElementByCss(SELECT_COUNTRY_CONTAINER_CSS).getAttribute("title");
    }

    public String checkTitlesInSelectState() {
        List<String> listOfStates = new ArrayList<>();
        for (WebElement e : findElementsByCss(LIST_OF_CHOSEN_STATES)) {
            listOfStates.add(e.getAttribute("title"));
        }

        return String.join(", ", listOfStates);
    }

}
