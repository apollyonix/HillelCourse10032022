package ua.hillel.lesson15;

import java.util.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CompareEx {
  public static void main(String[] args) {
//    Set<User> userSet = new TreeSet<>();
//    User user = new User();
//    user.setName("Jon");
//    user.setAge(18);
//
//    User user2 = new User();
//    user2.setName("Aria");
//    user2.setAge(15);
//
//    userSet.add(user);
//    userSet.add(user2);
//
//    System.out.println(userSet);

    List<Integer> list = Arrays.asList(1, 4, 6, 10, 7);

    Collections.sort(list, new MyComparator());
    System.out.println(list);
  }
}
