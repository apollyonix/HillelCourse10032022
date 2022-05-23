package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pageObjects.MainPage;
import ua.hillel.pageObjects.SecurePage;



/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginTestPO extends BaseTest {
  @Test
  public void loginTest() {
    SecurePage securePage = openApp().goToAuthPage()
        .setUsername("tomsmith")
        .setPassword("SuperSecretPassword!")
        .clickLogin();

    String title = securePage.getPageTitle();

    Assert.assertEquals(title, "Secure Area");
    securePage.logout();
  }
}
