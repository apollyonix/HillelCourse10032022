package ua.hillel.patterns;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class InstanceTest {
  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance();

    Singleton singleton2 = Singleton.getInstance();

    System.out.println(singleton1 == singleton2);
  }
}
