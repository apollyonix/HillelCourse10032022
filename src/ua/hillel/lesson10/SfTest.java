package ua.hillel.lesson10;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SfTest {
  public static void main(String[] args) {
//    StaticFinal staticFinal = new StaticFinal("value2");
//    staticFinal.s = "value2";

//    StaticFinalChild child = new StaticFinalChild();


//    StaticFinal staticFinal = new StaticFinal("value1");
//    System.out.println(staticFinal.nonStaticVar);
//
//    StaticFinal staticFinal2 = new StaticFinal("value2");
//    System.out.println(staticFinal2.nonStaticVar);
//
//    System.out.println(StaticFinal.staticVar);
//
//    staticFinal.nonStaticMethod();
//
//    StaticFinal.staticMethod();
//
//
//
//    String sValue = "123";//value form page field
//    double price = TextUtil.getValueFromString(sValue);


    StaticFinal.staticMethod();

    StaticFinal staticFinal = new StaticFinal("nonStaticValue");
    staticFinal.nonStaticMethod();


  }
}
