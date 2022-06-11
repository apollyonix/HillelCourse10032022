package ua.hillel.rest;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class User {
  private int id;
  private String username;
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private String phone;
  private int userStatus;


}
