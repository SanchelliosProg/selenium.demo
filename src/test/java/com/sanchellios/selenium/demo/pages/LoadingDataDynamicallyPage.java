package com.sanchellios.selenium.demo.pages;

import com.sanchellios.selenium.demo.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.sanchellios.selenium.demo.LoadingDataDynamicallyLocators.*;

public class LoadingDataDynamicallyPage extends Page {
    public LoadingDataDynamicallyPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void navigateTo() {
        driver.get(Urls.LOADING_DATA_DYNAMICALLY_PAGE_URL);
    }

    public void clickGetNewUser() {
        findElementByCss(GET_NEW_USER_BUTTON_CSS).click();
    }


    public boolean isPhotoLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(BR_CSS)));
        if(findElementByCss(IMAGE_CSS).getAttribute("src").contains("randomuser")){
            return true;
        } else {
            return false;
        }
    }
}
