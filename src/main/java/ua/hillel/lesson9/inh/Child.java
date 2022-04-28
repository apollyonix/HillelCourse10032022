package ua.hillel.lesson9.inh;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Child extends Parent {
  public Child(String childName) {
    super(childName);
    System.out.println("child");
    parentName.contains("test");
  }

  @Override
  public void commonMethod(String childParam) {
    super.commonMethod(childParam);
    System.out.println("child method with param " + childParam);


  }

}
