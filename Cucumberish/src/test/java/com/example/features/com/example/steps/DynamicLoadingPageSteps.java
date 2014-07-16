package com.example.features.com.example.steps;


import com.example.features.com.example.resources.BaseTest;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPageSteps {

    WebDriver driver = BaseTest.getInstanceOfWebDriver();


    @When("^I click on \"(.*?)\" button$")
    public void i_click_on_button(String textOfButton) {
        driver.findElement(By.xpath("//button[.='" + textOfButton + "']")).click();
    }

    @When("^I verify that (.*?) element is present and is visible (.*?)$")
    public void i_verify_that_element_is_present_and_is_visible(String element, String isVisible) {
        boolean shouldBeVisible = Boolean.parseBoolean(isVisible);
        if (shouldBeVisible) {
            Assert.assertTrue(new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[.='" + element + "']"))).isDisplayed());
        } else
            Assert.assertTrue(new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[.='" + element + "']"))));
    }
}
