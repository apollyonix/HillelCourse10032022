package ua.hillel.lesson9;

import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MethodEx {
  public static void main(String[] args) {
    System.out.println("start");

    methodWithoutReturn();

    int j = methodWithReturn();
    System.out.println(j);


    System.out.println("stop");
  }

  public static void methodWithoutReturn() {
//    System.out.println("no return");
  }

  public static int methodWithReturn() {
    Random random = new Random();
    int i = random.nextInt(100);

    return i+10;
  }


}
