package FrameWork;

import Resources.defaultProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestClass implements defaultProperties {
    private static WebDriver _webDriver;
    public static WebDriver driver;

    String currentDirectory = System.getProperty("user.dir");

    public WebDriver StartBrowser(String driverName) {
        if (driverName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", currentDirectory + chromeDriverDir);
            _webDriver = new ChromeDriver();
            return _webDriver;
        }else {
            _webDriver = new FirefoxDriver();
            return _webDriver;
        }
    }

    @BeforeTest
    protected void SafeSetUp() {
        driver = StartBrowser(driverName);
        driver.get(URL);
    }

    @AfterTest
    protected void TearDown() {
        driver.close();
    }
}
