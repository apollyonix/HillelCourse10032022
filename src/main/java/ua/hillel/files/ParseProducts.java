package ua.hillel.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ParseProducts {
  public static void main(String[] args) throws IOException {
    File productsFile = new File("products.csv");

    List<String> lines = Files.readAllLines(productsFile.toPath());
    List<String> headers = Arrays.asList(lines.get(0).split(","));

    List<Map<String, String>> lineValues = new ArrayList<>();
    for (int i=1; i<lines.size(); i++) {
      List<String> values = Arrays.asList(lines.get(i).split(","));
      Map<String, String> map = new HashMap<>();

      for (int v=0; v<values.size(); v++) {
        map.put(headers.get(v), values.get(v));
      }
      lineValues.add(map);
    }


    lineValues.get(1).get("price");
    System.out.println(lineValues);
  }
}
