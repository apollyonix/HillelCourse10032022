package ua.hillel.lesson10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ProductPage {
//  private static final Logger LOGGER = Logger.getLogger(ProductPage.class.getName());

  private static final MyLogger MY_LOGGER = new MyLogger();

  public void setProductStatus(int status) {

    if (status > 0) {
      MY_LOGGER.debug("Setting status " + status);
    } else {
      MY_LOGGER.log(MyLogger.LogLevel.WARN, "Cannot set product status");
      throw new IllegalArgumentException("status cannot be less 0");
    }




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
