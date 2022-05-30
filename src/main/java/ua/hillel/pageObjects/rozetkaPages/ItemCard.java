package ua.hillel.pageObjects.rozetkaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ua.hillel.pageObjects.BasePage;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ItemCard {
  private final WebElement parent;
//  private By byTitle = By.cssSelector("a.goods-tile__heading");
//  private By byPrice = By.cssSelector("div.goods-tile__price");

  @FindBy(css = "a.goods-tile__heading")
  private WebElement title;

  @FindBy(css = "div.goods-tile__price")
  private WebElement price;

  public ItemCard(WebElement parent) {
    this.parent = parent;

    PageFactory.initElements(parent, this);
  }

  public String getTitle() {
    return title.getText();
  }

  public String getPrice() {
    return price.getText();
  }
}
