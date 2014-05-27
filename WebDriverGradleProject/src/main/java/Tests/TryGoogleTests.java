package Tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TryGoogleTests {
    WebDriver driver = new FirefoxDriver();

    @Before
    public void startBrowser() {
        driver.get("https://google.com");
    }

    @Test
    public void searchOnGoogle() {
        driver.findElement(By.id("gbqfq")).sendKeys("Hi there");
    }

    @After
    public void closeBrowser() {
        driver.close();
    }
}
