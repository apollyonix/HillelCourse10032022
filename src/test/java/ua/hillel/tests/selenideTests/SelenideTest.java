package ua.hillel.tests.selenideTests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pageObjects.selenidePages.DownloadPage;
import ua.hillel.pageObjects.selenidePages.UploadPage;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SelenideTest {
//  @Test
  public void selenideTest() {
//    Configuration.browser = "firefox";
    Configuration.baseUrl = "https://the-internet.herokuapp.com";
    Configuration.downloadsFolder = "target/download/";


//    open("/download");

    $(".example").shouldBe(Condition.visible).shouldBe(Condition.enabled).click();
    $x("//*[@class='example']");


    $$(".example");
    $$x("//*[@class='example']");

    open("/file-upload");
    System.out.println("done");
  }

  @Test
  public void fileTest() throws FileNotFoundException {
    Configuration.baseUrl = "https://the-internet.herokuapp.com";
    Configuration.downloadsFolder = "target/download/";

    open("/download");

    File downloadedFile = new DownloadPage().downloadFile();

    open("/upload");

    new UploadPage().uploadFile(downloadedFile);


  }

}
