package com.example.features.com.example.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    private static WebDriver driver;

    public static WebDriver getInstanceOfWebDriver() {

        if(driver == null){
            driver = new FirefoxDriver();
            return driver;
        }
        return driver;
    }
}
