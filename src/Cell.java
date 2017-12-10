public class Cell {
    private boolean inUse;
    private String form;

    public Cell(boolean inUse) {
        this.inUse = inUse;
        this.form = "*";
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
