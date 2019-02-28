package life.sideworks.decorator;

/**
 * @author xushengbo
 */

public abstract class Border extends Display{
    protected Display display;
    protected Border(final Display display) {
        this.display = display;
    }
}
