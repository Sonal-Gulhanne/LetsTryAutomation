package com.example.features.com.example.steps;

import com.example.features.com.example.resources.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimpleSteps extends BaseTest {

    WebDriver driver = BaseTest.getInstanceOfWebDriver();

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

    @Given("^I am on the site \"(.*?)\"$")
    public void i_am_on_the_site(String arg1) throws Throwable {
        driver.get(arg1);
    }


    @When("^I type \"(.*?)\" in the \"(.*?)\" box$")
    public void i_type_in_the_box(String arg1, String arg2) throws Throwable {
        driver.findElement(By.id(arg2)).sendKeys(arg1);
    }

    @Then("^I should see search results for \"(.*?)\"$")
    public void i_should_see_search_results_for(String arg1) throws Throwable {
        driver.getPageSource().contains(arg1);
        driver.close();
    }

    @When("^I click search button$")
    public void i_click_search_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"gbqfb\"]/span")).click();
    }
}
