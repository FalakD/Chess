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
public class PawnTest {
    
    public PawnTest() {
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
     * Test of getRow method, of class Pawn.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        Pawn instance = new Pawn(1, 0, false);
        int expResult = 1;
        int result = instance.getRow();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCol method, of class Pawn.
     */
    @Test
    public void testGetCol() {
        System.out.println("getCol");
        Pawn instance = new Pawn(0, 1, false);
        int expResult = 1;
        int result = instance.getCol();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRow method, of class Pawn.
     */
    @Test
    public void testSetRow() {
        int n = 0;
        Pawn instance = new Pawn(4, 4, false);
        instance.setRow(n);
        assertEquals(0, instance.getRow());
    }

    /**
     * Test of setCol method, of class Pawn.
     */
    @Test
    public void testSetCol() {
        int n = 0;
        Pawn instance = new Pawn(2, 2, false);
        instance.setCol(n);
        assertEquals(0, instance.getCol());
    }

    /**
     * Test of killPiece method, of class Pawn.
     */
    @Test
    public void testKillPiece() {
        Pawn instance = new Pawn(1, 0, false);
        instance.killPiece();
        assertEquals(-1, instance.getRow());
        assertEquals(-1, instance.getCol());
    }

    /**
     * Test of isDead method, of class Pawn.
     */
    @Test
    public void testIsDeadFalse() {
        Pawn instance = new Pawn(1, 0, false);
        boolean expResult = false;
        boolean result = instance.isDead();
        assertFalse(result);
    }
    
    @Test
    public void testIsDeadTrue() {
        Pawn instance = new Pawn(1, 0, false);
        instance.killPiece();
        boolean result = instance.isDead();
        assertTrue(result);
    }

    /**
     * Test of getTeam method, of class Pawn.
     */
    @Test
    public void testGetTeam() {
        Pawn instance = new Pawn(1, 0, false);
        boolean result = instance.getTeam();
        assertFalse(result);
    }

    /**
     * Test of isLegalMove method, of class Pawn.
     */
    @Test
    public void testIsLegalMove2Hops() {
        Pawn instance = new Pawn(1, 0, false);
        boolean result = instance.isLegalMove(3, 0);
        assertTrue(result);
        instance.setRow(3);
        instance.setCol(0);
        result = instance.isLegalMove(5, 0);
        assertFalse(instance.isLegalMove(5, 0));
    }
    
    @Test
    public void testIsLegalMoveSideways() {
        Pawn instance = new Pawn(1, 0, false);
        boolean result = instance.isLegalMove(1, 2);
        assertFalse(result);
    }
    
    @Test
    public void testIsLegalMoveOffBounds() {
        Pawn instance = new Pawn(1, 0, false);
        boolean result = instance.isLegalMove(9, 0);
        assertFalse(result);
    }
    
    @Test
    public void testIsLegalMoveBackwards() {
        Pawn instance = new Pawn(7, 7, true);
        boolean result = instance.isLegalMove(8, 7);
        assertFalse(result);
    }
    
    @Test
    public void testIsLegalMoveBackwardsTop() {
        Pawn instance = new Pawn(1, 0, false);
        boolean result = instance.isLegalMove(0, 0);
        assertFalse(result);
    }
    
    @Test
    public void testIsLegalMoveForwards3() {
        Pawn instance = new Pawn(7, 7, true);
        boolean result = instance.isLegalMove(4, 7);
        assertFalse(result);
    }
    
    @Test
    public void testIsLegalMoveForwards2() {
        Pawn instance = new Pawn(7, 7, true);
        boolean result = instance.isLegalMove(5, 7);
        assertFalse(result);
    }
    
    @Test
    public void testIsLegalMoveForwardsDiagonal() {
        Pawn instance = new Pawn(7, 7, true);
        boolean result = instance.isLegalMove(6, 6);
        assertTrue(result);
    }
}
