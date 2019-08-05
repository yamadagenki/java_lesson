package life.sideworks.strategy;

/**
 * @author xushengbo
 */

public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;
    
    public Player(final String name, final Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }
    
    public Hand nextHand() {
        return strategy.nextHand();
    }
    
    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }
    
    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }
    
    public void even() {
        gamecount++;
    }
    
    public String toString() {
        return new StringBuilder()
                .append("[")
                .append(name)
                .append(":")
                .append(gamecount)
                .append(" games, ")
                .append(wincount)
                .append(" win, ")
                .append(losecount)
                .append(" lose]")
                .toString();
    }
}
