package com.sanchellios.selenium.demo.pages;

import com.sanchellios.selenium.demo.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

import static com.sanchellios.selenium.demo.DragAndDropDemoLocators.DRAGGABLE_ITEMS_CSS;
import static com.sanchellios.selenium.demo.DragAndDropDemoLocators.DROP_ZONE_CSS;

public class DragAndDropDemoPage extends Page {

    public DragAndDropDemoPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void navigateTo() {
        driver.get(Urls.DRAG_AND_DROP_PAGE_URL);
    }

    public void dragAndDropElementWithIndex(int index) throws AWTException {
        WebElement draggable = findElementsByCss(DRAGGABLE_ITEMS_CSS).get(index);
        WebElement target = findElementByCss(DROP_ZONE_CSS);

        (new Actions(driver))
                .moveToElement(draggable)
                .clickAndHold(draggable)
                .moveToElement(target)
                .release()
                .build()
                .perform();
    }
}
