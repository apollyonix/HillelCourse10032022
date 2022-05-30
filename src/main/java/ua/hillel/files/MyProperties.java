package ua.hillel.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MyProperties {
  private static Properties properties = new Properties();



  public static String getPropValue(String propName) throws IOException {
    properties.load(new FileInputStream(new File("src/main/resources/app.properties")));

    return properties.getProperty(propName);
  }
}
