package life.sideworks.factory;

/**
 * @author shengboxu
 */

public class IDCard extends Product {
    final private String owner;

    public IDCard(final String owner) {
        System.out.println("we are creating the card for " + owner);
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("we are using the card of " + owner);
    }

    public String getOwner() {
        return owner;
    }
}
