package life.sideworks.abstractFactory.listfactory;

import life.sideworks.abstractFactory.factory.Factory;
import life.sideworks.abstractFactory.factory.Link;
import life.sideworks.abstractFactory.factory.Page;
import life.sideworks.abstractFactory.factory.Tray;

/**
 * @author shengboxu
 */

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
