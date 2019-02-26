package life.sideworks;

import life.sideworks.strategy.Hand;
import life.sideworks.strategy.Player;
import life.sideworks.strategy.ProbStrategy;
import life.sideworks.strategy.WinningStrategy;

/**
 * @author xushengbo
 */

public class StrategySample {
    public static void main(String[] args) {
        final Player player1 = new Player("taro", new WinningStrategy(10));
        final Player player2 = new Player("jiro", new ProbStrategy(1));
        
        for (int i = 0; i < 1000; i++) {
            final Hand nextHand1 = player1.nextHand();
            final Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
            
            System.out.println(player1.toString());
            System.out.println(player2.toString());
        }
    }
}
