package Kevin_Liu;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    ArrayList<Card> unDealt;
    ArrayList<Card> Dealt;

    public Deck(String[] Rank, String[] Suit, int[] pointValue)
    {
        List<Card> deck = new ArrayList<Card>();

        for(int s = 0;s<Suit.length;s++)
        {
            for(int i = 0;i<Rank.length;i++)
            {
                deck.add(new Card(Rank[i] , Suit[s], pointValue[i]));
            }
        }
    }
    public boolean isEmpty()
    {
        return unDealt.size() == 0;
    }
    public int size(int amount)
    {
        return unDealt.size();
    }
    public Card deal()
    {
        return unDealt.remove(0)
    }
}
