package life.sideworks;

import life.sideworks.bridge.CountDisplay;
import life.sideworks.bridge.Display;
import life.sideworks.bridge.StringDisplayImpl;

/**
 * @author shengboxu
 */

public class BridgeSample {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
        Display d2 = new Display(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}