package com.luxoft.page;

import io.cucumber.java.Scenario;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public abstract class CommonPage {

    public abstract WebElement getElement(String name);


    public void setFieldValue(String field, String value) {
        getElement(field).sendKeys(value);
    }

    public void clickButton(String name) {
        getElement(name).click();
    }

    public void checkElementDisplayed(String name) {
        Assertions.assertTrue(getElement(name).isDisplayed());
    }

}
