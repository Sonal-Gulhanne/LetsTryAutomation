package Tests;

import Pages.ABTestingPage;
import Pages.BasicAuthPage;
import Pages.DragAndDropPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class TheInternet_Tests extends HomePage {

    HomePage homePage = new HomePage();

    ABTestingPage abTestingPage = new ABTestingPage();

    DragAndDropPage dragAndDropPage = new DragAndDropPage();

    BasicAuthPage basicAuthPage = new BasicAuthPage();

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

    @Test
    public void testBasicAuth(){
        homePage.goToBasicAuthLink();
        basicAuthPage.verifyTextAtBasicAuthPage();
    }
}
