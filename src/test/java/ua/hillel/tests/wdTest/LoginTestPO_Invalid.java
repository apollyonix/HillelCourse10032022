package ua.hillel.tests.wdTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pageObjects.SecurePage;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginTestPO_Invalid extends BaseTest {
  @Test
  public void loginTest_invalid() {
    SecurePage securePage = openApp().goToAuthPage()
        .setUsername("tomsmith")
        .setPassword("SuperSecretPassword!")
        .clickLogin();

    String title = securePage.getPageTitle();

    Assert.assertEquals(title, "Secure Area1111");
    securePage.logout();
  }
}
