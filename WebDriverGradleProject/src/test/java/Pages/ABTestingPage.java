package Pages;

import FrameWork.WebDriverExtension;
import Pages.UI_Elements.ABTestingPage_Elements;
import org.openqa.selenium.By;

public class ABTestingPage extends WebDriverExtension implements ABTestingPage_Elements {

    WebDriverExtension driver = new WebDriverExtension();

    public void verifyTextAtTheAbTestingPage() {
        assert driver.getTextAt(By.cssSelector(text_css)).contains(expectedValueInText_css);
    }
}
