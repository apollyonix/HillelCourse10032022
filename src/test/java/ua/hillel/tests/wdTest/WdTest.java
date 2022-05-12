package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class WdTest {
  @Test
  public void wdTest() {
    WebDriverManager.chromedriver().setup();
//    WebDriverManager.firefoxdriver().setup();

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();



    driver.get("https://google.com");

    WebElement element = driver.findElement(By.id("div[id='snippets']"));

    element.sendKeys("text" + Keys.TAB);

    System.out.println(driver.getTitle());

    driver.quit();
  }
}
