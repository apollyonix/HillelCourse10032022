package ua.hillel.lesson7.pojo;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UserPageTest {
  public static void main(String[] args) {
    User user = new User();
    user.setUsername("new_user_111");
    user.setAge(20);

    User user1 = new User();
    user1.setUsername("new_user_112");
    user1.setAge(20);

    System.out.println(user);
    System.out.println(user1);
  }
}
