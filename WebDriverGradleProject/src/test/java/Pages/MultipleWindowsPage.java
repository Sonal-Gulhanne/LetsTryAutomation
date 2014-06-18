package Pages;

import FrameWork.WebDriverExtension;
import Pages.UI_Elements.MultipleWindowsPage_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage extends WebDriverExtension implements MultipleWindowsPage_Elements {

    WebDriverExtension driver = new WebDriverExtension();
    String winHandleBefore;

    public void clickHere(){
        driver.clickAt(By.xpath(clickHere_xpath));
    }

    public void geFirstName(){
        winHandleBefore = driver.getDriver().getWindowHandle();

        System.out.println("first one ***********" + driver.getDriver().getTitle());

    }

    public void switchToTheOtherWindow(){
        for(String winHandle : driver.getDriver().getWindowHandles()){
            driver.getDriver().switchTo().window(winHandle);

            System.out.println("new one ***********" + driver.getDriver().getTitle());
        }
        driver.getDriver().close();
    }

    public void comeBackToTheOriginalWindow(){
        driver.getDriver().switchTo().window(winHandleBefore);

        System.out.println("Last one again ***********" + driver.getDriver().getTitle());
    }
}
