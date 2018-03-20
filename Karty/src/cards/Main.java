package cards;
 
import static cards.Table.*;
 
public class Main {
 
    public static void main(String[] args) {
        Table table = new Table();
        table.deck.printAllCards();
        System.out.println();
        table.deck.strongerCard("10", "4");
        System.out.println();
        table.deck.mixDeckOfCards();
        table.deck.printAllCards();
        System.out.println();
        Card[] myCards = table.deck.dealTheCards(6);
        for (int i=0; i<myCards.length; i++) {
            System.out.print(myCards[i].getCardName() + " ");
        }
        System.out.println();
        table.deck.printAllCards();
       
    }
 
}