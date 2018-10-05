package life.sideworks.abstractFactory.factory;

/**
 * @author shengboxu
 */

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("can't find " + classname + "class");
        } catch (IllegalAccessException e) {
            e.printStackTrace();

        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
