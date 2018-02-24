/*
 * ChessPiece.java
 * Falak Daud
 * an interface for all pieces used in a game of chess.
 */

/**
 *
 * @author Falak
 */
interface ChessPiece {
    public void killPiece();
    public boolean isDead();
    public int getRow();
    public int getCol();
    public void setRow(int n);
    public void setCol(int n);
    public boolean getTeam();
    public boolean isLegalMove(int row, int col);
}
