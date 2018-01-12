package dm550.tictactoe;

/** represents a tic tac toe board of a given size */
public class TTTBoard {
    
    /** 2-dimensional array representing the board
     * coordinates are counted from top-left (0,0) to bottom-right (size-1, size-1)
     * board[x][y] == 0   signifies free at position (x,y)
     * board[x][y] == i   for i > 0 signifies that Player i made a move on (x,y)
     */
    private int[][] board;
    
    /** size of the (quadratic) board */
    private int size;
    
    /** constructor for creating a copy of the board
     * not needed in Part 1 - can be viewed as an example 
     */
    public TTTBoard(TTTBoard original) {
        this.size = original.size;
        for (int y = 0; y < this.size; y++) {
            for (int x = 0; x < this.size; x++) {
                this.board[y][x] = original.board[y][x];
            }
        }
    }
    
    /** constructor for creating an empty board for a given number of players */
    public TTTBoard(int numPlayers) {
        this.size = numPlayers+1;
        this.board = new int[this.getSize()][this.getSize()];
    }
    
    /** checks whether the board is free at the given position */
    public boolean isFree(Coordinate c) {
        return board[c.getY()][c.getX()]==0;
    }
    
    /** returns the players that made a move on (x,y) or 0 if the position is free */
    public int getPlayer(Coordinate c) {
        return board[c.getY()][c.getX()];
    }
    
    /** record that a given player made a move at the given position
     * checks that the given positions is on the board
     * checks that the player number is valid 
     */
    public void addMove(Coordinate c, int player) throws IllegalArgumentException{
        try {
            boolean free = isFree(c);
        } catch (ArrayIndexOutOfBoundsException e){throw new IllegalArgumentException("Move is out of bounds!");}
        if (isFree(c) && c.checkBoundaries(size,size)){
            board[c.getY()][c.getX()] = player;
        } else{ throw new IllegalArgumentException("Position is already occupied!");}
    }

    /** returns true if, and only if, there are no more free positions on the board */
    public boolean checkFull() {
        int zeroes = 0;
        for(int[] x:board){
            for(int y:x){
                if (y==0){zeroes++;}
            }
        }
        return zeroes==0;
    }

    /** returns 0 if no player has won (yet)
     * otherwise returns the number of the player that has three in a row
     */
    public int checkWinning() {
        for(int i = 0; i<size*size ; i++){
            Coordinate start = new XYCoordinate(i%size,i/size);
            int horizontal = checkSequence(start,1,0,3);
            int vertical = checkSequence(start,0,1,3);
            int crossRightDown = checkSequence(start,1,1,3);
            int crossLeftDown = checkSequence(start,-1,1,3);
            if(horizontal != 0) return horizontal;
            if(vertical != 0) return vertical;
            if(crossRightDown != 0) return crossRightDown;
            if(crossLeftDown != 0) return crossLeftDown;
        }
        return 0;
    }

    /** internal helper function checking one row, column, or diagonal */
    public int checkSequence(Coordinate start, int dx, int dy, int length) {
        int counter = 0;
        int player = 0;
        Coordinate coordinate = new XYCoordinate(start.getX(),start.getY());
        while (coordinate.checkBoundaries(size,size)){
            counter = player == getPlayer(coordinate) ? counter+1:1;
            player = getPlayer(coordinate);
            coordinate = coordinate.shift(dx,dy);
            if ((counter == length) && (player != 0)){ break;}
        }
        if (counter < length) player = 0;
        return player;
    }
    
    /** getter for size of the board */
    public int getSize() {
        return this.size;
    }
    
    /** pretty printing of the board
     * useful for debugging purposes
     */
    public String toString() {
        String result = "";
        for (int y = 0; y < this.size; y++) {
            for (int x = 0; x < this.size; x++) {
                result += this.board[y][x]+" ";
            }
            result += "\n";
        }
        return result;
    }

}
