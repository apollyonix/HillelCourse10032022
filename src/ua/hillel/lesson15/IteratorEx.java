package ua.hillel.lesson15;

import java.util.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class IteratorEx {
  public static void main(String[] args) {
//    List<String> list = new LinkedList<>();
//    list.add("one");
//    list.add("");
//    list.add("two");
//    list.add("");
//    list.add("three");
//
//    Iterator<String> iterator = list.iterator();
//    while (iterator.hasNext()) {
//      String s = iterator.next();
//      if (s.isEmpty()) {
//        iterator.remove();
//      }
//    }
//
//    System.out.println(list);



    List<String> columns = Arrays.asList("Name", "Jon", "Location", "The Wall", "Age", "18");
    Iterator<String> iterator = columns.iterator();
    while (iterator.hasNext()) {
      if (iterator.next().equals("Location")) {
        System.out.println(iterator.next());
        break;
      }
    }
  }
}
