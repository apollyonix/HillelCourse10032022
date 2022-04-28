package ua.hillel.lesson7;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class IPhone extends Phone {
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
    System.out.println("play music on iphone");
  }

  @Override
  public void readSms() {
    System.out.println("read sms from iphone");
  }

  @Override
  public void sendSmd(String number, String text) {
    System.out.println("send sms from iphone: " + text + " to num " + number);
  }

  private void initCamera() {
    System.out.println("start iCamera");
  }
}
