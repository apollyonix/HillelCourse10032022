package ua.hillel.tests.restTests;

import okhttp3.*;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RestTest {
  @Test
  public void restTest() throws IOException {
    String jsonString = "{\n" + "  \"id\": 1122,\n" + "  \"username\": \"autoUser\",\n"
        + "  \"firstName\": \"auto\",\n" + "  \"lastName\": \"user\",\n"
        + "  \"email\": \"success@mail.com\",\n" + "  \"password\": \"pass\",\n"
        + "  \"phone\": \"12345678\",\n" + "  \"userStatus\": 1\n" + "}";

    RequestBody requestBody = RequestBody.create(jsonString, MediaType.parse("application/json"));


//    Request request = new Request.Builder()
//        .get()
//        .url("https://petstore.swagger.io/v2/user/login?username=user&password=password")
//        .build();

    Request postRequest = new Request.Builder()
        .post(requestBody)
        .url("https://petstore.swagger.io/v2/user")
        .header("Content-Type", "application/json")
        .header("Auth", "token")
        .header("MyCustomHeader", "value")
        .build();

//    Response response = new OkHttpClient().newCall(request).execute();
    Response response = new OkHttpClient().newCall(postRequest).execute();

    System.out.println(response.code());
    System.out.println(response.body().string());
  }
}
