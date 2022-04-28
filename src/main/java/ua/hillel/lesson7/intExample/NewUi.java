package ua.hillel.lesson7.intExample;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class NewUi implements BEhavior {
  @Override public void createUser() {
    System.out.println("create user in new UI");
  }

  @Override public void createProduct() {
    System.out.println("create product in new UI");
  }
}
