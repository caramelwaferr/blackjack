// All possible card suits
public enum Suit {
    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    String suitname;

    Suit(String suitname) {
        this.suitname = suitname;
    }
    public String getSuitname() {   // For printing purposes
        return suitname;
    }
}
