package ua.hillel.rest;

import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RestUserEndpoint {
  public void createUser(User user) throws IOException {
    Gson gson = new Gson();
    String jsonString = gson.toJson(user);

    RequestBody requestBody = RequestBody.create(jsonString, MediaType.parse("application/json"));

    Request postRequest = new Request.Builder()
        .post(requestBody)
        .url("https://petstore.swagger.io/v2/user")
        //        .header("Content-Type", "application/json")
        .build();

    Response response = new OkHttpClient().newCall(postRequest).execute();
  }

  public User getUserByUsername(String username) throws IOException {
    Gson gson = new Gson();
    Request getRequest = new Request.Builder()
        .url("https://petstore.swagger.io/v2/user/" + username)
        .get()
        .build();

    Response response = new OkHttpClient().newCall(getRequest).execute();
    User newUser = gson.fromJson(response.body().string(), User.class);
    return newUser;
  }
}
