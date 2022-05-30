package ua.hillel.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MainPage extends BasePage {

  public MainPage() {
  }

  public LoginPage goToAuthPage() {
    driver.findElement(By.linkText("Form Authentication")).click();
    return new LoginPage();
  }
}
