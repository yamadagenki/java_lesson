package life.sideworks;

import life.sideworks.builder.Director;
import life.sideworks.builder.TextBuilder;

/**
 * @author shengboxu
 */

public class BuilderSample {
    public static void main(String[] args) {
        TextBuilder textbuilder = new TextBuilder();
        Director director = new Director(textbuilder);
        director.construct();
        String result = textbuilder.getResult();
        System.out.println(result);
    }
}
