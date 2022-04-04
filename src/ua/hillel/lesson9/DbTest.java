package ua.hillel.lesson9;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DbTest {
  public static void main(String[] args) {
    DbUtils dbUtils = new DbUtils("prod", "prodUser", "prodPass");
    dbUtils.getSqlConnect();


    DbUtils dbTest = new DbUtils("stage", "stageUser", "stagePass");
    dbTest.getSqlConnect();

    DbUtils empty = new DbUtils();
    empty.getSqlConnect();

    User user = new User();
    user.setUsername("username").setName("name")
        .setAge(20).setLastname("lastname");
  }


}
