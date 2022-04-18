package ua.hillel.lesson15;

import java.util.Objects;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class User implements Comparable<User> {
  private String name;
  private int age;
  private String role;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    User user = (User) o;
    return Objects.equals(name, user.name) && Objects.equals(age, user.age) && Objects.equals(role,
                                                                                              user.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, role);
  }

  @Override public String toString() {
    return "User{" + "name='" + name + '\'' + ", age=" + age + ", role='" + role + '\'' + '}';
  }

  @Override
  public int compareTo(User o) {
    if (this.age > o.age) return 1;
    else return 0;

  }
}
