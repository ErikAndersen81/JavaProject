package dm550.tictactoe;


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
                if(this.isMoveOptimal(point)){
                    return point;
                }
            }
        }
    }

    private boolean isMoveOptimal(Coordinate point) {

        return false;

        return true;
    }
}
