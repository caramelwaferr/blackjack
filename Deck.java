import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<>();

    public Deck(ArrayList<Card> deck) {

        // Create cards for the deck
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                deck.add(new Card(r, s));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);  // Use Collections shuffle method to shuffle the card deck
    }
}
