package ua.hillel.tests.testNg;

import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

@Test
public class SmokeTest {
//  @Test
  public void createCategory() {

  }

  @Test(dependsOnMethods = "createCategory")
  public void createProduct() {

  }

  public void nonTestMethod() {

  }


}
