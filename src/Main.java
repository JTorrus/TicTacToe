import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Player> players = insertPlayers();
        Board board = new Board(players.get(0),players.get(1));

        board.createBoard();
        board.showBoard();

        while (true) {
            for (Player current: players) {
                current.makePlay(board);
                if (checkFinish(current)) break;
            }
        }

    }



    static ArrayList<Player> insertPlayers(){
        Player player1;
        Player player2;
        String auxName;
        ArrayList<Player> players = new ArrayList<>();
        System.out.print("Insert first player's name: ");
        auxName = sc.nextLine();
        player1 = new Player(auxName,"O");
        System.out.print("Insert second player's name: ");
        auxName = sc.nextLine();
        player2 = new Player(auxName,"X");
        players.add(player1);
        players.add(player2);
        return players;
    }

    static boolean checkFinish(Player player){
        boolean finish = false;
        int resultCol = 0;
        int resultRow = 0;

        if (player.getCellsQty()>=3){
            for (Cell cell: player.getCellsSelected()){
                resultCol += cell.getCol();
                resultRow += cell.getRow();
            }
            if ((resultCol+resultRow)%3==0){
                finish = true;
                System.out.println("Congratulations, "+player.getName()+" has Won!!!");
            }

        }

        return finish;
    }

}
