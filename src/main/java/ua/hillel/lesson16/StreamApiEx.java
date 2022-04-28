package ua.hillel.lesson16;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class StreamApiEx {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("4", "0", "-1", "15", "-4", "7");

    //Old approach
    List<Integer> integerList = new ArrayList<>();
    for (String s : list) {
      integerList.add(Integer.valueOf(s));
    }

    Iterator<Integer> iterator = integerList.iterator();
    while (iterator.hasNext()) {
      if (iterator.next() < 0) {
        iterator.remove();
      }
    }

    int sum = 0;
    for (int num : integerList) {
      sum += num*100;
    }

    System.out.println(sum);


    //new app - StreamApi

    int streamSum = list.stream().map(Integer::valueOf).filter(n -> n>0)
        .map(n -> n*100).mapToInt(n -> Integer.valueOf(n)).sum();
    System.out.println(streamSum);



    List<Integer> newList = list.stream().map(Integer::valueOf).filter(n -> n>0)
        .map(n -> n*100).collect(Collectors.toList());

    int value = list.stream().map(Integer::valueOf).filter(n -> n>0)
        .map(n -> n*100).findAny().orElseThrow(() -> new RuntimeException("Cannot find number"));

  }
}
