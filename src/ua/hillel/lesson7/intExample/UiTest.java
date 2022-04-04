package ua.hillel.lesson7.intExample;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UiTest {
  public static void main(String[] args) {
    BEhavior bEhavior;
    if (args[0] == "new") {
      bEhavior = new NewUi();
    } else {
      bEhavior = new OldUi();
    }


    bEhavior.createProduct();
    bEhavior.createUser();
  }
}
