public class Cell {
    private boolean inUse;
    private Player player;

    public Cell(boolean inUse, Player player) {
        this.inUse = inUse;
        this.player = player;
    }

    public boolean isInUse() {
        return inUse;
    }

    public Player getPlayer() {
        return player;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
