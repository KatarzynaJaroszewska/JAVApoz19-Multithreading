package pl.sda.travelTask;

import java.util.Random;

import static pl.sda.travelTask.Main.*;

public class Marker implements Runnable{

    private Board board;

    public Marker(Board board) {
        this.board = board;
    }

    public Random random = new Random();

    public void run() {

        while(isNotFinishYet()) {

            int i = random.nextInt(board.getSize());
            int j = random.nextInt(board.getSize());

            markTheFieldAsVisitedWhenNeeded(i, j);
            board.printBoard(board);
        }
        board.printBoard(board);
    }
}
