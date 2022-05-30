package ua.hillel.tests.wdTest.files;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ua.hillel.files.MyProperties;
import ua.hillel.tests.wdTest.BaseTest;

import java.io.File;
import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UploadTest extends BaseTest {
  @Test
  public void uploadTest() {
    driver.get("https://the-internet.herokuapp.com/upload");

    File file = new File("products.csv");

    driver.findElement(By.cssSelector("input[type='file']")).sendKeys(file.getAbsolutePath());
    driver.findElement(By.id("file-submit")).click();

    System.out.println("done");
  }
}
