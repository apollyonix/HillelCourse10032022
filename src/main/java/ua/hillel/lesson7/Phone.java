package ua.hillel.lesson7;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public abstract class Phone implements Listening, Filming {
  public void makeCall(String number) {
    System.out.println("calling " + number);
  }

  public void receiveCall(String number) {
    System.out.println("incoming call from " + number);
  }

  public abstract void readSms();

  public abstract void sendSmd(String number, String text);

  protected void initGsmModule() {
    System.out.println("init GSM module");
  }
}
