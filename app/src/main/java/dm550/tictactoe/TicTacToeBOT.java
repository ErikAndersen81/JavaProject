package dm550.tictactoe;


import android.util.Log;

import java.util.Random;

public class TicTacToeBOT {
    private int numPlayers;
    private int botID;
    public TicTacToeBOT(int ID, int numPlayers){
        this.botID = ID;
        this.numPlayers = numPlayers;
    }

    public int getBotID(){
        return this.botID;
    }

    public Coordinate makeMove(TTTBoard board) {
        int boardSize = board.getSize();
        Coordinate move = new XYCoordinate(0,0);
        for(int x = 0; x < boardSize; ++x){
            for(int y = 0; y < boardSize; ++y){
                Coordinate point = new XYCoordinate(x,y);
                if(board.getPlayer(point) !=0) { continue;}

                Random r = new Random();
                int k = r.nextInt(2-0);
                int l = r.nextInt(2-0);

                Coordinate random = new XYCoordinate(k,l);
                move = random;
                //Determine whether the move is optimal or not
                //if(this.isMoveOptimal(point)){
                   // move = point;

            }
        }
        return move;
    }

    private boolean isMoveOptimal(Coordinate point) {
        //win

        //block

        //Fork

        //Block fork

            //force

        //Play center
        return true;
    }
}
