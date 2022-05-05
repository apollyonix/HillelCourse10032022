package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class WdTest {
  @Test
  public void wdTest() {
//    WebDriverManager.chromedriver().setup();
    WebDriverManager.firefoxdriver().setup();

    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();



    driver.get("https://google.com");



    System.out.println(driver.getTitle());

    driver.quit();
  }
}
