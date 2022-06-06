package ua.hillel.pageObjects.selenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UploadPage {
  private final SelenideElement fileUploadInput = $("#file-upload");
  private final SelenideElement fileSubmitButton = $("#file-submit");

  public void uploadFile(File file) {
    fileUploadInput.uploadFile(file);
    fileSubmitButton.shouldBe(Condition.enabled).click();
  }
}
