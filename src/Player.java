import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;
    private String selection;
    private ArrayList<Cell> cellsSelected;

    public Player(String name, String selection) {
        this.name = name;
        this.selection = selection;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public void makePlay(Board board){
        Scanner sc = new Scanner(System.in);

        Cell[][] cells = board.getCells();
        int posX;
        int posY;
        System.out.println("Insert col position");
        posX = sc.nextInt();
        System.out.println("Insert row position");
        posY = sc.nextInt();

        if (cells[posY][posX].isInUse()){
            System.out.println("This cell is already in use");
        }else{
            cells[posY][posX].setInUse();
            cellsSelected.add(cells[posY][posX]);
            board.showBoard();
        }
    }
}
