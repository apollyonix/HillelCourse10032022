package ua.hillel.tests.mvn;

import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

@Test
public class MavenTest {
  public void testMvn() {
    System.out.println("I'm test from maven");
    System.out.println("Running on browser " + System.getProperty("browser"));

    System.out.println("Running on env " + System.getProperty("url"));
  }
}
