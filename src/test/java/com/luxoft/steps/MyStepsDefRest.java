package com.luxoft.steps;

import com.luxoft.dto.JsonEx;
import com.luxoft.page.MainPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.json.JsonOutput;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertAll;

public class MyStepsDefRest {
    private RequestSpecification requestSpecification;
    private Response response;

    @Given("create request to {string}")
    public void createRequestTo(String arg0) {
        requestSpecification = given().baseUri(arg0);

    }

    @When("I send request to {string} with parameter {string}")
    public void iSendRequestToWithParameter(String arg0, String arg1) {
        response = requestSpecification.pathParam("posts", arg0).pathParam("id", arg1)
                .when().get("{posts}/{id}");

    }

    @Then("StatusCode is {int}")
    public void statuscodeIs(int arg0) {
        response.then().statusCode(arg0);
    }

    @Then("response contains {string}")
    public void responseContains(String arg0) {
        System.out.println(response.asString());
        Assertions.assertTrue(response.asString().contains(arg0));
    }

    @Then("response contains data")
    public void responseContainsData(DataTable table) {
        Map<String,String> dt = table.asMap(String.class, String.class);
        JsonEx ex = response.as(JsonEx.class);
        Integer dtUserId = Integer.parseInt(dt.get("userid"));
        Integer dtId = Integer.parseInt(dt.get("id"));
        System.out.println(ex.getUserId()+" = "+dtUserId);
        System.out.println(ex.getId()+" = "+dtId);
        System.out.println(ex.getTitle());
        System.out.println(dt.get("title"));
        assertAll(
                () -> Assertions.assertEquals(ex.getUserId(), dtUserId),
                () -> Assertions.assertEquals(ex.getId(), dtId),
                () -> Assertions.assertEquals(ex.getTitle(), dt.get("title"))
        );
    }
}


