package ua.hillel.lesson10;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MyLogger {
  private final static String RED = "red";
  private final static String GREEN = "green";

  public void log(LogLevel level, String message) {
    switch (level) {
    case INFO:
      //setting color to GREEN
      System.out.println(message);
      break;
    case WARN:
      //setting color to YELLOW
      break;
    case ERROR:
      //setting color to RED
    }
  }

  public void info(String message) {
    logMessage(LogLevel.INFO, message, "console");
  }

  public void debug(String message) {
    logMessage(LogLevel.DEBUG, message);
  }

  public void error(String message) {
    logMessage(LogLevel.ERROR, message, "console", "db");
  }

  private void logMessage(LogLevel level, String message, String... logSource) {
    switch (level) {
    case INFO:
      //setting color to GREEN
      System.out.println(message);
      break;
    case ERROR:
      //setting color to RED
    }
  }

  public enum LogLevel {
    ERROR,
    WARN,
    INFO,
    DEBUG;
  }
}
