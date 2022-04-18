package ua.hillel.lesson15;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class WordCount {
  public static void main(String[] args) {
//    String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque vitae enim dolor. Donec pulvinar, nibh auctor vehicula porttitor, augue nisi luctus nunc, ac molestie sem orci vel diam. Cras lacus odio, auctor quis placerat ac, tempor sit amet neque. Pellentesque ultricies nisl neque, vel pharetra nunc rhoncus vitae. Ut porta turpis quam. Nam vel placerat ipsum, finibus auctor elit. Phasellus fermentum, nibh nec mollis ultrices, ex sapien rutrum orci, eu eleifend augue ipsum vitae ipsum. Nam finibus erat in lorem laoreet, sit amet pellentesque dui finibus. Nullam vel tristique quam. Aliquam posuere rhoncus purus, non congue eros bibendum quis. Sed.";
    String input = "Lorem ipsum dolor ipsum";
    String[] words = input.split(" ");

    Map<String, Integer> wordsMap = new HashMap<>();
    for (String word : words) {
      word = word.replace(",", "").replace(".", "").toLowerCase();

      if (wordsMap.containsKey(word)) {
        int count = wordsMap.get(word);
        wordsMap.put(word, ++count);
      } else {
        wordsMap.put(word, 1);
      }
    }

    System.out.println(wordsMap);

  }
}
