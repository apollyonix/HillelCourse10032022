package ua.hillel.lesson10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ProductPage {
  private final static Logger LOGGER = Logger.getLogger(ProductPage.class.getName());

  public void setProductStatus(int status) {
    LOGGER.log(Level.INFO, "Setting status " + status);



  }

  public void setProductStatus(ProductStatus status) {
    System.out.println(status.getStatus());
  }

//  public String getProductStatus(){
//    return "";///return productField.getText();
//    String status = productField.getText();;
//    return status;
//  }
}
