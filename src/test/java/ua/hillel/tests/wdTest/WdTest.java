package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

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

  @Test
  public void getTableValues() {
    /*

     */

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://the-internet.herokuapp.com/challenging_dom");

    List<WebElement> tableCells = driver.findElements(By.xpath("//table//tbody/tr/td[4]"));

    for (WebElement td : tableCells) {
      System.out.println(td.getText());
    }

    driver.quit();


  }






}
