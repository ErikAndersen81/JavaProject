package dm550.tictactoe;


import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicTacToeBOT {
    private int numPlayers;
    private int botID;
    int t = 1;

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

        Coordinate x0y0 = new XYCoordinate(0,0);
        Coordinate x0y1 = new XYCoordinate(0,1);
        Coordinate x0y2 = new XYCoordinate(0,2);
        Coordinate x1y0 = new XYCoordinate(1,0);
        Coordinate x1y1 = new XYCoordinate(1,1);
        Coordinate x1y2 = new XYCoordinate(1,2);
        Coordinate x2y0 = new XYCoordinate(2,0);
        Coordinate x2y1 = new XYCoordinate(2,1);
        Coordinate x2y2 = new XYCoordinate(2,2);

        //Win
        Coordinate startPosition = new XYCoordinate(0, 0);
        for (int x = 0; x < boardSize; ++x) {
            for (int y = 0; y < boardSize; ++y) {
                Coordinate startPoint = new XYCoordinate(x, y);
                int horizontal = board.checkSequence(startPoint,1,0,1);
                int vertical = board.checkSequence(startPoint,0,1,1);
                int crossRightDown = board.checkSequence(x0y0,1,1,1);
                int crossLeftDown = board.checkSequence(x2y0,-1,1,1);
                if(vertical >= 2){
                    int xOfWin = startPoint.getX();
                    if(xOfWin == 0){
                        if(board.isFree(x0y0)){
                            return x0y0;
                        }
                        if(board.isFree(x0y1)){
                            return x0y1;
                        }
                        if(board.isFree(x0y2)){
                            return x0y2;
                        }

                    }
                    if(xOfWin == 1) {
                        if (board.isFree(x1y0)) {
                            return x1y0;
                        }
                        if (board.isFree(x1y1)) {
                            return x1y1;
                        }
                        if (board.isFree(x1y2)) {
                            return x1y2;
                        }
                    }
                    if(xOfWin == 2) {
                        if (board.isFree(x2y0)) {
                            return x2y0;
                        }
                        if (board.isFree(x2y1)) {
                            return x2y1;
                        }
                        if (board.isFree(x2y2)) {
                            return x2y2;
                        }
                    }
                };
                if(horizontal >= 2){
                    int yOfWin = startPoint.getY();
                    if(yOfWin == 0){
                        if(board.isFree(x0y0)){
                            return x0y0;
                        }
                        if(board.isFree(x1y0)){
                            return x1y0;
                        }
                        if(board.isFree(x2y0)){
                            return x2y0;
                        }

                    }
                    if(yOfWin == 1) {
                        if (board.isFree(x0y1)) {
                            return x0y1;
                        }
                        if (board.isFree(x1y1)) {
                            return x1y1;
                        }
                        if (board.isFree(x2y1)) {
                            move = x2y1;
                        }
                    }
                    if(yOfWin == 2) {
                        if (board.isFree(x0y2)) {
                            return x0y2;
                        }
                        if (board.isFree(x1y2)) {
                            return x1y2;
                        }
                        if (board.isFree(x2y2)) {
                            return x2y2;
                        }
                    }
                };
                if(crossRightDown > 1){
                    if(board.isFree(x0y0)){
                        return  x0y0;
                    }
                    if(board.isFree(x1y1)){
                        return  x1y1;
                    }
                    if(board.isFree(x2y2)) {
                        return x2y2;
                    }
                };
                if(crossLeftDown > 1) {
                    if (board.isFree(x2y0)) {
                        return x2y0;
                    }
                    if (board.isFree(x1y1)) {
                        return x1y1;
                    }
                    if (board.isFree(x0y2)) {
                        return x0y2;
                    }
                }
            }
        }

        //Block



        //Prevent fork

        if(!board.isFree(x0y0)){
            if(board.getPlayer(x0y0) == 1) {
                if (!board.isFree(x2y2)) {
                    if(board.getPlayer(x2y2) == 1) {
                        if (board.isFree(x1y2)) {
                            return x1y2;
                        }
                    }
                }
            }
        }


        if(!board.isFree(x2y0)){
            if(board.getPlayer(x2y0) == 1) {
                if (!board.isFree(x0y2)) {
                    if(board.getPlayer(x0y2) == 1) {
                        if (board.isFree(x1y2)) {
                            return x1y2;
                        }
                    }
                }
            }
        }

        if(!board.isFree(x1y0)){
            if(board.getPlayer(x1y0) == 1) {
                if (!board.isFree(x2y1)) {
                    if(board.getPlayer(x2y1) == 1) {
                        if (board.isFree(x2y0)) {
                            return x2y0;
                        }
                    }
                }
            }
        }

        if(!board.isFree(x0y1)){
            if(board.getPlayer(x0y1) == 1) {
                if (!board.isFree(x1y2)) {
                    if(board.getPlayer(x1y2) == 1) {
                        if (board.isFree(x0y2)) {
                            return x0y2;
                        }
                    }
                }
            }
        }

        if(!board.isFree(x2y1)){
            if(board.getPlayer(x2y1) == 1) {
                if (!board.isFree(x1y2)) {
                    if(board.getPlayer(x1y2) == 1) {
                        if (board.isFree(x2y2)) {
                            return x2y2;
                        }
                    }
                }
            }
        }

        if(!board.isFree(x0y2)){
            if(board.getPlayer(x0y2) == 1) {
                if (!board.isFree(x2y1)) {
                    if(board.getPlayer(x2y1) == 1) {
                        if (board.isFree(x1y2)) {
                            return x1y2;
                        }
                    }
                }
                if(!board.isFree(x1y0)){
                    if(board.getPlayer(x1y0) == 1 ){
                        if(board.isFree(x0y1)){
                            return x0y1;
                        }
                    }
                }
            }
        }

        if(!board.isFree(x2y2)){
            if(board.getPlayer(x2y2) == 1) {
                if (!board.isFree(x0y1)) {
                    if(board.getPlayer(x0y1) == 1) {
                        if (board.isFree(x1y2)) {
                            return x1y2;
                        }
                    }
                }
                if(!board.isFree(x1y0)){
                    if(board.getPlayer(x1y0) == 1 ){
                        if(board.isFree(x2y1)){
                            return x2y1;
                        }
                    }
                }
            }
        }

        if(!board.isFree(x0y0)){
            if(board.getPlayer(x0y0) == 1) {
                if (!board.isFree(x2y1)) {
                    if(board.getPlayer(x2y1) == 1) {
                        if (board.isFree(x1y0)) {
                            return x1y0;
                        }
                    }
                }
                if(!board.isFree(x1y2)){
                    if(board.getPlayer(x1y2) == 1 ){
                        if(board.isFree(x0y1)){
                            return x0y1;
                        }
                    }
                }
            }
        }

        if(!board.isFree(x2y0)){
            if(board.getPlayer(x2y0) == 1) {
                if (!board.isFree(x1y2)) {
                    if(board.getPlayer(x1y2) == 1) {
                        if (board.isFree(x2y1)) {
                            return x2y1;
                        }
                    }
                }
                if(!board.isFree(x0y1)){
                    if(board.getPlayer(x0y1) == 1 ){
                        if(board.isFree(x1y0)){
                            return x1y0;
                        }
                    }
                }
            }
        }


        //Centre

        if(board.isFree(x1y1)){
            return x1y1;
        }

        //Pick opposite corner of player
        if(!board.isFree(x0y0)){
            if(board.isFree(x2y2)) {
                if (board.getPlayer(x0y0) == 1) {
                    return x2y0;
                }
            }
        }

        if(!board.isFree(x2y0)){
            if(board.isFree(x0y2)) {
                if (board.getPlayer(x2y0) == 1) {
                    return x2y2;
                }
            }
        }

        if(!board.isFree(x2y2)){
            if(board.isFree(x0y0)){
                if (board.getPlayer(x2y2) == 1) {
                    return x0y0;
                }
            }
        }

        if(!board.isFree(x0y2)){
            if(board.isFree(x2y0)){
                if (board.getPlayer(x0y2) == 1) {
                    return x2y0;
                }
            }
        }
        //Pick a corner

        if(board.isFree(x0y0)){
            return  x0y0;
        }
        if(board.isFree(x0y2)){
            return  x0y2;
        }

        if(board.isFree(x2y0)){
            return  x2y0;
        }

        if(board.isFree(x2y2)){
            return  x2y2;
        }

        //Pick a side
        if(board.isFree(x0y1)){
            return  x0y1;
        }
        if(board.isFree(x1y0)){
            return  x1y0;
        }
        if(board.isFree(x2y1)){
            return  x2y1;
        }
        if(board.isFree(x1y2)){
            return  x1y2;
        }

        return move;
    }
}
