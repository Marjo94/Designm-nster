public interface GameBoardFactory {

    void createNewGameBoard();

    void printGameBoard();

    void shootAtTile(int x, int y);

    void fillWithShips();

    void fillWithSmallShips();

    void fillWithMediumShips();

    void fillWithLargeShips();


}
