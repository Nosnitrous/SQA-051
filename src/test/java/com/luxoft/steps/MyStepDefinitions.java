package com.luxoft.steps;

import io.cucumber.java.en.*;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.jupiter.api.Assertions;

public class MyStepDefinitions {
    private int distance;

//    @Given("Lucy is in {int} m from Sean")
    @Given("^(?:Lucy|Alice|Kate) is in (\\d+) m from Sean$")
//    @Given("^,ucy is in (\\d+) m from Sean$")
    public void lucy_is_in_14m_from_sean(Integer int1) {
        distance = int1;
    }

    @When("Sean shout {string}")
    public void seanShout(String arg0) {
        System.out.println(arg0);
    }


    @Then("^Lucy (hears|not hears) Sean's message$")
    public void lucyHearsSeanSMessage(String arg0) {
        if(arg0.contains("not"))
            Assertions.assertFalse(distance < 15);
        else
            Assertions.assertTrue(distance < 15);
    }

    @But("Lucy is hungry")
    public void lucyIsHungry() {
    }

    @And("Lucy goes to cafe")
    public void lucyGoesToCafe() {
        while (distance > 0) {
            distance--;
        }
    }

    @Given("Show how background works")
    public void showHowBackgroundWorks() {
        System.out.println("BackGround works now 111111");
    }

    @Дано("Люси в {int} м от Шона")
    public void люсиВМОтШона(int arg0) {
        distance=arg0;
    }

    @Когда("Шон кричит {string}")
    public void шонКричит(String arg0) {
        System.out.println(arg0);
    }

    @Тогда("Люси его слышит")
    public void люсиЕгоСлышит() {
        Assertions.assertTrue(distance < 15);
    }

    @Когда("Шон кричит многостроково")
    public void шонКричитМногостроково(String arg0) {
        System.out.println(arg0);
    }

}