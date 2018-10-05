package life.sideworks.abstractFactory.listfactory;

import life.sideworks.abstractFactory.factory.Item;
import life.sideworks.abstractFactory.factory.Page;
import java.util.Iterator;

/**
 * @author shengboxu
 */

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("oooo" + title + "oooo");
        buffer.append("oooo" + title + "oooo");
        buffer.append("oooo" + title + "oooo");
        buffer.append("oooo" + title + "oooo");
        Iterator it = content.iterator();

        while(it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        return buffer.toString();
    }
}
