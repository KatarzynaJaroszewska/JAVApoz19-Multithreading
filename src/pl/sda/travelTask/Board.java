package pl.sda.travelTask;

public class Board {

    int size;
    volatile boolean[][] board;

    public Board(int size) {
        this.size = size;
        board = createBoard(size);
    }

    private boolean[][] createBoard(int size) {
        boolean[][] taskBoard = new boolean[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                taskBoard[i][j] = true;
            }
        }
        return taskBoard;
    }

    public synchronized void printBoard(Board board) {

        for(int i = 0; i < board.getSize(); i++) {
            for(int j = 0; j < board.getSize(); j++) {
                if(board.getBoard()[i][j] == true) {
                    System.out.print(" O ");
                } else {
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
        System.out.println();
        notifyAll();
    }

    public int getSize() {
        return size;
    }

    public boolean[][] getBoard() {
        return board;
    }

}
