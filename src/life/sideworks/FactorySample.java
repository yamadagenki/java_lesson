package life.sideworks;

import life.sideworks.factory.Factory;
import life.sideworks.factory.IDCardFactory;
import life.sideworks.factory.Product;

/**
 * @author shengboxu
 */

public class FactorySample {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("１１１");
        Product card2 = factory.create("222");
        Product card3 = factory.create("3３３");

        card1.use();
        card2.use();
        card3.use();

    }
}
