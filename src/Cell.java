public class Cell {
    private boolean inUse;
    private Player player;
    private String form;

    public Cell(boolean inUse) {
        this.inUse = inUse;
        this.form = "*";
    }

    public boolean isInUse() {
        return inUse;
    }

    public Player getPlayer() {
        return player;
    }

    public void setInUse() {
        this.inUse = true;
        this.form="O";
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getForm() {
        return form;
    }
}
