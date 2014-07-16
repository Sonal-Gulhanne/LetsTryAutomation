package com.example.features.com.example.steps;

import com.example.features.com.example.resources.BaseTest;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonStepDefinitions {

    WebDriver driver = BaseTest.getInstanceOfWebDriver();

    @When("^I click on \"(.*?)\" link$")
    public void i_click_on_link(String link) throws Throwable {
        driver.findElement(By.linkText(link)).click();
    }


}
