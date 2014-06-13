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

//    @Given("^I am on the Internet site$")
//    public void i_am_on_the_Internet_site(String URL) {
//        driver.get(URL);
//
//    }

    @When("^I click on AB Testing link$")
    public void i_click_on_AB_Testing_link()  {
        driver.findElement(By.xpath("//a[.='A/B Testing']")).click();

    }

    @When("^I click on \"(.*?)\" link$")
    public void i_click_on_link(String link) throws Throwable {
        driver.findElement(By.xpath(link)).click();
    }

    @Then("^I should be able to verify the page text$")
    public void i_should_be_able_to_verify_the_page_text(){
        assert driver.findElement(By.cssSelector("div.example")).getText().contains("Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through)");
        driver.close();
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
    }

    @When("^I click search button$")
    public void i_click_search_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"gbqfb\"]/span")).click();
    }

}
