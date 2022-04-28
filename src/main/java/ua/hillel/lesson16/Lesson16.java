package ua.hillel.lesson16;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson16 {
  public static void main(String[] args) {
//    LamIface lamIface = () -> {
//      String s = "Implementation";
//      return s.toLowerCase();
//    };

//    lamIface.doSomnth();
//    lamIface.doSomnth("value", 1);

    Predicate<Integer> predicate = num -> (num%2)==0;
//
//    System.out.println(predicate.test(14));
//    System.out.println(predicate.test(15));

    Consumer<String> consumer = s -> System.out.println(s);
    Consumer<String> consumer1 = System.out::println;

    consumer.accept("world");
//    consumer.accept("Jon");

    Supplier<Integer> supplier = () -> new Random().nextInt(100);
//    System.out.println(supplier.get());
//    System.out.println(supplier.get());

    Function<Integer, String> function = num -> "You entered num " + num;

    System.out.println(function.apply(10));
    System.out.println(function.apply(0));
  }
}
