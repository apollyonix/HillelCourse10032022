package ua.hillel.tests.testNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

//@Test(groups = {"high", "auth"}, enabled = false)

@Test(description = "My New Test", priority = 0)
public class TestNgTest {

  @Parameters({"url", "browser"})
  public void method1(String url, String browser) {
    System.out.println(url);
    System.out.println(browser);
  }

//  @Test(dependsOnMethods = "ua.hillel.tests.testNg.TestNgTest.method1")
//  public void method2() {
//
//  }
//
//  @Test(dependsOnMethods = "ua.hillel.tests.testNg.TestNgTest.method1")
//  public void method2_1() {
//
//  }
//
//  @Test(dependsOnMethods = "ua.hillel.tests.testNg.TestNgTest.method1",
//      priority = 20)
//  public void method3() {
//
//  }

//  @Test(dependsOnMethods = "ua.hillel.tests.testNg.TestNgTest.method1",
//      priority = 15)
//  public void method4() {

//  }
}
