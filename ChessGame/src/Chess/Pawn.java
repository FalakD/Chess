package Chess;


import Chess.ChessPiece;

/*
 * Pawn.java
 * Falak Daud
 * represents a Pawn
 */

/**
 *
 * @author Falak
 */
public class Pawn implements ChessPiece {
    private int currRow;
    private int currCol;
    private final boolean isWhite;
    private boolean firstMove;
    
    /**
     * constructs new Pawn object.
     * @param row the initial starting row of the piece
     * @param col the initial starting col of the piece
     * @param white whether or not Pawn is on white team
     */
    public Pawn(int row, int col, boolean white) {
        currRow = row;
        currCol = col;
        isWhite = white;
    }
    
    /**
     * returns the current row of the Pawn's position.
     * @return int row
     */
    @Override
    public int getRow() {
        return currRow;
    }
    
    /**
     * return the current col of the Pawn's position.
     * @return int col
     */
    @Override
    public int getCol() {
        return currCol;
    }
    
    /**
     * move the Pawn to given row.
     * @param n the row to set the Pawn's position
     * @throws IllegalArgumentException if n is greater than 8 or less than 0.
     */
    @Override
    public void setRow(int n) {
        if(n > 8 || n < 1){
            throw new IllegalArgumentException("Pawn cannot be moved to row " + n);
        }
        currRow = n;
    }
    
    /**
     * move the Pawn to given col.
     * @param n the col to set the Pawn's position
     * @throws IllegalArgumentException if n is greater than 8 or less than 0.
     */
    @Override
    public void setCol(int n) {
        if(n > 8 || n < 1){
            throw new IllegalArgumentException("Pawn cannot be moved to col " + n);
        }
        currCol = n;
    }
    
    /**
     * mark the Pawn as completing its first move.
     */
    public void markMoved() {
        firstMove = false;
    }
    
    /**
     * marks the pawn as dead.
     */
    @Override
    public void killPiece(){
        currRow = -1;
        currCol = -1;
    }
    
    /**
     * checks whether the Pawn is dead.
     * @return true if Pawn is dead, else false.
     */
    @Override
    public boolean isDead() {
        return currRow == -1;
    }
    
    /**
     * returns whether this Pawn is on the white team.
     * @return true if its on the white team, else false
     */
    @Override
    public boolean getTeam() {
        return isWhite;
    }
    
    /**
     * checks whether a move is legal.
     * @param row int row to move to
     * @param col int col to move to
     * @return true if move is legal, else false
     */
    @Override
    public boolean isLegalMove(int row, int col) {
        if(row > 8 || row < 1 || col < 1 || col > 8) {
            return false;
        }
        int diffCol = col - currCol;
        int diffRow = row - currRow;
        if (isWhite){
            if(diffCol == 2 && diffRow == 0) {
                return firstMove;
            } else {
                if(diffCol == 1){
                    if(diffRow > -2 && diffRow < 2) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        } else {
            if(diffCol == -2 && diffRow == 0) {
                return firstMove;
            } else {
                if(diffCol == -1) {
                    if(diffRow > -2 && diffRow < 2) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        }
    }
}
