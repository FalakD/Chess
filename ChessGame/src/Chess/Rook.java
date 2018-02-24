package Chess;


import Chess.ChessPiece;

/*
 * Rook.java
 * Falak Daud
 * represents a Rook
 */

/**
 *
 * @author Falak
 */
public class Rook implements ChessPiece {
    private int currRow;
    private int currCol;
    private final boolean isWhite;

    /**
     * constructs a new Rook.
     * @param row the initial starting row of the piece
     * @param col the initial starting col of the piece
     * @param white whether or not this Rook is on white team
     */
    public Rook(int row, int col, boolean white){
        currRow = row;
        currCol = col;
        isWhite = white;
    }
    
    /**
     * marks the Rook as dead.
     */
    @Override
    public void killPiece() {
        currRow = -1;
        currCol = -1;
    }

    /**
     * checks whether the Rook is dead.
     * @return true if the Rook is dead, else false
     */
    @Override
    public boolean isDead() {
        return currRow == -1;
    }

    /**
     * returns the row of the Rook's current position.
     * @return int row
     */
    @Override
    public int getRow() {
        return currRow;
    }

    /**
     * return the col of the Rook's current position.
     * @return int col
     */
    @Override
    public int getCol() {
        return currCol;
    }

    /**
     * changes row of Rook's current position to n.
     * @param n the new row
     * @throws new IllegalArgumentException if row is less than 1 or more than 8
     */
    @Override
    public void setRow(int n) {
        if(n > 8 || n < 1){
            throw new IllegalArgumentException("Rook cannot be moved to row " + n);
        }
        currRow = n;
    }

    /**
     * changes col of Rook's current position to n.
     * @param n the new col
     * @throws new IllegalArgumentException if col is less than 1 or more than 8
     */
    @Override
    public void setCol(int n) {
        if(n > 8 || n < 1){
            throw new IllegalArgumentException("Rook cannot be moved to row " + n);
        }
        currCol = n;
    }

    /**
     * checks whether the Rook is on the white team.
     * @return true if team is white, else false
     */
    @Override
    public boolean getTeam() {
        return isWhite;
    }

    /**
     * determines whether a given move is legal.
     * @param row int row for move
     * @param col int col for move
     * @return true if move is legal, else false
     */
    @Override
    public boolean isLegalMove(int row, int col) {
        if(row > 8 || row < 1 || col > 8 || col < 8){
            return false;
        }
        int diffCol = col - currCol;
        int diffRow = row - currRow;
        if (diffCol == 0 && diffRow >= 0){
            return true;
        } else if (diffCol >= 0 && diffRow == 0){
            return true;
        } else {
            return false;
        }
    }
}
