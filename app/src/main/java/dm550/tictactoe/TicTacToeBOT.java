package dm550.tictactoe;


import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicTacToeBOT {
    private int numPlayers;
    private int botID;

    public TicTacToeBOT(int ID, int numPlayers) {
        this.botID = ID;
        this.numPlayers = numPlayers;
    }

    public int getBotID() {
        return this.botID;
    }

    public Coordinate makeMove(TTTBoard board) {
        int boardSize = board.getSize();
        Coordinate move = new XYCoordinate(0, 0);
        List<Coordinate> oppoCoordinates = new ArrayList<Coordinate>();
        for (int x = 0; x < boardSize; ++x) {
            for (int y = 0; y < boardSize; ++y) {
                Coordinate point = new XYCoordinate(x, y);
                if (board.getPlayer(point) == 1) {
                    oppoCoordinates.add(point);
                }
                //Test if the field is free or not.
                if (board.getPlayer(point) != 0) {
                    continue;

                }
            }
        }

        if(board.checkWin() == 2) {
        }

        return move;
    }
}
