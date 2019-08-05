package life.sideworks.factory;

/**
 * @author shengboxu
 */

public abstract class Factory {
    public final Product create(final String owner) {
        final Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(final String owner);
    protected abstract void registerProduct(final Product product);
}
