package life.sideworks.factory;

/**
 * @author shengboxu
 */

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this.owner + "のカードを使います。");
    }

    public String getOwner() {
        return this.owner;
    }
}
