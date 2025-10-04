// All possible card ranks
public enum Rank {
    ACE("Ace"),
    TWO("Two"),
    THREE("Three"),
    FOUR("Four"),
    FIVE("Five"),
    SIX("Six"),
    SEVEN("Seven"),
    EIGHT("Eight"),
    NINE("Nine"),
    TEN("Ten"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King");

    String rankname;

    Rank(String rankname) {
        this.rankname = rankname;
    }

    public String getRankname() {
        return rankname;
    }
}

