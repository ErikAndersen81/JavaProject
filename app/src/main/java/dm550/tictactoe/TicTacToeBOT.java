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
                //Determine whether the move is optimal or not
                if(this.winningMove(point)) {
                    move = point;
                }
                if(this.blockingMove(point)){
                    
                }
                if(this.forkMove(point)){

                }
                if(this.blockForkMove(point)){

                }
                if(this.potentialForkMove(point)){

                }
                if(this.centerMove(point)){

                }
                if(this.opposingCornerMove(point)){

                }
                if(this.emptyCornerMove(point)){

                }
            }
        }
        return move;
    }

    private boolean winningMove(Coordinate point) {
    }

    private boolean blockingMove(Coordinate point) {
    }

    private boolean forkMove(Coordinate point) {
    }

    private boolean blockForkMove(Coordinate point) {
    }

    private boolean potentialForkMove(Coordinate point) {
    }

    private boolean centerMove(Coordinate point) {
        
    }

    private boolean opposingCornerMove(Coordinate point) {
        
    }

    private boolean emptyCornerMove(Coordinate point) {
    }
    


    //WIN    
   

        //block

        //Fork

        //Block fork

            //force

        //Play center
        
}
