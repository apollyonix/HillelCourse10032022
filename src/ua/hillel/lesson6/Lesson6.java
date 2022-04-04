package ua.hillel.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson6 {
  public static void main(String[] args) {
//    boolean flag1 = false;
//    boolean flag2 = false;
//    boolean flag3 = true;
//    int k=0;
//    for (int i=1; i<=50; i+=10) {
//      System.out.println(i);
//    }


    double[] dArray = new double[5];
//    System.out.println(Arrays.toString(dArray));

    System.out.println(dArray[1]);
    dArray[1] = 4.5;


    double a = 5.78;

    dArray[2] = a;


    float fArray[] = new float[6];


    char[] cArray = {'a', 'b', 'c', 'd'};

//    double s = a < 5 ? (a+10*2) : 2;


    String s = getStringValue();

    int j = 0;


    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    int i1 = list.get(1);


  }


  private static boolean getFlag1() {
    return false;
  }

  private static boolean getFlag2() {
    return true;
  }

  private static String getStringValue() {
    return null;
  }
}
