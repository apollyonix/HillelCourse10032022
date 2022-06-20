package ua.hillel.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginPage extends BasePage {


  @FindBy(id = "username")
  private WebElement usernameInput;

  @FindBy(id = "password")
  private WebElement passInput;

  @FindBy(css = "button[type='submit']")
  private WebElement loginButton;

  @FindBy(css = ".flash.error")
  private WebElement errorAlert;

  public LoginPage() {
    PageFactory.initElements(driver, this);
  }

  public LoginPage setUsername(String username) {
    usernameInput.sendKeys(username);
    return this;
  }

  public LoginPage setPassword(String password) {
    passInput.sendKeys(password);
    return this;
  }

  public SecurePage clickLogin() {
    clickElement(loginButton);
    return new SecurePage(driver);
  }

  public LoginPage clickLoginWithInvalidCreds() {
    clickElement(loginButton);
    return new LoginPage();
  }

  public SecurePage login(String username, String password) {
    setUsername(username);
    setPassword(password);
    return clickLogin();
  }
}
