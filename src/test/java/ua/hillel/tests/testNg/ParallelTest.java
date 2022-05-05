package ua.hillel.tests.testNg;

import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

@Test
public class ParallelTest {
  public void method1() {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {}
  }

  public void method2() {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {}
  }

  public void method3() {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {}
  }
}
