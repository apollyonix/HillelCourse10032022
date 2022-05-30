package ua.hillel.pageObjects.rozetkaPages;

import org.openqa.selenium.WebDriver;
import ua.hillel.pageObjects.BasePage;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ItemPage extends BasePage {
  public Header header;

  public ItemPage() {
    header = new Header();
  }


}
