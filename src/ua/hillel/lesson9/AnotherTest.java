package ua.hillel.lesson9;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AnotherTest {
  public static void main(String[] args) {
    TestLib.createUser("user2");
    TestLib.createProduct("product2");


    int id = TestLib.createProductWithApi();
    //specific steps
  }
}
