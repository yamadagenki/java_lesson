package life.sideworks;

import life.sideworks.decorator.Display;
import life.sideworks.decorator.FullBorder;
import life.sideworks.decorator.SideBorder;
import life.sideworks.decorator.StringDisplay;

/**
 * @author shengboxu
 */

public class DecoratorSample {
    public static void main(String[] args) {
        final Display b1 = new StringDisplay("Hello, world");
        final Display b2 = new SideBorder(b1, '#');
        final Display b3 = new FullBorder(b2);
        final Display b4 = new FullBorder(
                b3
        );
        final Display b5 = new FullBorder(
                b4
        );
        b1.show();
        b2.show();
        b3.show();
        b4.show();
        b5.show();
    }
}
