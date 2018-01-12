package dm550.tictactoe;

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

            //Horizontally
            if(!board.isFree(x0y0)){
                if(board.getPlayer(x0y0) == 2){
                    if(!board.isFree(x1y0)){
                        if (board.getPlayer(x1y0) == 2) {
                            if(board.isFree(x2y0)) {
                                return x2y0;
                            }
                        }
                    }
                    if(!board.isFree(x2y0)){
                        if (board.getPlayer(x2y0) == 2) {
                            if (board.isFree(x1y0)) {
                                return x1y0;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x1y0)){
                    if(board.getPlayer(x1y0) == 2){
                        if(!board.isFree(x2y0)){
                            if (board.getPlayer(x2y0) == 2){
                                if(board.isFree(x0y0)) {
                                    return x0y0;
                                }
                            }
                        }
                    }
                }
            }

            if(!board.isFree(x0y1)){
                if(board.getPlayer(x0y1) == 2){
                    if(!board.isFree(x1y1)){
                        if (board.getPlayer(x1y1) == 2) {
                            if(board.isFree(x2y1)) {
                                return x2y1;
                            }
                        }
                    }
                    if(!board.isFree(x2y1)){
                        if (board.getPlayer(x2y1) == 2) {
                            if(board.isFree(x1y1))
                            return x1y1;
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x1y1)){
                    if(board.getPlayer(x1y1) == 2){
                        if(!board.isFree(x2y1)){
                            if (board.getPlayer(x2y1) == 2){
                                if(board.isFree(x0y1))
                                return x0y1;
                            }
                        }
                    }
                }
            }

            if(!board.isFree(x0y2)){
                if(board.getPlayer(x0y2) == 2){
                    if(!board.isFree(x1y2)){
                        if (board.getPlayer(x1y2) == 2) {
                            if(board.isFree(x2y2)) {
                                return x2y2;
                            }
                        }
                    }
                    if(!board.isFree(x2y2)){
                        if (board.getPlayer(x2y2) == 2) {
                            if(board.isFree(x1y2)) {
                                return x1y2;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x1y2)){
                    if(board.getPlayer(x1y2) == 2){
                        if(!board.isFree(x2y2)){
                            if (board.getPlayer(x2y2) == 2){
                                if(board.isFree(x0y2)) {
                                    return x0y2;
                                }
                            }
                        }
                    }
                }
            }

            //Vertically

            if(!board.isFree(x0y0)){
                if(board.getPlayer(x0y0) == 2){
                    if(!board.isFree(x0y1)){
                        if (board.getPlayer(x0y1) == 2) {
                            if(board.isFree(x0y2)) {
                                return x0y2;
                            }
                        }
                    }
                    if(!board.isFree(x0y2)){
                        if (board.getPlayer(x0y2) == 2) {
                            if(board.isFree(x0y1)) {
                                return x0y1;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x0y1)){
                    if(board.getPlayer(x0y1) == 2){
                        if(!board.isFree(x0y2)){
                            if (board.getPlayer(x0y2) == 2){
                                if(board.isFree(x0y0)) {
                                    return x0y0;
                                }
                            }
                        }
                    }
                }
            }

            if(!board.isFree(x1y0)){
                if(board.getPlayer(x1y0) == 2){
                    if(!board.isFree(x1y1)){
                        if (board.getPlayer(x1y1) == 2) {
                            if(board.isFree(x1y2)) {
                                return x1y2;
                            }
                        }
                    }
                    if(!board.isFree(x1y2)){
                        if (board.getPlayer(x1y2) == 2) {
                            if(board.isFree(x1y1)) {
                                return x1y1;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x1y1)){
                    if(board.getPlayer(x1y1) == 2){
                        if(!board.isFree(x1y2)){
                            if (board.getPlayer(x1y2) == 2){
                                if(board.isFree(x1y0)) {
                                    return x1y0;
                                }
                            }
                        }
                    }
                }
            }

            if(!board.isFree(x2y0)){
                if(board.getPlayer(x2y0) == 2){
                    if(!board.isFree(x2y1)){
                        if (board.getPlayer(x2y1) == 2) {
                            if(board.isFree(x2y2)) {
                                return x2y2;
                            }
                        }
                    }
                    if(!board.isFree(x2y2)){
                        if (board.getPlayer(x2y2) == 2) {
                            if(board.isFree(x2y1)) {
                                return x2y1;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x2y1)){
                    if(board.getPlayer(x2y1) == 2){
                        if(!board.isFree(x2y2)){
                            if (board.getPlayer(x2y2) == 2){
                                if(board.isFree(x2y0)) {
                                    return x2y0;
                                }
                            }
                        }
                    }
                }
            }

            //Downright

            if(!board.isFree(x0y0)){
                if(board.getPlayer(x0y0) == 2){
                    if(!board.isFree(x1y1)){
                        if (board.getPlayer(x1y1) == 2) {
                            if(board.isFree(x2y2)) {
                                return x2y2;
                            }
                        }
                    }
                    if(!board.isFree(x2y2)){
                        if (board.getPlayer(x2y2) == 2) {
                            if(board.isFree(x1y1)) {
                                return x1y1;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x1y1)){
                    if(board.getPlayer(x1y1) == 2){
                        if(!board.isFree(x2y2)){
                            if (board.getPlayer(x2y2) == 2){
                                if(board.isFree(x0y0)) {
                                    return x0y0;
                                }
                            }
                        }
                    }
                }
            }

            //Downleft

            if(!board.isFree(x2y0)){
                if(board.getPlayer(x2y0) == 1){
                    if(!board.isFree(x1y1)){
                        if (board.getPlayer(x1y1) == 2) {
                            if(board.isFree(x0y2)) {
                                return x0y2;
                            }
                        }
                    }
                    if(!board.isFree(x0y2)){
                        if (board.getPlayer(x0y2) == 2) {
                            if(board.isFree(x1y1)) {
                                return x1y1;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x1y1)){
                    if(board.getPlayer(x1y1) == 2){
                        if(!board.isFree(x0y2)){
                            if (board.getPlayer(x0y2) == 2){
                                if(board.isFree(x2y0)) {
                                    return x2y0;
                                }
                            }
                        }
                    }
                }
            }


        //Block

            //Horizontally
            if(!board.isFree(x0y0)){
                if(board.getPlayer(x0y0) == 1){
                    if(!board.isFree(x1y0)){
                        if (board.getPlayer(x1y0) == 1) {
                            if(board.isFree(x2y0)) {
                                return x2y0;
                            }
                        }
                    }
                    if(!board.isFree(x2y0)){
                        if (board.getPlayer(x2y0) == 1) {
                            if(board.isFree(x1y0)) {
                                return x1y0;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x1y0)){
                    if(board.getPlayer(x1y0) == 1){
                        if(!board.isFree(x2y0)){
                            if (board.getPlayer(x2y0) == 1){
                                if(board.isFree(x0y0)) {
                                    return x0y0;
                                }
                            }
                        }
                    }
                }
            }

            if(!board.isFree(x0y1)){
                if(board.getPlayer(x0y1) == 1){
                    if(!board.isFree(x1y1)){
                        if (board.getPlayer(x1y1) == 1) {
                            if(board.isFree(x2y1)) {
                                return x2y1;
                            }
                        }
                    }
                    if(!board.isFree(x2y1)){
                        if (board.getPlayer(x2y1) == 1) {
                            if(board.isFree(x1y1)) {
                                return x1y1;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x1y1)){
                    if(board.getPlayer(x1y1) == 1){
                        if(!board.isFree(x2y1)){
                            if (board.getPlayer(x2y1) == 1){
                                if(board.isFree(x0y1)) {
                                    return x0y1;
                                }
                            }
                        }
                    }
                }
            }

            if(!board.isFree(x0y2)){
                if(board.getPlayer(x0y2) == 1){
                    if(!board.isFree(x1y2)){
                        if (board.getPlayer(x1y2) == 1) {
                            if(board.isFree(x2y2)) {
                                return x2y2;
                            }
                        }
                    }
                    if(!board.isFree(x2y2)){
                        if (board.getPlayer(x2y2) == 1) {
                            if(board.isFree(x1y2)) {
                                return x1y2;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x1y2)){
                    if(board.getPlayer(x1y2) == 1){
                        if(!board.isFree(x2y2)){
                            if (board.getPlayer(x2y2) == 1){
                                if(board.isFree(x0y2)) {
                                    return x0y2;
                                }
                            }
                        }
                    }
                }
            }

            //Vertically

            if(!board.isFree(x0y0)){
                if(board.getPlayer(x0y0) == 1){
                    if(!board.isFree(x0y1)){
                        if (board.getPlayer(x0y1) == 1) {
                            if(board.isFree(x0y2)) {
                                return x0y2;
                            }
                        }
                    }
                    if(!board.isFree(x0y2)){
                        if (board.getPlayer(x0y2) == 1) {
                            if(board.isFree(x0y1)) {
                                return x0y1;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x0y1)){
                    if(board.getPlayer(x0y1) == 1){
                        if(!board.isFree(x0y2)){
                            if (board.getPlayer(x0y2) == 1){
                                if(board.isFree(x0y0)) {
                                    return x0y0;
                                }
                            }
                        }
                    }
                }
            }

            if(!board.isFree(x1y0)){
                if(board.getPlayer(x1y0) == 1){
                    if(!board.isFree(x1y1)){
                        if (board.getPlayer(x1y1) == 1) {
                            if(board.isFree(x1y2)) {
                                return x1y2;
                            }
                        }
                    }
                    if(!board.isFree(x1y2)){
                        if (board.getPlayer(x1y2) == 1) {
                            if(board.isFree(x1y1)) {
                                return x1y1;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x1y1)){
                    if(board.getPlayer(x1y1) == 1){
                        if(!board.isFree(x1y2)){
                            if (board.getPlayer(x1y2) == 1){
                                if(board.isFree(x1y0)) {
                                    if(board.isFree(x1y0)) {
                                        return x1y0;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if(!board.isFree(x2y0)){
                if(board.getPlayer(x2y0) == 1){
                    if(!board.isFree(x2y1)){
                        if (board.getPlayer(x2y1) == 1) {
                            if(board.isFree(x2y2)) {
                                return x2y2;
                            }
                        }
                    }
                    if(!board.isFree(x2y2)){
                        if (board.getPlayer(x2y2) == 1) {
                            if(board.isFree(x2y1)) {
                                return x2y1;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x2y1)){
                    if(board.getPlayer(x2y1) == 1){
                        if(!board.isFree(x2y2)){
                            if (board.getPlayer(x2y2) == 1){
                                if(board.isFree(x2y0)) {
                                    return x2y0;
                                }
                            }
                        }
                    }
                }
            }

            //Downright

            if(!board.isFree(x0y0)){
                if(board.getPlayer(x0y0) == 1){
                    if(!board.isFree(x1y1)){
                        if (board.getPlayer(x1y1) == 1) {
                            if(board.isFree(x2y2)) {
                                return x2y2;
                            }
                        }
                    }
                    if(!board.isFree(x2y2)){
                        if (board.getPlayer(x2y2) == 1) {
                            if(board.isFree(x1y1)) {
                                return x1y1;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x1y1)){
                    if(board.getPlayer(x1y1) == 1){
                        if(!board.isFree(x2y2)){
                            if (board.getPlayer(x2y2) == 1){
                                if(board.isFree(x0y0)) {
                                    return x0y0;
                                }
                            }
                        }
                    }
                }
            }

            //Downleft

            if(!board.isFree(x2y0)){
                if(board.getPlayer(x2y0) == 1){
                    if(!board.isFree(x1y1)){
                        if (board.getPlayer(x1y1) == 1) {
                            if(board.isFree(x0y2)) {
                                return x0y2;
                            }
                        }
                    }
                    if(!board.isFree(x0y2)){
                        if (board.getPlayer(x0y2) == 1) {
                            if(board.isFree(x1y1)) {
                                return x1y1;
                            }
                        }
                    }
                }
            }
            else{
                if(!board.isFree(x1y1)){
                    if(board.getPlayer(x1y1) == 1){
                        if(!board.isFree(x0y2)){
                            if (board.getPlayer(x0y2) == 1){
                                if(board.isFree(x2y0)) {
                                    return x2y0;
                                }
                            }
                        }
                    }
                }
            }

        //Prevent fork

        if(!board.isFree(x1y0)){
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
