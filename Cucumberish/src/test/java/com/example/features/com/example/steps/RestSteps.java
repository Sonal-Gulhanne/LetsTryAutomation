package com.example.features.com.example.steps;

import com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.when;

public class RestSteps {

//    RestAssured restAssured = new RestAssured();

    @Given("^I have a REST end point \"(.*?)\"$")
    public void i_have_a_REST_end_point(String arg1) throws Throwable {
       when().get(arg1);
        expect().statusCode(200);
    }

    @When("^I do a \"(.*?)\" request$")
    public void i_do_a_request(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^I should see the result$")
    public void i_should_see_the_result() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
