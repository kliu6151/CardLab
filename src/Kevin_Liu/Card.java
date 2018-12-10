package Kevin_Liu;

public class Card {
    String Rank;
    String Suit;
    int pointValue;

    public Card(String Rank, String Suit, int pointValue)
    {
        this.Rank = Rank;
        this.Suit = Suit;
        this.pointValue =  pointValue;
    }
    public boolean equals(Card otherCard)
    {
        return this.pointValue == otherCard.pointValue;
    }
    public String toString()
    {
        return this.Rank + " " + " " + this.Suit + " " + this.pointValue;
    }
}
