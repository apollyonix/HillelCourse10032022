package ua.hillel.lesson11;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MainClass {
  public static void main(String[] args) throws Exception {
    ConfigUtil.getPropValue("prop");

//    int index = new Random().nextInt(6);
//    ConfigUtil.getPropValueFromArray(index);

    long currentTime = System.currentTimeMillis();
    int attempt = 0;
    while (true) {
      if (++attempt > 20) {
        throw new Exception("max attempts reached");
      }
      //pro
    }

  }


}
