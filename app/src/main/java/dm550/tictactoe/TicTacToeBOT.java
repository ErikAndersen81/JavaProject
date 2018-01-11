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

    }
}
