public class Board {
    private Cell[][] cells;
    private Player player1;
    private Player player2;

    public Board(Player player1, Player player2) {
        this.cells = createBoard();
        this.player1 = player1;
        this.player2 = player2;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public Cell[][] createBoard() {
        Cell[][] cells = new Cell[3][3];

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(false, j, i);
            }
        }

        return cells;
    }

    public void showBoard() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                System.out.print(cells[i][j].getForm() + " ");
            }

            System.out.println(" ");
        }
    }


}
