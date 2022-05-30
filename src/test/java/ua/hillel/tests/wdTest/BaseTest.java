package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ua.hillel.pageObjects.MainPage;
import ua.hillel.patterns.DriverHolder;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class BaseTest {
  public WebDriver driver;

  @BeforeClass
  public void setUp() {
    WebDriverManager.chromedriver().setup();

    ChromeOptions options = new ChromeOptions();

    Map<String, Object> prefs = new HashMap<>();

    prefs.put("download.default_directory", new File("target/download").getAbsolutePath());

    options.setExperimentalOption("prefs", prefs);

    driver = new ChromeDriver(options);
    driver.manage().window().maximize();



    DriverHolder.setDriver(driver);
  }

  @AfterClass
  public void tearDown() {
    driver.quit();
  }

  public MainPage openApp() {
    driver.get("https://the-internet.herokuapp.com");
    return new MainPage();
  }


}
