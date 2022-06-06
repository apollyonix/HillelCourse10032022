package ua.hillel.pageObjects.selenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DynamicControlsPage {
  private final SelenideElement checkbox = $("input[type='checkbox']");

  private final SelenideElement removeButton = $("#checkbox-example button");

  private final SelenideElement input = $("input[type='text']");

  private final SelenideElement enableButton = $("#input-example button");

  private final SelenideElement loader = $("#loading");

  public void addOrRemoveCheckbox(boolean isDelete) {
    removeButton.shouldBe(Condition.enabled).click();
    loader.should(Condition.exist).shouldBe(Condition.visible).shouldBe(Condition.not(Condition.visible));
    Object o = isDelete ? checkbox.shouldBe(Condition.not(Condition.visible)) : checkbox.shouldBe(Condition.visible);
  }
}
