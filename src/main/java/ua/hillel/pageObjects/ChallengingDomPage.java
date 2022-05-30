package ua.hillel.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ChallengingDomPage {
  @FindBy(xpath = "//table/tbody/tr/td[4]")
  private List<WebElement> cells;


  public List<String> getTableData() {
//    List<String> result = new ArrayList<>();
//    for (WebElement el : cells) {
//      result.add(el.getText());
//    }
//    return result;
    return cells.stream().map(el -> el.getText()).collect(Collectors.toList());
  }
}
