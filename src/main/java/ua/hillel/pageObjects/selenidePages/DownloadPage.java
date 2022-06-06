package ua.hillel.pageObjects.selenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DownloadPage {
  private final SelenideElement fileDownloadLink = $(By.linkText("TextDoc.txt"));

  public File downloadFile() throws FileNotFoundException {
    return fileDownloadLink.shouldBe(Condition.visible).download();
  }
}
