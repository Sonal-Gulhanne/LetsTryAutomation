package com.example.features.com.example.steps;

import com.example.features.com.example.resources.BaseTest;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbTestingPageSteps {

    WebDriver driver = BaseTest.getInstanceOfWebDriver();

    @Then("^I should be able to verify the page text$")
    public void i_should_be_able_to_verify_the_page_text() {
        assert driver.findElement(By.cssSelector("div.example")).getText().contains("Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through)");
    }
}
