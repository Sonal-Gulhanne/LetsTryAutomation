package Pages;

import FrameWork.WebDriverExtension;
import Pages.UI_Elements.BasicAuth_Elements;
import org.openqa.selenium.By;

public class BasicAuthPage extends WebDriverExtension implements BasicAuth_Elements {

    WebDriverExtension driver = new WebDriverExtension();

    public void verifyTextAtBasicAuthPage() {
        assert driver.getTextAt(By.cssSelector(text_css)).contains(expectedValueInText_css);
    }
}
