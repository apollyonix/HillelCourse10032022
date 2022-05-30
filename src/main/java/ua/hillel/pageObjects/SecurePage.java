package ua.hillel.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SecurePage extends BasePage {

  public SecurePage(WebDriver driver) {
  }

  public LoginPage logout() {
    driver.findElement(By.cssSelector("a.button,secondary.radius")).click();
    return new LoginPage();
  }

  public String getPageTitle() {
    return driver.findElement(By.tagName("h2")).getText();
  }
}
