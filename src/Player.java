import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;
    private String selection;
    private ArrayList<Cell> cellsSelected;
    private int victories;

    public Player(String name, String selection) {
        this.name = name;
        this.selection = selection;
        this.victories = 0;
        this.cellsSelected = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Cell> getCellsSelected() {
        return cellsSelected;
    }

    public String getSelection() {
        return selection;
    }

    public void makePlay(Game game) {
        Scanner sc = new Scanner(System.in);

        Cell[][] cells = game.getCells();
        int posX;
        int posY;
        System.out.println("Insert col position (" + this.name + ')');
        posX = sc.nextInt();
        System.out.println("Insert row position (" + this.name + ')');
        posY = sc.nextInt();

        if (cells[posY][posX].isInUse()) {
            System.out.println("This cell is already in use");
        } else {
            cells[posY][posX].setInUse(this.getSelection());
            cellsSelected.add(cells[posY][posX]);
            game.showBoard();
        }
    }

    public int getCellsQty() {
        return cellsSelected.size();
    }

    public void addVictory() {
        this.victories++;
    }

    public int getVictories() {
        return victories;
    }
}
