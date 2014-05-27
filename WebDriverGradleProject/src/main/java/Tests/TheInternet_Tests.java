package Tests;

import Pages.ABTestingPage;
import Pages.DragAndDropPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class TheInternet_Tests extends HomePage {

    HomePage homePage = new HomePage();

    ABTestingPage abTestingPage = new ABTestingPage();

    DragAndDropPage dragAndDropPage = new DragAndDropPage();

    @Test
    public void testAbOnHomePage() {
        homePage.clickAbTestingLink();
        abTestingPage.verifyTextAtTheAbTestingPage();
    }

    @Test
    public void testDragAndDrop() throws InterruptedException {
        homePage.clickDragAndDropLink();
        dragAndDropPage.dragAonB();
    }
}
