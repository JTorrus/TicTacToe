public class Player {
    private String name;
    private String selection;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSelection() {
        return selection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }
}
