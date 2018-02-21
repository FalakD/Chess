/*
 * ChessBoard.java
 * Falak Daud
 * handles all information and actions for a chess board.
 */

/**
 *
 * @author Falak
 */
public class ChessBoard {
    int[][] board; //row by column
    boolean[][] occupiedSquares;
    
    /**
     * constructs new empty standard chessboard.
     */
    public ChessBoard(){
        board = new int[8][8];
        occupiedSquares = new boolean[8][8];
    }
    
    /**
     * checks whether a certain square is occupied.
     * @param row the row of the square in question
     * @param col the col of the square in question
     * @return true if square is occupied, else false
     */
    public boolean isOccupied(int row, int col){
        return occupiedSquares[row][col];
    }
    
    /**
     * marks the given square as occupied.
     * @param row the row of the square to mark
     * @param col the col of the square to mark
     */
    public void markOccupied(int row, int col){
        occupiedSquares[row][col] = true;
    }
    
    /**
     * marks the given square as unoccupied.
     * @param row the row of the square to mark
     * @param col the col of the square to mark
     */
    public void markUnoccupied(int row, int col){
        occupiedSquares[row][col] = false;
    }
}
