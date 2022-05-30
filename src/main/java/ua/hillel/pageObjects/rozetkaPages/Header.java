package ua.hillel.pageObjects.rozetkaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.hillel.pageObjects.BasePage;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Header extends BasePage {
  private WebElement logo;

  private WebElement menuButton;

  private WebElement searchInput;

  public Header() {
    super();
  }

  public void searchItem(String item) {
    searchInput.sendKeys(item);
  }

  public void goToMainPage() {
    logo.click();
  }
}
