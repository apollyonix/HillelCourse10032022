package ua.hillel.lesson7;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AndroidPhone extends Phone {
  @Override
  public void readSms() {
    System.out.println("read sms from android");
  }

  @Override
  public void sendSmd(String number, String text) {
    initGsmModule();
    System.out.println("send sms from android: " + text + " to num " + number);
  }

  @Override
  public void makePhoto() {
    initCamera();
  }

  @Override
  public void makeClip() {
    initCamera();
  }

  @Override
  public void playMusic() {
    System.out.println("play music on android");
  }

  private void initCamera() {
    System.out.println("start android camera");
  }
}
