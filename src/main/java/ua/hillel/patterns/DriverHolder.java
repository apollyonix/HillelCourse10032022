package ua.hillel.patterns;

import org.openqa.selenium.WebDriver;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DriverHolder {
  private static DriverHolder holder;
  private WebDriver driver;

  private DriverHolder() {}

  public static DriverHolder getInstance() {
    if (holder == null) {
      holder = new DriverHolder();
    }
    return holder;
  }

  public static WebDriver getDriver() {
    return getInstance().driver;
  }

  public static void setDriver(WebDriver driver) {
    getInstance().driver = driver;
  }
}
