package Pages;


import FrameWork.WebDriverExtension;
import org.openqa.selenium.By;

public class HomePage extends WebDriverExtension {

    WebDriverExtension driver = new WebDriverExtension();

    public void goToHomePage() {
        driver.open("http://the-internet.herokuapp.com/");
    }

    public void clickAbTestingLink() {
        driver.clickAt(By.xpath("//a[.='A/B Testing']"));
    }

    public void clickDragAndDropLink() {
        driver.clickAt(By.xpath("//a[.='Drag and Drop']"));
    }
}
