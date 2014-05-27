package Pages;


import FrameWork.WebDriverExtension;
import Pages.UI_Elements.HomePage_Elements;
import org.openqa.selenium.By;

public class HomePage extends WebDriverExtension implements HomePage_Elements{

    WebDriverExtension driver = new WebDriverExtension();

    public void clickAbTestingLink() {
        driver.clickAt(By.xpath(ABTestingLink_xpath));
    }

    public void clickDragAndDropLink() {
        driver.clickAt(By.xpath(DragAndDropLink_xpath));
    }
}
