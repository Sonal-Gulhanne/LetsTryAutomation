package Pages;

import FrameWork.WebDriverExtension;
import Pages.UI_Elements.DragAndDropPage_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropPage extends WebDriverExtension implements DragAndDropPage_Elements {

    WebDriverExtension driver = new WebDriverExtension();

    public void dragAonB() throws InterruptedException {

        WebElement divA = driver.getDriver().findElement(By.xpath(divA_xpath));

        WebElement divB = driver.getDriver().findElement(By.xpath(divB_xpath));

        Actions builder = new Actions(driver.getDriver());

        Action dragAndDrop = builder.clickAndHold(divA)
                .moveToElement(divB)
                .release(divB)
                .build();

        dragAndDrop.perform();
    }
}
