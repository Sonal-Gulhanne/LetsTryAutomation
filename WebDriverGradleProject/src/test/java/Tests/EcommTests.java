package Tests;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by ee on 05/09/14.
 */
public class EcommTests {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeTest
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/home/ee/projects/o2/LetsTryAutomation/WebDriverGradleProject/src/test/java/Resources/chromedriver");
        driver = new FirefoxDriver();
        baseUrl = "https://localhost.o2.co.uk:9443/upgrade/store";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCreateOrderOnMozilla() throws Exception {

        Random random = new Random();
        int randomInt = random.nextInt();

        driver.get(baseUrl + "/phones#page=1");
        driver.findElement(By.cssSelector("img[alt=\"Image of the Samsung Galaxy S5\"]")).click();
        driver.findElement(By.id("postPayCTA")).click();
        driver.findElement(By.cssSelector("input.btn-style.btn-primary-dark")).click();
        driver.findElement(By.linkText("Continue to basket")).click();
        driver.findElement(By.name("securecheckout")).click();
        driver.findElement(By.cssSelector("input.btn-style.btn-secondary-dark")).click();
        new Select(driver.findElement(By.id("customerTitle"))).selectByVisibleText("Mr");
        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys("firstName");
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("LastName");
        driver.findElement(By.id("day")).clear();
        driver.findElement(By.id("day")).sendKeys("05");
        driver.findElement(By.id("month")).clear();
        driver.findElement(By.id("month")).sendKeys("09");
        driver.findElement(By.id("year")).clear();
        driver.findElement(By.id("year")).sendKeys("1907");
        driver.findElement(By.id("mobile")).clear();
        driver.findElement(By.id("mobile")).sendKeys("07123465798");
        driver.findElement(By.id("email")).clear();
        String email = "ecommtests"+ randomInt +"@gm87ail.com";
        System.out.println(email + " - email address is this");

        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("abhinav1223");
        driver.findElement(By.id("confirmPassword")).clear();
        driver.findElement(By.id("confirmPassword")).sendKeys("abhinav123");
        new Select(driver.findElement(By.id("securityQuestion"))).selectByVisibleText("Memorable name");
        driver.findElement(By.id("securityAnswer")).clear();
        driver.findElement(By.id("securityAnswer")).sendKeys("name");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("buildingNumber")).clear();
        driver.findElement(By.id("buildingNumber")).sendKeys("12");
        driver.findElement(By.id("postCode")).clear();
        driver.findElement(By.id("postCode")).sendKeys("sl11ep");
        driver.findElement(By.id("findAddressSubmit")).click();
        driver.findElement(By.id("rb_address_1")).click();
        driver.findElement(By.id("selectadd")).click();
        driver.findElement(By.id("accountName")).clear();
        driver.findElement(By.id("accountName")).sendKeys("account");
        driver.findElement(By.id("sortCode")).clear();
        driver.findElement(By.id("sortCode")).sendKeys("201596");
        driver.findElement(By.id("accountNumber")).clear();
        driver.findElement(By.id("accountNumber")).sendKeys("10207136");
        driver.findElement(By.id("yearsAtAddress")).clear();
        driver.findElement(By.id("yearsAtAddress")).sendKeys("9");
        driver.findElement(By.id("monthsAtAddress")).clear();
        driver.findElement(By.id("monthsAtAddress")).sendKeys("5");
        driver.findElement(By.id("directDebitGuarantee")).click();
        driver.findElement(By.id("agreeToCreditCheck")).click();
        driver.findElement(By.id("submitForm")).click();
        driver.findElement(By.id("txtCardHolderName")).clear();
        driver.findElement(By.id("txtCardHolderName")).sendKeys("Derek Accept");
        new Select(driver.findElement(By.id("ddlCardType"))).selectByVisibleText("Mastercard");
        driver.findElement(By.id("txtCardNumber")).clear();
        driver.findElement(By.id("txtCardNumber")).sendKeys("5453019686441867");
        new Select(driver.findElement(By.id("ddlMonth"))).selectByVisibleText("02");
        new Select(driver.findElement(By.id("ddlYr"))).selectByVisibleText("2017");
        driver.findElement(By.id("txtSecurityCode")).clear();
        driver.findElement(By.id("txtSecurityCode")).sendKeys("123");
        driver.findElement(By.id("btnPayNow")).click();
    }

    @Test
    public void checkDockingHeader() throws AWTException {
        driver.get("https://www.ref.o2.co.uk/shop/phones/apple/iphone-6/#contractType=paymonthly");
        Assert.assertTrue(new WebDriverWait(driver, 1).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='header-container docked']"))));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)", "");

//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

//        driver.findElement(By.id("reviews")).sendKeys(Keys.PAGE_DOWN);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.BACK_SPACE).perform();

        Assert.assertTrue(new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header-container docked']"))).isDisplayed());
    }

    @AfterTest()
    public void closeBrowser() {
        driver.close();
    }
}
