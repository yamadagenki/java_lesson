package life.sideworks.strategy;

/**
 * @author shengboxu
 */

public class Hand {
    public static final int HAND_VALUE_GUU = 0;
    public static final int HAND_VALUE_CHO = 1;
    public static final int HAND_VALUE_PAA = 2;
    
    
    public static final Hand[] hand = {
            new Hand(HAND_VALUE_GUU),
            new Hand(HAND_VALUE_CHO),
            new Hand(HAND_VALUE_PAA),
    };
    
    private static final String[] name = {
            "グー", "チョキ", "パー",
    };
    
    private int handvalue;
    
    private Hand(final int handvalue) {
        this.handvalue = handvalue;
    }
    
    public static Hand getHand(final int handvalue) {
        return hand[handvalue];
    }
    
    public boolean isStrongerThan(final Hand h) {
        return fight(h) == 1;
    }
    
    public boolean isWeakerThan(final Hand h) {
        return fight(h) == -1;
    }
    
    private int fight(final Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        }
        return -1;
    }
    
    public String toString() {
        return name[handvalue];
    }
}
