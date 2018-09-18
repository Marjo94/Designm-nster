import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BotGameBoard implements GameBoardFactory {

    private static final int MAX_SMALLSHIPS = 3;
    private static final int MAX_MEDIUMSHIP = 2;
    private static final int MAX_LARGESHIP = 1;

    private static final ArrayList<Integer> INVALID_SMALLSHIP_NUMBER =
            new ArrayList<>(Arrays.asList(8, 9, 18, 19, 28, 29, 38, 39, 48, 49, 58, 59, 68, 69, 78, 79, 88, 89, 98, 99));
    private static final ArrayList<Integer> INVALID_MEDIUMSHIP_NUMBER =
            new ArrayList<>(Arrays.asList(7, 8, 9, 17, 18, 19, 27, 28, 29, 37, 38, 39, 47, 48, 49, 57, 58, 59, 67, 68,
                    69, 77, 78, 79, 87, 88, 89, 97, 98, 99));
    private static final ArrayList<Integer> INVALID_LARGESHIP_NUMBER =
            new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 15, 16, 17, 18, 19, 25, 26, 27, 28, 29, 35, 36, 37, 38, 39, 45,
                    46, 47, 48, 49, 55, 56, 57, 58, 59, 65, 66, 67, 68, 69, 75, 76, 77, 78, 79, 85, 86, 87, 88, 89, 95, 96, 97, 98, 99));

    private ArrayList<Tile> gameBoard;

    private ShipFactory shipCreator = new ShipCreator();

    public void createNewGameBoard() {

        ArrayList<Tile> gameBoard = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Tile tile = new Tile(false);
            gameBoard.add(tile);

        }
        this.gameBoard = gameBoard;

    }

    @Override
    public void printGameBoard() {

        System.out.println("Bot Game Board");
        System.out.println("---------------");

        for (int i = 0; i < gameBoard.size(); i++) {

            if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50 || i == 60 || i == 70 || i == 80 || i == 90) {
                System.out.print("\n");
            }

            Tile tile = gameBoard.get(i);


            if (tile.hasShip() && tile.beenShot()) {
                System.out.print("♦");
            } else if (tile.hasShip()) {
                System.out.print("♣");
            } else {
                if (tile.beenShot()) {
                    System.out.print("*");
                } else {
                    System.out.print("~");
                }
            }
        }
        System.out.println("\n");


    }

    @Override
    public void shootAtTile(int x, int y) {

        Tile tile = gameBoard.get(x * 10 + y);
        tile.setBeenShot(true);


    }

    @Override
    public void fillWithShips() {

        fillWithSmallShips();
        fillWithMediumShips();
        fillWithLargeShips();

    }

    @Override
    public void fillWithSmallShips() {

        for (int i = 0; i < 3; i++) {

            Ship smallShip = shipCreator.createSmallShip();

            boolean validNumber = true;
            boolean numberHasShip = false;
            int result;

            Random r = new Random();
            int low = 10;
            int high = 100;
            do {
                result = r.nextInt(high - low) + low;

                for (int j = 0; j < INVALID_SMALLSHIP_NUMBER.size(); j++) {
                    if (INVALID_SMALLSHIP_NUMBER.get(j) == result) {
                        validNumber = false;
                    }
                }

                if (!gameBoard.get(result).hasShip() && !gameBoard.get(result + 1).hasShip()) {
                    numberHasShip = true;
                }

            } while (validNumber && !numberHasShip);

            gameBoard.get(result).setHasShip(true);
            gameBoard.get(result + 1).setHasShip(true);

        }

    }

    @Override
    public void fillWithMediumShips() {

        for (int i = 0; i < 3; i++) {

            Ship mediumShip = shipCreator.createMediumShip();

            boolean validNumber = true;
            boolean numberHasShip = false;
            int result;

            Random r = new Random();
            int low = 10;
            int high = 100;
            do {
                result = r.nextInt(high - low) + low;

                for (int j = 0; j < INVALID_MEDIUMSHIP_NUMBER.size(); j++) {
                    if (INVALID_MEDIUMSHIP_NUMBER.get(j) == result) {
                        validNumber = false;
                    }
                }

                if (!gameBoard.get(result).hasShip() && !gameBoard.get(result + 1).hasShip() && !gameBoard.get(result + 2).hasShip()) {
                    numberHasShip = true;
                }

            } while (validNumber && !numberHasShip);

            gameBoard.get(result).setHasShip(true);
            gameBoard.get(result + 1).setHasShip(true);
            gameBoard.get(result + 2).setHasShip(true);

        }


    }

    @Override
    public void fillWithLargeShips() {

        for (int i = 0; i < 3; i++) {

            Ship mediumShip = shipCreator.createMediumShip();

            boolean validNumber = true;
            boolean numberHasShip = false;
            int result;

            Random r = new Random();
            int low = 10;
            int high = 100;
            do {
                result = r.nextInt(high - low) + low;

                for (int j = 0; j < INVALID_LARGESHIP_NUMBER.size(); j++) {
                    if (INVALID_LARGESHIP_NUMBER.get(j) == result) {
                        validNumber = false;
                    }
                }

                if (!gameBoard.get(result).hasShip() && !gameBoard.get(result + 1).hasShip() && !gameBoard.get(result + 2).hasShip()
                        && !gameBoard.get(result + 3).hasShip() && !gameBoard.get(result + 4).hasShip()) {
                    numberHasShip = true;
                }

            } while (validNumber && !numberHasShip);

            gameBoard.get(result).setHasShip(true);
            gameBoard.get(result + 1).setHasShip(true);
            gameBoard.get(result + 2).setHasShip(true);
            gameBoard.get(result + 3).setHasShip(true);
            gameBoard.get(result + 4).setHasShip(true);

        }
    }
}

