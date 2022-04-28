package ua.hillel.lesson7.pojo;

import java.util.Objects;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class User {
  private String username;
  private String name;
  private String lastname;
  private int age;
  private String role;

  private boolean access;

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return this.username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    if (role.equals("admin")) {
      System.out.println("ADMIN role");
      access = true;
    } else if (role.equals("user")) {
      System.out.println("USER role");
      access = false;
    } else {
      System.out.println("WRONG ROLE");
    }
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    User user = (User) o;
    return this.username.equals(user.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, name, lastname, age, role, access);
  }

  @Override
  public String toString() {
    return "User{" + "login='" + username + '\'' + ", name='" + name + '\'' + ", lastname='"
        + lastname + '\'' + ", age=" + age + ", role='" + role + '\'' + '}';
  }
}
