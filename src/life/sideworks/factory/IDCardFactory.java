package life.sideworks.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shengboxu
 */

public class IDCardFactory extends Factory {
    // This list class should have add methods as we are using it in registerProduct.
    private final List<Product> owners = new ArrayList();

    @Override
    protected Product createProduct(final String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(final Product product) {
        owners.add(product);
    }

    public List<Product> getOwners() {
        return owners;
    }
}
