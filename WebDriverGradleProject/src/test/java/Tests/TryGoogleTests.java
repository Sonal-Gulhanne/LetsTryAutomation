package Tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.sikuli.webdriver.ImageElement;
import org.sikuli.webdriver.SikuliFirefoxDriver;
import org.testng.Assert;

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

        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.id("lat-value")).getText(), "51.510538");
        Assert.assertEquals(driver.findElement(By.id("long-value")).getText(), "-0.5950409999999999");

        driver.findElement(By.linkText("See it on Google")).click();
    }

    @Test
    public void searchOnGoogle() {
        driver.get("https://google.com");
        driver.findElement(By.id("gbqfq")).sendKeys("Hi there");
    }

    @After
    public void closeBrowser() {
        driver.close();
    }
}
