package life.sideworks;

import life.sideworks.template.AbstractDisplay;
import life.sideworks.template.CharDisplay;
import life.sideworks.template.StringDisplay;

/**
 * @author shengboxu
 */

public class TemplateSample {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');

        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        AbstractDisplay d3 = new StringDisplay("こんにちは。");

        d1.display();
        d2.display();
        d3.display();
    }
}
