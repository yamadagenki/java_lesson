package life.sideworks;

import life.sideworks.product.Manager;
import life.sideworks.product.MessageBox;
import life.sideworks.product.Product;
import life.sideworks.product.UnderlinePen;

/**
 * @author shengboxu
 */

public class PrototypeSample {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");

        Product p2 = manager.create("warning box");
        p2.use("hehehe");

        Product p3 = manager.create("slash box");
        p3.use("haeraea");
    }
}
