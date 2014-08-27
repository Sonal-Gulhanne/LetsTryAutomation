package FrameWork;

import Resources.defaultProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseTestClass implements defaultProperties {
    public static WebDriver driver;
    private static WebDriver _webDriver;
    String currentDirectory = System.getProperty("user.dir");

    public WebDriver StartBrowser(String driverName) {
        if (driverName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", currentDirectory + chromeDriverDir);
            _webDriver = new ChromeDriver();
            return _webDriver;
        } else {
            _webDriver = new FirefoxDriver();
            return _webDriver;
        }
    }

    @BeforeMethod(groups = {"theInternetTests"})
    protected void safeSetUp() {
        driver = StartBrowser(driverName);
        driver.get(URL);
    }

    @AfterMethod(groups = {"theInternetTests"})
    protected void tearDown() {
        driver.close();
    }
}
