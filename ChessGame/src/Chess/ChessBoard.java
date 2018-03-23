package Chess;

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
    int[][] occupiedSquares; // 1 is white, 2 is black, 0 is unoccupied
    
    /**
     * constructs new empty standard chessboard.
     */
    public ChessBoard(){
        board = new int[8][8];
        occupiedSquares = new int[8][8];
    }
    
    /**
     * checks whether a certain square is occupied.
     * @param row the row of the square in question
     * @param col the col of the square in question
     * @return true if square is occupied, else false
     */
    public boolean isOccupied(int row, int col){
        return occupiedSquares[row][col] != 0;
    }
    
    /**
     * marks the given square as occupied.
     * @param row the row of the square to mark
     * @param col the col of the square to mark
     */
    public void markOccupied(int row, int col, boolean isWhite){
        if (isWhite) {
            occupiedSquares[row][col] = 1;
        } else {
            occupiedSquares[row][col] = 2;
        }
    }
    
    /**
     * returns the color of the piece at the given position.
     * @param row the row of the piece
     * @param col the column of the piece
     * @return true if the piece is white, else false
     */
    public boolean getPieceColor(int row, int col) {
        return occupiedSquares[row][col] == 1;
    }
    
    /**
     * marks the given square as unoccupied.
     * @param row the row of the square to mark
     * @param col the col of the square to mark
     */
    public void markUnoccupied(int row, int col){
        occupiedSquares[row][col] = 0;
    }
}
