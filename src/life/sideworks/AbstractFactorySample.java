package life.sideworks;


import life.sideworks.abstractFactory.factory.Factory;
import life.sideworks.abstractFactory.factory.Link;
import life.sideworks.abstractFactory.factory.Page;
import life.sideworks.abstractFactory.factory.Tray;
import life.sideworks.abstractFactory.listfactory.ListFactory;

/**
 * @author shengboxu
 */

public class AbstractFactorySample {
    public static void main(String[] args) {

        Factory factory = Factory.getFactory("life.sideworks.abstractFactory.listfactory.ListFactory");
        Link google = factory.createLink("Google", "http://www.google.com");
        Link yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");

        Tray trayMedia = factory.createTray("Media");
        trayMedia.add(google);
        trayMedia.add(yahoo);

        Tray trayWeb = factory.createTray("Web");
        trayWeb.add(google);
        trayWeb.add(yahoo);

        Page page = factory.createPage("LinkPage", "shengboxu");
        page.add(trayMedia);
        page.add(trayWeb);
        page.output();
    }
}