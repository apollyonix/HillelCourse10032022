package ua.hillel.rest;

import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class OrderEndPoint {

  public Order createOrder(Order order) throws IOException {
    Gson gson = new Gson();
    String jsonString = gson.toJson(order);

    RequestBody requestBody = RequestBody.create(jsonString, MediaType.parse("applicatoion/json"));

    Request request = new Request.Builder()
        .post(requestBody)
        .url("")
        .build();

    Response response = new OkHttpClient().newCall(request).execute();
    if (response.code() != 200) {
      throw new RuntimeException("Request failed: " + response.body().string());
    }
    Order order1 = gson.fromJson(response.body().string(), Order.class);

    return order1;
  }

  public void deleteOrder(Long orderId) throws IOException {
    Request request = new Request.Builder()
        .delete()
        .url("https://petstore.swagger.io/v2/store/order/" + orderId)
        .build();

    Response response = new OkHttpClient().newCall(request).execute();
  }
}
