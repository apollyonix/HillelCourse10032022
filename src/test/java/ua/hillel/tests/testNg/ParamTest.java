package ua.hillel.tests.testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ParamTest {
  @Test(dataProvider = "params")
  public void paramTest(String username, String pass, boolean role) {
    System.out.println(username + " - " + pass);
  }


  @DataProvider(name = "params")
  public Object[][] getParams() {
    Object[][] results = {
        {"user1", "pass1"},
        {"user2", "pass2"},
        {"user3", "pass3"},
        {"user4", "pass4"}
    };

    return results;
  }
}
