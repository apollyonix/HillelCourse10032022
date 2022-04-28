package ua.hillel.lesson10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ProductTest {

  private static final Logger LOGGER = Logger.getLogger(ProductTest.class.getName());

  public static void main(String[] args) {

//    new ProductPage().setProductStatus("asdasdasd");

//    new ProductPage().setProductStatus(ProductStatus.OUT_OF_SALE);//Out of Sale

//    LOGGER.log(Level.INFO, "Starting test");
//
//    System.out.println(ProductTest.class.getName());
//    new ProductPage().setProductStatus(123);

    Product product = new Product();
    product.setName("phone");

    Product product1 = new Product();
    product1.setName("laptop");

    System.out.println("done");
  }
}
