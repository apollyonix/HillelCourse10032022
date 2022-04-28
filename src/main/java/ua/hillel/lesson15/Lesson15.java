package ua.hillel.lesson15;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson15 {
  public static void main(String[] args) {
//    Map<String, Integer> map = new LinkedHashMap<>();
//
//    map.put("str1", 1);
//    map.put("str1", 2);
//    map.put("str2", 2);
//
//    map.get("str3");


//    for (int value : map.values()) {
//      System.out.println(value);
//    }

//    for (String key : map.keySet()) {
//      if (key.contains("2")) {
//        continue;
//      }
//      System.out.println(map.get(key));
//    }

//    for (Map.Entry entry : map.entrySet()) {
//      System.out.printf("key: %s contains value %d%n", entry.getKey(), entry.getValue());
//    }
//
//    System.out.println(map);


    Map<User, String> userMap = new HashMap<>();
    User user = new User();
    user.setName("admin");

    System.out.println(user.hashCode());

    userMap.put(user, "admin");

    user.setRole("admin");
    user.setAge(20);
    System.out.println(user.hashCode());

    System.out.println(userMap.get(user));

    System.out.println(userMap);
  }
}
