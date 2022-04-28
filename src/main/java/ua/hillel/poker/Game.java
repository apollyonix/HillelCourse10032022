package ua.hillel.poker;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Game {
  public static void main(String[] args) {
    PokerMachine pokerMachine = new PokerMachine();
    CardDeck deck = pokerMachine.getNewCardDeck();
    deck = pokerMachine.shuffleDeck(deck);
    System.out.println(pokerMachine.getNextCard(deck));
    System.out.println(pokerMachine.getNextCard(deck));
    System.out.println(pokerMachine.getNextCard(deck));
  }
}
