package life.sideworks.decorator;

public class FullBorder extends Border {
    public FullBorder(final Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }
    
    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }
    
    @Override
    public String getRowText(final int row) {
        if (row == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }
    
    private String makeLine(final char ch, final int count) {
        final StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
