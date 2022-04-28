package ua.hillel.lesson9;

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

  public User setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getUsername() {
    return this.username;
  }

  public String getName() {
    return name;
  }

  public User setName(String name) {
    this.name = name;
    return this;
  }

  public String getLastname() {
    return lastname;
  }

  public User setLastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  public int getAge() {
    return age;
  }

  public User setAge(int age) {
    this.age = age;
    return this;
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
