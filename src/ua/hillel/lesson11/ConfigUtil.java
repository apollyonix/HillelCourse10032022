package ua.hillel.lesson11;

import com.sun.security.jgss.GSSUtil;
import ua.hillel.lesson10.MyLogger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ConfigUtil {
  private static final Logger LOGGER = Logger.getLogger("");

  public static String getPropValue(String prop) {
//    File configFile = new File("asdasd.txt");
//    FileReader reader = new FileReader(configFile);

//

    System.out.println("method started");

    FileReader reader1 = null;
    try {
      new FileReader(new File(""));
      Thread.sleep(1000);
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (InterruptedException interruptedException) {
      //
    }
    finally {
      System.out.println("final code");
      try {
        reader1.close();
      } catch (IOException ioException) {}

    }

    try(FileReader reader = new FileReader(new File(""))) {
      reader.read();

    } catch (IOException | ArrayIndexOutOfBoundsException e) {
      throw new ButtonNotFoundException("Cannot find Activate button");

    }

    System.out.println("method completed");

    return "";
  }

  public static String getPropValueFromArray(int index) throws ArrayIndexOutOfBoundsException {
    String[] values = {"v1", "v2", "v3"};
    return values[index];
  }
}
