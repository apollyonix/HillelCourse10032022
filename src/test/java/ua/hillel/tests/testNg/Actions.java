package ua.hillel.tests.testNg;

import org.testng.annotations.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Actions {
  @BeforeSuite
  public void beforeSuite() {
    System.out.println("before suite");
  }

  @BeforeTest
  public void beforeTest() {
    System.out.println("before test");
  }

  @BeforeClass
  public void beforeClass() {
    System.out.println("before class");
  }

  @BeforeMethod
  public void beforeMethod() {
    System.out.println("before method");
  }

}
