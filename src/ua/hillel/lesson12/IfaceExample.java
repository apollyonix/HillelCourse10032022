package ua.hillel.lesson12;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class IfaceExample {
  public static void main(String[] args) {
    Iface iface = new Iface() {
      @Override
      public int getRandomValue() {
        return 1;
      }
    };

    iface.getRandomValue();


    Iface iface1 = new Iface() {
      @Override
      public int getRandomValue() {
        return 2;
      }
    };

    iface1.getRandomValue();


    anonClassMethod(() -> 0);

  }

  public static void anonClassMethod(Iface iface) {
    iface.getRandomValue();
  }
}
