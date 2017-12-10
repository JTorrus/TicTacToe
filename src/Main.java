import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Player> players = insertPlayers();

        Board board = new Board(players.get(0),players.get(1));

        board.createBoard();

        board.showBoard();

        for (int i = 0; i < 9; i++) {
            makePlay(board);
        }
    }



    static ArrayList<Player> insertPlayers(){
        Player player1;
        Player player2;
        String auxName;
        ArrayList<Player> players = new ArrayList<>();
        System.out.print("Insert first player's name: ");
        auxName = sc.nextLine();
        player1 = new Player(auxName,"X");
        System.out.print("Insert second player's name: ");
        auxName = sc.nextLine();
        player2 = new Player(auxName,"X");
        players.add(player1);
        players.add(player2);
        return players;
    }


    static void makePlay(Board board){
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
            board.showBoard();
        }
    }
}
