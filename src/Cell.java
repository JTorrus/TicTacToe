public class Cell {
    private boolean inUse;
    private String form;
    private int id;

    public Cell(boolean inUse, int id) {
        this.inUse = inUse;
        this.form = "*";
        this.id = id;
    }

    public int getId() {
        return id;
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
