import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;
    
    public Hand() {
        hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        hand.add(card);
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    public void print() {
        for (Card card : hand) {
            System.out.println(card.toString());
        }
    }
    
    public int compareTo(Hand other) {
        int sum = 0;
        int otherSum = 0;
        for (Card card : hand) {
            sum += card.getValue();
        }
        for (Card card : other.hand) {
            otherSum += card.getValue();
        }
        return sum - otherSum;
        
        
    }
}
