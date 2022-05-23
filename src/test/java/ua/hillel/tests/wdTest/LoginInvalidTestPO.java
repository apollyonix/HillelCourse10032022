package ua.hillel.tests.wdTest;

import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginInvalidTestPO extends BaseTest {
  @Test
  public void invalidLoginTest() {
    openApp().goToAuthPage()
        .setUsername("user_invalid")
        .setPassword("pass_invalid")
        .clickLoginWithInvalidCreds();
  }
}
