package com.example.features.com.example.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SimpleSteps {


    int start;
    int eat;
    int result;


    @Given("^there are (\\d+) cucumbers$")
    public void there_are_cucumbers(int arg1) throws Throwable {
        start = arg1;
    }

    @When("^I (\\d+) cucumbers$")
    public void i_cucumbers(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        eat = arg1;
    }

    @Then("^there are these many (\\d+) cucumbers$")
    public void there_are_these_many_cucumbers(int arg1) throws Throwable {
        result = start - eat;
        Assert.assertTrue(result == arg1);
    }
}
