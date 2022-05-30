package ua.hillel.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ua.hillel.patterns.DriverHolder;

import java.time.Duration;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class BasePage {
  protected WebDriver driver;
  protected WebDriverWait wait;
  protected Actions actions;
  protected JavascriptExecutor executor;

  protected BasePage() {
    this.driver = DriverHolder.getDriver();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    actions = new Actions(driver);
    executor = (JavascriptExecutor) driver;
  }

  protected void clickElement(WebElement element) {
    wait.until(ExpectedConditions.elementToBeClickable(element)).click();
  }
}
