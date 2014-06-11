package FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
* Created by ee on 06/05/14.
*/
public class WebDriverExtension extends BaseTestClass {

    public void writeAt(By searchCriteria, String textToBeWritten) {
        driver.findElement(searchCriteria).sendKeys(textToBeWritten);
    }

    public void open(String url) {
        driver.get(url);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void clickAt(By elementToBeClicked) {
        driver.findElement(elementToBeClicked).click();
    }

    public String getTextAt(By element) {
        return driver.findElement(element).getText();
    }
}
