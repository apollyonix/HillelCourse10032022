package ua.hillel.tests.wdTest.files;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ua.hillel.tests.wdTest.BaseTest;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DownloadTest extends BaseTest {
  @Test
  public void downloadTest() {
    driver.get("https://the-internet.herokuapp.com/download");

    driver.findElement(By.linkText("logo.png")).click();

    System.out.println("done");
  }
}
