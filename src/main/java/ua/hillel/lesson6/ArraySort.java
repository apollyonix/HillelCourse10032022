package ua.hillel.lesson6;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ArraySort {
  public static void main(String[] args) {
    int[] array = {1,3,6,3, 4, 3, 10};
//    int[] array = new int[4];
    Random random = new Random();

//    for (int i=0; i<array.length; i++) {
//      array[i] = random.nextInt(50);
//    }

    System.out.println(Arrays.toString(array));

    boolean needSorting = true;
    while (needSorting) {
      needSorting = false;
      for (int i=0; i<array.length-1; i++) {
        if (array[i] < array[i+1]) {
          int tmp = array[i];
          array[i] = array[i+1];
          array[i+1] = tmp;
          needSorting = true;
        }
      }
    }

    System.out.println(Arrays.toString(array));
  }
}
