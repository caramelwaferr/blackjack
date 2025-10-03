public class Card {
    public int rank;
    public char suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = (char) suit;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }
}
