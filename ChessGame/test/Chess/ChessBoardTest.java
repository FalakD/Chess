/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chess;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Falak
 */
public class ChessBoardTest {
    
    public ChessBoardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isOccupied method, of class ChessBoard.
     */
    @Test
    public void testIsOccupiedFalse() {
        int row = 0;
        int col = 0;
        ChessBoard instance = new ChessBoard();
        boolean expResult = false;
        boolean result = instance.isOccupied(row, col);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsOccupiedTrue() {
        int row = 4;
        int col = 4;
        ChessBoard instance = new ChessBoard();
        boolean expResult = true;
        instance.markOccupied(row, col, true);
        boolean result = instance.isOccupied(row, col);
        assertEquals(expResult, result);
    }

    /**
     * Test of markOccupied method, of class ChessBoard.
     */
    @Test
    public void testMarkOccupied() {
        System.out.println("markOccupied");
        int row = 0;
        int col = 0;
        boolean isWhite = false;
        ChessBoard instance = new ChessBoard();
        instance.markOccupied(row, col, isWhite);
        assertTrue(instance.isOccupied(row, col));
        assertFalse(instance.getPieceColor(row, col));
    }

    /**
     * Test of getPieceColor method, of class ChessBoard.
     */
    @Test
    public void testGetPieceColor() {
        System.out.println("getPieceColor");
        int row = 0;
        int col = 0;
        ChessBoard instance = new ChessBoard();
        boolean expResult = false;
        instance.markOccupied(row, col, expResult);
        boolean result = instance.getPieceColor(row, col);
        assertEquals(expResult, result);
    }

    /**
     * Test of markUnoccupied method, of class ChessBoard.
     */
    @Test
    public void testMarkUnoccupied() {
        System.out.println("markUnoccupied");
        int row = 0;
        int col = 0;
        ChessBoard instance = new ChessBoard();
        instance.markOccupied(row, col, true);
        instance.markUnoccupied(row, col);
        assertFalse(instance.isOccupied(row, col));
    }
    
}
