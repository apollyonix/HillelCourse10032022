package ua.hillel.tests.restTests;

import okhttp3.*;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class JsonRestTest {
  @Test
  public void jsonRestTest() throws IOException {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("id", 1234);
    jsonObject.put("username", "jsonUser");
    jsonObject.put("firstName", "json");
    jsonObject.put("lastName", "user");
    jsonObject.put("email", "json@mail.com");
    jsonObject.put("password", "json");
    jsonObject.put("phone", "1234567");
    jsonObject.put("userStatus", 1);

    RequestBody requestBody = RequestBody.create(jsonObject.toString(), MediaType.parse("application/json"));

    Request postRequest = new Request.Builder()
        .post(requestBody)
        .url("https://petstore.swagger.io/v2/user")
        //        .header("Content-Type", "application/json")
        .build();

    Response response = new OkHttpClient().newCall(postRequest).execute();

    System.out.println(response.code());
    String s = response.body().string();
    System.out.println(s);

    JSONObject responseObject = new JSONObject(s);

    System.out.println(responseObject.get("message"));
  }
}
