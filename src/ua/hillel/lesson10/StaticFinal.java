package ua.hillel.lesson10;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public final class StaticFinal {
  //  public final String s = "value1";
  //  public final String s1;

  //  public StaticFinal(String value) {
  //    s1 = value;
  //  }
  //
  //  public String getS() {
  //    return s;
  //  }
  //
  //  public  String getS1() {
  //    return s1;
  //  }

  public String nonStaticVar;

  public static String staticVar = "staticValue";

  public StaticFinal(String value) {
    nonStaticVar = value;
  }

  public String nonStaticMethod() {
    return nonStaticVar;
  }

  public static String staticMethod() {
    return staticVar;
  }
}
