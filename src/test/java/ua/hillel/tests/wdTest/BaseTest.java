package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import ua.hillel.pageObjects.MainPage;
import ua.hillel.patterns.DriverHolder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class BaseTest {
  public WebDriver driver;

  @BeforeClass
  @Parameters({ "browser" })
  public void setUp(String browser)
      throws MalformedURLException {
    if ("remote".equalsIgnoreCase(browser)) {

      DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability("browserName", "chrome");
      //    capabilities.setCapability("browserVersion", "102.0");
      capabilities.setCapability("selenoid:options",
                                 Map.<String, Object>of("enableVNC", true, "enableVideo", false));
      driver = new RemoteWebDriver(
          URI.create("http://192.168.3.46:4444/wd/hub").toURL(), capabilities);
    } else {
      WebDriverManager.chromedriver().setup();
      ChromeOptions options = new ChromeOptions();
      Map<String, Object> prefs = new HashMap<>();
      prefs.put("download.default_directory", new File("target/download").getAbsolutePath());
      options.setExperimentalOption("prefs", prefs);
      driver = new ChromeDriver(options);
    }

    driver.manage().window().maximize();
    DriverHolder.setDriver(driver);
  }

  @AfterClass public void tearDown() {
    driver.quit();
  }

  public MainPage openApp() {
    driver.get("https://the-internet.herokuapp.com");
    return new MainPage();
  }

}
