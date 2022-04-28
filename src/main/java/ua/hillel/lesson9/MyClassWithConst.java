package ua.hillel.lesson9;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MyClassWithConst {
  private String param;

  public MyClassWithConst() {
    param = "default";
  }

  public MyClassWithConst(String value) {
    System.out.println("create new object");
    param = value;
  }

  public MyClassWithConst(int value) {
    System.out.println("create new object");
    param = String.valueOf(value);

  }

  public MyClassWithConst(String value, int iValue) {
    System.out.println("create new object");
    param = value;
  }

  public String getParam() {
    return param;
  }





  public static void main(String[] args) {
    MyClassWithConst myClassWithConst = new MyClassWithConst();
    System.out.println(myClassWithConst.param);

    MyClassWithConst m2 = new MyClassWithConst("m2");

    MyClassWithConst m3 = new MyClassWithConst(12);

    System.out.println(m2.getParam());
    System.out.println();
  }
}
