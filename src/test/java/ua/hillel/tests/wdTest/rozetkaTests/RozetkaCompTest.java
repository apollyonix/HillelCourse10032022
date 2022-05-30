package ua.hillel.tests.wdTest.rozetkaTests;

import org.testng.annotations.Test;
import ua.hillel.pageObjects.rozetkaPages.ItemPage;
import ua.hillel.pageObjects.rozetkaPages.MainPage;
import ua.hillel.tests.wdTest.BaseTest;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RozetkaCompTest extends BaseTest {
  @Test
  public void rozetkaCompTest() {
    MainPage mainPage = new MainPage();
    mainPage.header.searchItem("Item1");

    mainPage.getRecentlyViewItemTitle(1);

    mainPage.getRecentlyViewedItemPrice("Item");

    ItemPage itemPage = new ItemPage();
    itemPage.header.goToMainPage();
  }
}
