package ua.hillel.lesson9;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PokerMachine {
  private boolean deckSorted;

  public void shuffleDeck() {
    deckSorted = true;
  }

  public boolean isDeckSorted() {
    return deckSorted;
  }
}
