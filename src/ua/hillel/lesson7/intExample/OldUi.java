package ua.hillel.lesson7.intExample;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class OldUi implements BEhavior {
  @Override
  public void createUser() {
    System.out.println("create user in old UI");
  }

  @Override
  public void createProduct() {
    System.out.println("create product in old UI");
  }
}
