/*
 * Bishop.java
 * Falak Daud
 * represents the Bishop in a game of chess
 */

/**
 *
 * @author Falak
 */
public class Bishop implements ChessPiece{
    private int currRow;
    private int currCol;
    private final boolean isWhite;
    
    /**
     * constructs a new Bishop.
     * @param row starting row
     * @param col starting col
     * @param white true if on white team, false if on black
     */
    public Bishop(int row, int col, boolean white){
        currRow = row;
        currCol = col;
        isWhite = white;
    }

    /**
     * marks the Bishop as dead.
     */
    @Override
    public void killPiece() {
        currRow = -1;
        currCol = -1;
    }

    /**
     * determines whether the Bishop is dead
     * @return true if the Bishop is dead, else false
     */
    @Override
    public boolean isDead() {
        return currRow == -1;
    }

    /**
     * return the row of the Bishop's current position.
     * @return int current row
     */
    @Override
    public int getRow() {
        return currRow;
    }

    /**
     * return the col of the Bishop's current position.
     * @return int current col
     */
    @Override
    public int getCol() {
        return currCol;
    }

    /**
     * moves the position of the Bishop to the new row.
     * @param n int new row
     * @throws IllegalArgumentException if n is less than 1 or n is greater than 8
     */
    @Override
    public void setRow(int n) {
        if(n < 1 || n > 8){
            throw new IllegalArgumentException("Cannot move bishop to row " + n);
        }
        currRow = n;
    }

    /**
     * moves the position of the Bishop to the new col.
     * @param n int new col
     * @throws IllegalArgumentException if n is less than 1 or n is greater than 8 
     */
    @Override
    public void setCol(int n) {
        if(n < 1 || n > 8){
            throw new IllegalArgumentException("Cannot move bishop to col " + n);
        }
        currCol = n;
    }

    /**
     * returns which team the Bishop is on.
     * @return true if the Bishop is on the white team, else false
     */
    @Override
    public boolean getTeam() {
        return isWhite;
    }

    /**
     * checks whether a move is legal.
     * @param row the row to move to
     * @param col the col to move to
     * @return true if the move is legal, else false
     */
    @Override
    public boolean isLegalMove(int row, int col) {
        if(row < 1 || row > 8 || col < 1 || col > 8){
            return false;
        }
        int diffCol = col - currCol;
        int diffRow = row - currRow;
        return(diffCol == diffRow);
    }
}
