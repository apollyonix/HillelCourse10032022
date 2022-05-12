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

public class BasicAuthTest {
  @Test
  public void basicAuthTest() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();


    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(),
                        "Basic Auth");

    driver.quit();
  }
}
