package ua.hillel.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class HoverPage extends BasePage {
  @FindBy(css = "image")
  private List<WebElement> images;

  public String getUsername(int index) {
    actions.moveToElement(images.get(index-1)).perform();

    return images.get(index-1).findElement(By.tagName("span")).getText();

//    return getUsernameFromEl(images.get(1));
  }

  public List<String> getAllUsers() {
    List<String> result = new ArrayList<>();
    for (WebElement el : images) {
      result.add(getUsernameFromEl(el));
    }
    return result;
  }


  private String getUsernameFromEl(WebElement element) {
    actions.moveToElement(element).perform();

    return element.findElement(By.tagName("span")).getText();
  }

}
