package ua.hillel.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FileClass {
  public static void main(String[] args) throws IOException {
    File file = new File("testFile.txt");

    List<String> lines = Files.readAllLines(file.toPath());


    File newFile = new File("testFile_out.txt");
//    if (!newFile.exists()) {
//      newFile.createNewFile();
//    }


    // update lines with new values

    Files.write(newFile.toPath(), lines);

    System.out.println("done");

  }
}
