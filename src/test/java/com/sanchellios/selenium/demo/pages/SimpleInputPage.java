package com.sanchellios.selenium.demo.pages;

import com.sanchellios.selenium.demo.Urls;
import org.openqa.selenium.WebDriver;

import static com.sanchellios.selenium.demo.SimpleInputPageLocators.*;

public class SimpleInputPage extends Page {

    public SimpleInputPage(WebDriver driver) {
        super(driver);
        navigateTo();
    }

    @Override
    public void navigateTo() {
        driver.get(Urls.SIMPLE_INPUT_PAGE_URL);
    }

    public void enterTextToSingleInput(String input) {
        findByCss(SINGLE_INPUT_CSS).sendKeys(input);
    }

    public void clickShowMessageButton() {
        findByCss(SHOW_MESSAGE_BUTTON_CSS).click();
    }

    public String scanSingleMessageLabel() {
        return findByCss(YOUR_MESSAGE_LABEL_CSS).getText();
    }

    public void passInputA(Object number) {
        findByCss(A_INPUT_CSS).sendKeys(number.toString());
    }

    public void passInputB(Object number) {
        findByCss(B_INPUT_CSS).sendKeys(number.toString());
    }

    public void clickGetTotalButton() {
        findByCss(GET_TOTAL_BUTTON).click();
    }

    public String getTotalResult() {
        return findByCss(TOTAL_RESULT_LABEL).getText();
    }

}
