package ua.hillel.lesson5;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Loops {
  public static void main(String[] args) {
    System.out.println("before loop");

    boolean flag = true;
    for (int i = 2; i >-2; i--) {
      if (i==0) {
        continue;
      }
      System.out.println(5/i);
    }

    int j = 0;
//    while (j<-5) {
//      System.out.println("while loop " + j);
//      j++;
//    }
//
//    do {
//      System.out.println("do-while loop " + j);
//      j++;
//    } while (j<2);


//    String user1;
//    String user2;
//
//    user1 = getRandomUser();
//
//    do {
//      user2 = getRandomUser();
//
//    } while (user2.equals(user1));

    System.out.println("after loop");

  }


  private static String getRandomUser() {
    return "some random user";
  }
}
