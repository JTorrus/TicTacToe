import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Player> players = insertPlayers();
        Board board = new Board(players.get(0), players.get(1));
        int counter = 0;
        boolean finish = false;

        board.createBoard();
        board.showBoard();

        while (!finish) {
            for (Player current : players) {
                current.makePlay(board);
                if (checkFinish(current)){
                    finish=true;
                    break;
                }
                counter++;
                if (counter==9){
                    finish = true;
                    System.out.println("There was a tie, Congratulations to both players");
                    break;
                }
            }
        }
    }

    static ArrayList<Player> insertPlayers() {
        Player player1;
        Player player2;
        String auxName;
        ArrayList<Player> players = new ArrayList<>();
        System.out.print("Insert first player's name: ");
        auxName = sc.nextLine();
        player1 = new Player(auxName, "O");
        System.out.print("Insert second player's name: ");
        auxName = sc.nextLine();
        player2 = new Player(auxName, "X");
        players.add(player1);
        players.add(player2);
        return players;
    }

    static boolean checkFinish(Player player) {
        boolean finish = false;
        ArrayList<Integer> cellIdList = new ArrayList<>();

        if (player.getCellsQty() >= 3) {
            for (Cell cell : player.getCellsSelected()) {
                cellIdList.add(cell.getId());
            }
            if ((cellIdList.contains(1) && cellIdList.contains(2) && cellIdList.contains(3)) || (cellIdList.contains(4) && cellIdList.contains(5) && cellIdList.contains(6)) || (cellIdList.contains(7) && cellIdList.contains(8) && cellIdList.contains(9))) {
                finish = true;
                System.out.println("Congratulations, " + player.getName() + " has Won!!!");
            }else if ((cellIdList.contains(1) && cellIdList.contains(4) && cellIdList.contains(7)) || (cellIdList.contains(2) && cellIdList.contains(5) && cellIdList.contains(8)) || (cellIdList.contains(3) && cellIdList.contains(6) && cellIdList.contains(9))){
                finish = true;
                System.out.println("Congratulations, " + player.getName() + " has Won!!!");
            }else if ((cellIdList.contains(1) && cellIdList.contains(5) && cellIdList.contains(9)) || (cellIdList.contains(3) && cellIdList.contains(5) && cellIdList.contains(7))){
                finish = true;
                System.out.println("Congratulations, " + player.getName() + " has Won!!!");
            }

        }

        return finish;
    }

}
