package com.luxoft.steps;

import com.luxoft.page.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepsDefWeb {
    private MainPage mainPage = new MainPage(Auxiliary.wd);

    @Given("I enter {string} to the {string} Field")
    public void iEnterToTheField(String arg0, String arg1) {
        mainPage.setFieldValue(arg1, arg0);
    }

    @When("I Click {string} button")
    public void iClickButton(String arg0) {
        mainPage.clickButton(arg0);
    }

    @Then("^(?:Button|Field|Element) \"([^\"]*)\" is displayed$")
    public void buttonIsDisplayed(String arg0) {
        mainPage.checkElementDisplayed(arg0);
    }
}


