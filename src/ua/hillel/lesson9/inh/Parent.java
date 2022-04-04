package ua.hillel.lesson9.inh;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Parent {
  protected String parentName;

  public Parent(String parentName) {
    this.parentName = parentName;
    System.out.println("parent");
  }

  public void parentMethod() {

  }

  public void commonMethod(String cParam) {
    System.out.println("parent method with param " + cParam);
  }
}
