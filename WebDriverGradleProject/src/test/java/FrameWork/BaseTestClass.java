package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseTestClass {
    public static WebDriver driver;
    private static WebDriver _webDriver;
    String currentDirectory = System.getProperty("user.dir");

    Properties prop = new Properties();
    String fileName = currentDirectory + "/src/main/resources/defaultProperties.properties";
    InputStream is;

    String chromeDriverDir;
    String driverName;
    String URL;

    {
        try {
            is = new FileInputStream(fileName);
            prop.load(is);

            chromeDriverDir = prop.getProperty("chromeDriverDir");
            driverName = prop.getProperty("driverName");
            URL = prop.getProperty("URL");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
