package pl.sda.travelTask;

// tablica dwuwymiarowa boolean, mogą chodzić tylko po polach z true

import pl.sda.sender_receiver.Sender;

public class Main {
    public static Board board = new Board(10);

    public static synchronized void markTheFieldAsVisitedWhenNeeded(int i, int j){
        if (board.getBoard()[i][j] == true) {
            board.getBoard()[i][j] = false;
        }
    }

    public static synchronized boolean isNotFinishYet() {
        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; i < board.getSize(); i++) {
                if(board.getBoard()[i][j] == true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {


        board.printBoard(board);

        Thread marker1 = new Thread(new Marker(board));
        Thread marker2 = new Thread(new Marker(board));
        Thread marker3 = new Thread(new Marker(board));

        marker1.start();
        marker2.start();
        marker3.start();

        board.printBoard(board);
    }
}