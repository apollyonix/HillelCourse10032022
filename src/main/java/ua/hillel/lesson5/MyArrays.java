package ua.hillel.lesson5;

import java.util.Arrays;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MyArrays {
  public static void main(String[] args) {

    String[] strArray = {"str1", "str2", "3", "4"};

//    for (int i=0; i<strArray.length; i++) {
//      System.out.println(strArray[i]);
//      strArray[i] = strArray[i] + "!";
//      System.out.println(strArray[i]);
//    }
//
//
//    for (String s : strArray) {
//      System.out.println(s);
//      s = s + "!";
//      System.out.println(s);
//    }


    String categories = "Smartphone,Laptop,Tablet,Watch,TV";

    String[] cats = categories.split(",");

    for (String cat : cats) {
      //go to cat and check products
    }

    for (int i=0; i< cats.length; i++) {

    }

    System.out.println(Arrays.toString(strArray));


  }


}
