package ua.hillel.tests.testNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginTest {
  @Test
  public void loginTest() {
    //try to login to the app
    boolean isUserLoggedIn = true;
    Assert.assertTrue(isUserLoggedIn, "User is not logged in");

    int count = 4;
    Assert.assertEquals(count, 5, "");

    Assert.fail("Count is " + count);

    SoftAssert softAssert = new SoftAssert();

    softAssert.assertAll();
  }
}
