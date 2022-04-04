package ua.hillel.lesson4;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Conditions {
  public static void main(String[] args) {
    //    System.out.println("before IF");
    //
        int val = getRandomValue();

    //    if (val %2 == 0) {
    //      System.out.println("inside if - 1");
    //    } else {
    //      System.out.println("inside ELSE");
    //    }

    //    if (val == 0) {
    //      System.out.println("zero");
    //    } else if (val < 3) {
    //      System.out.println("1 or 2");
    //    } else if (val < 9) {
    //      System.out.println("large value");
    //    } else {
    //      System.out.println("HUGE VALUE");
    //    }

    //    int innerValue;
    //    if (false) {
    //      innerValue = 10;
    //      System.out.println("inside IF 1");
    //      if (false) {
    //        System.out.println("inside IF 2 ");
    //      } else {
    //        System.out.println("inside ELSE 2");
    //      }
    //    } else {
    //
    //      System.out.println("inside ELSE 1");
    //    }

    //    System.out.println("after IF");

    String month = "MAY";

    switch (month) {
    case "DEC":
    case "JAN":
    case "FEB":
      System.out.println("summer");
      break;
    case "MAR":
    case "APR":
    case "MAY":
      System.out.println("autumn");
      break;
    case "JUN":
    case "JUL":
    case "AUG":
      System.out.println("winter");
      break;
    case "SEP":
    case "OCT":
    case "NOV":
      System.out.println("spring");
      break;
    default:
      System.out.println("invalid month");
    }

    int totalProductsInCatalog = 0;

    switch (totalProductsInCatalog) {
      case 1:
        System.out.println("MON");
        break;

    case 2:
      System.out.println("TUE");
      break;

    case 3:
      System.out.println("WED");
      break;

    default:
      System.out.println("invalid");
    }

    String value = totalProductsInCatalog % 2 == 0 ? "even" : "odd";
    User user = new User();
    String userValue = new User().role.equals("USER") ? "user" : "admin";
  }


  private static int getRandomValue() {
    Random random = new Random();
    return random.nextInt(10);
  }

  static class User {
    String role;
  }

}
