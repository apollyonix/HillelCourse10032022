package ua.hillel.tests.wdTest;

import org.testng.annotations.Test;
import ua.hillel.pageObjects.HoverPage;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class HoverTest {
  @Test
  public void hoverTest() {
    HoverPage hoverPage = new HoverPage();
    String user1 = hoverPage.getUsername(1);
    String user2 = hoverPage.getUsername(2);
    String user3 = hoverPage.getUsername(3);
  }
}
