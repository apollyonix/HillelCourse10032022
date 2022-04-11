package ua.hillel.lesson10;

import java.util.logging.Logger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Product {
  public static final Logger LOGGER = Logger.getLogger(Product.class.getName());

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
