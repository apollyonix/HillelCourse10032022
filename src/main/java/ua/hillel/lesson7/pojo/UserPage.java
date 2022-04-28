package ua.hillel.lesson7.pojo;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UserPage {
  public void createUser(String username, String name, String lastname, String role, int age) {
    System.out.println("create user in old UI");
  }

  public void createUser(User user) {
    System.out.println("setting username: " + user.getUsername());
    System.out.println("setting age: " + user.getAge());
    System.out.println("setting role : " + user.getRole());


  }
}
