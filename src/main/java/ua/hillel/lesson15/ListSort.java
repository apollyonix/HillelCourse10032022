package ua.hillel.lesson15;

import java.util.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ListSort {
  public static void main(String[] args) {
    List<Integer> inputList = new ArrayList<>();
    Random random = new Random();
    for (int i=0; i<10000; i++) {
      inputList.add(random.nextInt(500));
    }

    long start = System.currentTimeMillis();
    sortList(new ArrayList<>(inputList));
    long stop = System.currentTimeMillis();

    //bets 2
    System.out.println("Sorting ArrayList in " + (stop - start) + " ms");


    start = System.currentTimeMillis();
    sortList(new LinkedList<>(inputList));
    stop = System.currentTimeMillis();

    //bets 0
    System.out.println("Sorting LinkedList in " + (stop - start) + " ms");

    start = System.currentTimeMillis();
    Collections.sort(inputList);
    stop = System.currentTimeMillis();

    //bets 2
    System.out.println("Sorting Collection in " + (stop - start) + " ms");
  }

  private static void sortList(List<Integer> list) {
    boolean needSort = true;

    while (needSort) {
      needSort = false;
      for (int i=0; i<list.size()-1; i++) {
        if (list.get(i) > list.get(i+1)) {
          int tmp = list.get(i);
          list.set(i,list.get(i+1));
          list.set(i+1, tmp);
        }
      }
    }
  }
}
