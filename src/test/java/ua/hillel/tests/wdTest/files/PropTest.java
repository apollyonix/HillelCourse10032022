package ua.hillel.tests.wdTest.files;

import org.testng.annotations.Test;
import ua.hillel.files.MyProperties;

import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PropTest {
  @Test
  public void propTest() throws IOException {
    System.out.println(MyProperties.getPropValue("prop1"));
  }
}
