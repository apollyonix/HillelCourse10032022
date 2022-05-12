package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class WebElTest {
  @Test
  public void webElTest() {
    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/challenging_dom");

    List<WebElement> elList = driver.findElements(By.xpath("//table//tr1"));
    WebElement el1 = driver.findElement(By.xpath("//table//tr1"));

    Assert.assertTrue(driver.getCurrentUrl().contains("delete"));

    driver.quit();
  }
}
