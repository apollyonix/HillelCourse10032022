package ua.hillel.tests.restTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.rest.Order;
import ua.hillel.rest.OrderEndPoint;

import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class OrderTest {
  @Test
  public void orderCreationTest() throws IOException {
    Order order = new Order();
    order.setId(1234L);
    order.setPetId(123L);
    order.setQuantity(10);

    OrderEndPoint orderEndPoint = new OrderEndPoint();
    Order order1 = orderEndPoint.createOrder(order);

    Assert.assertEquals(order, order1);

    orderEndPoint.deleteOrder(order.getId());
  }
}
