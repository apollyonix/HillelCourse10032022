package ua.hillel.tests.selenideTests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import ua.hillel.pageObjects.selenidePages.DynamicControlsPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DynamicTest {
  @Test
  public void dynamicTest() {
    open("https://the-internet.herokuapp.com/dynamic_controls");

    DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
    dynamicControlsPage.addOrRemoveCheckbox(true);
    dynamicControlsPage.addOrRemoveCheckbox(false);
  }
}
