package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class TheInternet_Tests extends HomePage {

    HomePage homePage = new HomePage();

    ABTestingPage abTestingPage = new ABTestingPage();

    DragAndDropPage dragAndDropPage = new DragAndDropPage();

    BasicAuthPage basicAuthPage = new BasicAuthPage();

    MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage();

    @Test(groups = {"theInternetTests"})
    public void testAbOnHomePage() {
        homePage.clickAbTestingLink();
        abTestingPage.verifyTextAtTheAbTestingPage();
    }

    @Test(groups = {"theInternetTests"})
    public void testDragAndDrop() throws InterruptedException {
        homePage.clickDragAndDropLink();
        dragAndDropPage.dragAonB();
    }

    @Test(groups = {"theInternetTests"})
    public void testBasicAuth() {
        homePage.goToBasicAuthLink();
        basicAuthPage.verifyTextAtBasicAuthPage();
    }

    @Test(groups = {"theInternetTests"})
    public void testMultipleWindows() {
        homePage.clickMultipleWindowsLink();
        multipleWindowsPage.clickHere();
        multipleWindowsPage.geFirstName();
        multipleWindowsPage.switchToTheOtherWindow();
        multipleWindowsPage.comeBackToTheOriginalWindow();
    }
}
