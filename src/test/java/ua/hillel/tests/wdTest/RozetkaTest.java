package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RozetkaTest {
  private WebDriver driver;

  @BeforeClass
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @Test
  public void rozetkaTest() {
    driver.get("https://rozetka.com.ua/");


    driver.findElement(By.id("fat-menu")).click();

    WebElement menuItem = driver.findElement(
        By.cssSelector(".menu-categories li.menu-categories__item:nth-of-type(3)"));

    Actions actions = new Actions(driver);

    actions.moveToElement(menuItem).perform();
    WebElement item = driver.findElement(By.xpath("//*[contains(@class, 'state_hovered')]//a[@class='menu__link menu__link_background_gray' and contains(text(), 'Видеокарты')]"));

    actions.moveToElement(item);
    actions.click();
    actions.perform();


    setFilter("Rozetka");
    setFilter("ASUS");
    setFilter("GeForce RTX 3090");

    WebElement card = driver.findElement(By.cssSelector(".catalog-grid__cell:nth-of-type(1)"));

    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("arguments[0].scrollIntoView(true)", card);

    actions.moveToElement(card).perform();

    List<WebElement> descItems = card.findElements(By.cssSelector(".goods-tile__description-item"));
    descItems.forEach(descItem -> {
      System.out.print(descItem.findElement(By.tagName("span")).getText() + " - ");
      System.out.println(descItem.findElement(By.tagName("a")).getText());
    });

    card.click();

  }


  @AfterClass
  public void tearDown() {
    driver.quit();
  }

  private void setFilter(String id) {
    WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

    WebElement link = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//aside//a[contains(text(),'" + id + "')]/..")));
    webDriverWait.until(ExpectedConditions.elementToBeClickable(link)).click();
    webDriverWait.until(pageIsReady());
  }


  private ExpectedCondition<Boolean> pageIsReady() {
    return new ExpectedCondition<Boolean>() {
      @Override
      public Boolean apply(WebDriver webDriver) {
        WebElement main = driver.findElement(By.xpath("//main"));
        return !main.getAttribute("class").contains("preloader_type_element");
      }
    };
  }


}
