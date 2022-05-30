package ua.hillel.pageObjects.rozetkaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.hillel.pageObjects.BasePage;

import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MainPage extends BasePage {
  public Header header;

  private List<WebElement> recentlyViewed;

  public MainPage() {
    header = new Header();
  }

  public String getRecentlyViewItemTitle(int itemNum) {
    return new ItemCard(recentlyViewed.get(itemNum-1)).getTitle();
  }

  public String getRecentlyViewedItemPrice(String item) {
    return new ItemCard(recentlyViewed.stream().filter(el -> el.findElement(By.cssSelector("title")).equals(item)).findFirst().get())
        .getTitle();
  }
}
