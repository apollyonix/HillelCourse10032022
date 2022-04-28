package ua.hillel.poker;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Card {
  private String suite;
  private String value;

  public Card(String suite, String value) {
    this.suite = suite;
    this.value = value;
  }

  @Override
  public String toString() {
    return value + " of " + suite;
  }
}
