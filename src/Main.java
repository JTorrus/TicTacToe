public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("paco");
        Player player2 = new Player("pepe");

        Board board = new Board(player1, player2);
        board.createBoard();

        board.showBoard();

    }
}
