package com.sanchellios.selenium.demo.pages;

import com.sanchellios.selenium.demo.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.sanchellios.selenium.demo.SelectDropdownListPageLocators.*;

public class SelectDropdownPage extends Page {
    public final String PAGE_NAME = "Select Dropdown List";

    public SelectDropdownPage(WebDriver driver) {
        super(driver);
        navigateTo();
    }

    @Override
    public void navigateTo() {
        driver.get(Urls.SELECT_DROPDOWN_PAGE_URL);
    }

    public void selectDay(String day) {
        Select select = new Select(findByCss(DAY_SELECT_CSS));
        select.selectByValue(day);
    }

    public void selectState(String state) {
        Select select = new Select(findByCss(STATES_MULTI_SELECT_CSS));
        if (state.equals("all")) {
            for(WebElement e : select.getOptions()) {
                select.selectByValue(e.getText());
            }
        } else {
            select.selectByValue(state);
        }

    }

    public String getTextOfSelectedValueLabel() {
        return findByCss(SELECTED_VALUE_LABEL_CSS).getText();
    }

    public String getTextOfMultiSelectedValueLabel() {
        return findByCss(MULTI_SELECTED_VALUE_LABEL_CSS).getText();
    }

    public void pressFirstSelectedButton() {
        findByCss(FIRST_SELECTED_BUTTON_CSS).click();
    }

    public void pressGetAllSelectedButton() {
        findByCss(GET_ALL_SELECTED_BUTTON_CSS).click();
    }

}
