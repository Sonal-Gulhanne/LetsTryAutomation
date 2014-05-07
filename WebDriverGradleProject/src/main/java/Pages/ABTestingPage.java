package Pages;

import FrameWork.WebDriverExtension;
import org.openqa.selenium.By;

public class ABTestingPage extends WebDriverExtension {

    WebDriverExtension driver = new WebDriverExtension();

    public void verifyTextAtTheAbTestingPage() {
        assert driver.getTextAt(By.cssSelector("div.example")).contains("\n" +
                "    Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).");
    }
}
