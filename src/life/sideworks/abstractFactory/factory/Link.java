package life.sideworks.abstractFactory.factory;

/**
 * @author shengboxu
 */

public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
