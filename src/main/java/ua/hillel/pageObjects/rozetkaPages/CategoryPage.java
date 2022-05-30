package ua.hillel.pageObjects.rozetkaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CategoryPage {
  @FindBy(css = "li.catalog-grid__cell")
  private List<WebElement> items;

  public String getItemTitle(int itemNum) {
    return new ItemCard(items.get(itemNum-1)).getTitle();
  }


}
