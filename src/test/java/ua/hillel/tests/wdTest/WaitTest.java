package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class WaitTest {
  @Test
  public void waitTest() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

    WebElement checkbox = null;
    try {
      checkbox = driver.findElement(By.id("checkbox"));
    } catch (NoSuchElementException e) {}

    Assert.assertNotNull(checkbox);

    webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#checkbox-example button"))).click();
    WebElement loader = webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("loading"))));
    webDriverWait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(loader)));

    checkbox = null;

    try {
      checkbox = driver.findElement(By.id("checkbox"));
    } catch (NoSuchElementException e) {}

    Assert.assertNull(checkbox);



    /////Input
    WebElement button = driver.findElement(By.cssSelector("#input-example button"));
    button.click();
    WebElement input = webDriverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#input-example input"))));

    button.click();
    webDriverWait.until(ExpectedConditions.attributeToBeNotEmpty(input, "disabled"));


    driver.quit();
  }
}
