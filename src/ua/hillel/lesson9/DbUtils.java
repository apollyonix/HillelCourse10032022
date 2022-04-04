package ua.hillel.lesson9;

import java.sql.Connection;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DbUtils {
  private String dbName;
  private String dbUser;
  private String dbPass;

  public DbUtils() {
  }

  public DbUtils(String dbName, String dbUser, String dbPass) {
    this.dbName = dbName;
    this.dbUser = dbUser;
    this.dbPass = dbPass;
  }

  public Connection getSqlConnect() {

    return null;
  }
}
