package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DropdownTest {
  @Test
  public void dropdownTest() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.get("https://the-internet.herokuapp.com/dropdown");

    Select select = new Select(driver.findElement(By.tagName("select")));
    select.selectByValue("2");
    select.selectByVisibleText("Option 2");

    driver.quit();
  }
}
