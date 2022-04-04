package ua.hillel.lesson9;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson9 {
  /*
  access_mod return_type method_name(params) {
  }
   */

  public void methodWithoutReturn() {

  }

  public int methodWithIntType() {
    return 0;
  }

  public String methodWithStrType() {
    return new String();
  }

  public int getFirstNumInArray(int[] array) {
    for (int el : array) {
      if (el % 5 == 0) {
        return el;
      }
    }
    return -1;
  }

  public void methodWithParams(String sParam, int intParam, boolean bolParam) {

  }

  public void methodWithVarArgs(int... intParams){
    int i = intParams[1];
  }

  public void methodWithVarArgs(int s, int i, int... params) {

  }

  public void methodWithVarArgs(double d) {

  }

  public void methodWithVarArgs(int s) {

  }

//  public String methodWithVarArgs(String s) {
//
//  }


  public void callMethod() {
    methodWithParams("s", 10, true);

    methodWithVarArgs();
    methodWithVarArgs(1);



  }
}
