package com.example.features.com.example.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ee on 11/06/14.
 */
public class StepDefinitions {

    WebDriver driver = new FirefoxDriver();

    @Given("^I am on the Internet site$")
    public void i_am_on_the_Internet_site() {
        driver.get("http://the-internet.herokuapp.com/");

    }

    @When("^I click on AB Testing link$")
    public void i_click_on_AB_Testing_link()  {
        driver.findElement(By.xpath("//a[.='A/B Testing']")).click();

    }

    @Then("^I should be able to verify the page text$")
    public void i_should_be_able_to_verify_the_page_text(){
        assert driver.findElement(By.cssSelector("div.example")).getText().contains("\"\\n\" +\n" +
                "\" +\n" +
                "            \"                \"    Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).\"");
        driver.close();
    }
}
