package com.example.features.com.example.steps;

import com.example.features.com.example.resources.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {

    WebDriver driver = BaseTest.getInstanceOfWebDriver();

    @When("^I click on AB Testing link$")
    public void i_click_on_AB_Testing_link() {
        driver.findElement(By.xpath("//a[.='A/B Testing']")).click();

    }

    @When("^I click on \"(.*?)\" link$")
    public void i_click_on_link(String link) throws Throwable {
        driver.findElement(By.xpath(link)).click();
    }

    @Then("^I should be able to verify the page text$")
    public void i_should_be_able_to_verify_the_page_text() {
        assert driver.findElement(By.cssSelector("div.example")).getText().contains("Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through)");
        driver.close();
    }
}
