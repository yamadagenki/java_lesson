package life.sideworks;

import com.sun.tools.javac.util.List;
import life.sideworks.factory.Factory;
import life.sideworks.factory.IDCardFactory;
import life.sideworks.factory.Product;

/**
 * @author shengboxu
 */

public class FactorySample {
    public static void main(String[] args) {
        final Factory factory = new IDCardFactory();
        List.of("Tom", "Jack", "Jane").forEach(factory::create);
        ((IDCardFactory) factory).getOwners().forEach(Product::use);
    }
}
