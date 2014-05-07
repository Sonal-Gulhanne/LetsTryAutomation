package Pages;

import FrameWork.WebDriverExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropPage extends WebDriverExtension {

    WebDriverExtension driver = new WebDriverExtension();

    public void dragAonB() throws InterruptedException {


        WebElement element = driver.getDriver().findElement(By.xpath("//div/header[.='A']"));

        WebElement element1 = driver.getDriver().findElement(By.xpath("//div/header[.='B']"));

        Actions builder = new Actions(driver.getDriver());

        Action dragAndDrop = builder.clickAndHold(element)
                .moveToElement(element1)
                .release(element1)
                .build();

        dragAndDrop.perform();
    }
}
