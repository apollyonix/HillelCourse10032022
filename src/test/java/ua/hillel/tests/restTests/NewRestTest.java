package ua.hillel.tests.restTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.rest.RestUserEndpoint;
import ua.hillel.rest.User;

import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class NewRestTest {

  @Test
  public void newRestTest() throws IOException {
    User user = new User();
    user.setId(1358);
    user.setUsername("seruser1");
    user.setFirstName("serUser");
    user.setLastName("Test");
    user.setEmail("serUser@mail.com");
    user.setPhone("12345678");
    user.setUserStatus(1);
    user.setPassword("passs");

    RestUserEndpoint restUserEndpoint = new RestUserEndpoint();
    restUserEndpoint.createUser(user);

    User user1 = restUserEndpoint.getUserByUsername("seruser1");

    Assert.assertTrue(user1.equals(user));
  }
}
