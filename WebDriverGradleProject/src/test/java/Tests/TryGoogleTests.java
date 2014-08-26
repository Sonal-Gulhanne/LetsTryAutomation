package Tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class TryGoogleTests {
    WebDriver driver;

    ProfilesIni allProfiles = new ProfilesIni();

    FirefoxProfile firefoxProfile = allProfiles.getProfile("Selenium");


    @Before
    public void startBrowser() {
        driver = new FirefoxDriver(firefoxProfile);

    }

    @Test
    public void shareYourLocationUsingFirefoxProfile() throws InterruptedException {
        /*Need to create a firefox profile using this site - http://selenium.polteq.com/en/category/tips-tricks/*/

        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[.='Geolocation']")).click();
        driver.findElement(By.xpath("//button[.='Where am I?']")).click();

        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("lat-value")));
        Assert.assertEquals(driver.findElement(By.id("lat-value")).getText(), "51.510538");
        Assert.assertEquals(driver.findElement(By.id("long-value")).getText(), "-0.5950409999999999");

        driver.findElement(By.linkText("See it on Google")).click();
    }

    @Test
    public void searchOnGoogle() {
        driver.get("https://google.com");
        driver.findElement(By.id("gbqfq")).sendKeys("Hi there");
    }


    @Test
    public void twoSites() throws AWTException {
        driver.get("http://www.google.com");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_N);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_N);
        driver.get("http://www.facebook.com");

        Set<String> sbc = driver.getWindowHandles();
        System.out.print(sbc.size());
    }

    @After
    public void closeBrowser() {
        driver.close();
    }
}
