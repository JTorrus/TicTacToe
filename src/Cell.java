public class Cell {
    private boolean inUse;
    private String form;
    private int col;
    private int row;

    public Cell(boolean inUse, int col, int row) {
        this.inUse = inUse;
        this.form = "*";
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(String form) {
        this.inUse = true;
        this.form = form;
    }

    public String getForm() {
        return form;
    }
}
