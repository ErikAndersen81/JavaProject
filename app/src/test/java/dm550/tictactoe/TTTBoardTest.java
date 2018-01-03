package dm550.tictactoe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TTTBoardTest {

    @Test
    public void isFreeTest(){
        //given
        TTTBoard board = new TTTBoard(3);
        Coordinate free= new XYCoordinate(0,0);
        Coordinate occupied = new XYCoordinate(1,1);

        //when
        board.addMove(occupied,1);

        //then
        assertEquals(board.isFree(free), true);
        assertEquals(board.isFree(occupied), false);
    }

    @Test
    public void getPlayerTest(){
        //given
        TTTBoard board = new TTTBoard(3);
        Coordinate p1 = new XYCoordinate(0,0);
        Coordinate p2 = new XYCoordinate(1,1);
        Coordinate p3 = new XYCoordinate(2,2);

        //when
        board.addMove(p1,1);
        board.addMove(p2,2);
        board.addMove(p3,3);

        //then
        assertEquals(board.getPlayer(p1), 1);
        assertEquals(board.getPlayer(p2), 2);
        assertEquals(board.getPlayer(p3), 3);
    }

    @Test(expected = IllegalArgumentException.class ) //then
    public void addMoveTestOutOfBounds(){
        //given
        TTTBoard board = new TTTBoard(2);
        Coordinate outOfBounds = new XYCoordinate(4,4);

        //when
        board.addMove(outOfBounds,1);
    }

    @Test
    public void addMoveTestCanAddPlayer(){
        //given
        TTTBoard board = new TTTBoard(2);
        Coordinate player = new XYCoordinate(1,2);

        //when
        board.addMove(player,1);

        //then
        assertEquals(board.isFree(player), false);
        assertEquals(board.getPlayer(player), 1);
    }

    @Test
    public void checkFullTest(){
        //given
        TTTBoard board = new TTTBoard(2);

        //when
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                Coordinate c = new XYCoordinate(x,y);
                board.addMove(c,1);
            }
        }

        //then
        assertEquals(board.checkFull(), true);
    }

    @Test
    public void player2WinsDiagonalTest(){
        //given
        TTTBoard board = new TTTBoard(2);
        int x = 0, y = 0;

        //when
        Coordinate c = new XYCoordinate(x,y);
        for(int i =0; i < 3; i++){
            board.addMove(c,2);
            c = c.shift(1,1);
        }

        //then
        assertEquals(board.checkWinning(), 2);
    }

    @Test
    public void player2WinsHorizontallyTest(){
        //given
        TTTBoard board = new TTTBoard(2);
        int x = 0, y = 1;

        //when
        Coordinate c = new XYCoordinate(x,y);
        for(int i =0; i < 3; i++){
            board.addMove(c,2);
            c = c.shift(1,0);
        }

        //then
        assertEquals(board.checkWinning(), 2);
    }

    @Test
    public void player2WinsVerticallyTest(){
        //given
        TTTBoard board = new TTTBoard(2);
        int x = 0, y = 0;

        //when
        Coordinate c = new XYCoordinate(x,y);
        for(int i =0; i < 3; i++){
            board.addMove(c,2);
            c = c.shift(0,1);
        }

        //then
        assertEquals(board.checkWinning(), 2);
    }
}