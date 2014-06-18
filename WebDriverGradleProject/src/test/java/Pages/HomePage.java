package Pages;


import FrameWork.WebDriverExtension;
import Pages.UI_Elements.BasicAuth_Elements;
import Pages.UI_Elements.HomePage_Elements;
import org.openqa.selenium.By;

public class HomePage extends WebDriverExtension implements HomePage_Elements, BasicAuth_Elements{

    WebDriverExtension driver = new WebDriverExtension();

    public void clickAbTestingLink() {
        driver.clickAt(By.xpath(ABTestingLink_xpath));
    }

    public void clickDragAndDropLink() {
        driver.clickAt(By.xpath(DragAndDropLink_xpath));
    }

    public void goToBasicAuthLink(){
        driver.open(basicAuthenticationURL);
    }

    public void clickMultipleWindowsLink(){
        driver.clickAt(By.xpath(MultipleWindowsLink_xpath));
    }
}
