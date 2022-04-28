package ua.hillel.lesson18;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson18 {
  public static void main(String[] args) {
//    List<String> list = new ArrayList<>();
//
//
//
//    StaticClass staticClass = new StaticClass();
//    staticClass.name = "name";
//
//    StaticClass staticClass1 = new StaticClass();
//    staticClass1.name = "name1";

    Faker faker = new Faker();
    System.out.println(faker.name().firstName());
  }
}
