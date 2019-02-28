package life.sideworks.composite;

/**
 * @author xushengbo
 */

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(final Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    
    protected abstract void printList(final String prefix);
    
    public String toString() {
        return getName() + " (" + getSize() + ") ";
    }
}
