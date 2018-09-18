import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean gameIsRunning = true;


        GameBoard playerBoard = new GameBoard();
        playerBoard.createNewGameBoard();
        playerBoard.fillWithShips();
        playerBoard.printGameBoard();


        BotGameBoard botBoard = new BotGameBoard();
        botBoard.createNewGameBoard();
        botBoard.fillWithShips();
        botBoard.printGameBoard();

        Scanner scanner = new Scanner(System.in);

        while (gameIsRunning) {
            int x;

            System.out.println("X: ");
            x = scanner.nextInt();


            System.out.println("Y: ");

            int y = scanner.nextInt();

            botBoard.shootAtTile(x, y);

            playerBoard.printGameBoard();
            botBoard.printGameBoard();

        }


    }

}
