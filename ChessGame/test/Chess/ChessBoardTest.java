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
    public void testIsOccupied() {
        System.out.println("isOccupied");
        int row = 0;
        int col = 0;
        ChessBoard instance = new ChessBoard();
        boolean expResult = false;
        boolean result = instance.isOccupied(row, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of markOccupied method, of class ChessBoard.
     */
    @Test
    public void testMarkOccupied() {
        System.out.println("markOccupied");
        int row = 0;
        int col = 0;
        ChessBoard instance = new ChessBoard();
        instance.markOccupied(row, col);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        instance.markUnoccupied(row, col);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
