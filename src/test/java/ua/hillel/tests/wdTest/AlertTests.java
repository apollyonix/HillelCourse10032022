package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AlertTests {
  @Test
  public void alertTest() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    driver.findElement(By.cssSelector("ul li:nth-of-type(1) button")).click();
    driver.switchTo().alert().accept();

    Assert.assertEquals(driver.findElement(By.id("result")).getText(),
                        "You successfully clicked an alert");

    driver.findElement(By.cssSelector("ul li:nth-of-type(2) button")).click();
    driver.switchTo().alert().dismiss();
    Assert.assertEquals(driver.findElement(By.id("result")).getText(),
                        "You clicked: Cancel");

    driver.quit();
  }
}
