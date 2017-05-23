/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval.func;

import batalhanaval.func.pecas.ContraTorpedeiro;
import batalhanaval.func.pecas.NavioTanque;
import batalhanaval.func.pecas.PortaAviao;
import batalhanaval.func.pecas.Submarino;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author u15185
 */
public class AlvosTest {
    
        Alvos alvos ;
    public AlvosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        alvos = new Alvos();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of igual method, of class Alvos.
     */
//    @Test
//    public void testIgual() {
//        System.out.println("igual");
//        String posi = "";
//        boolean expResult = false;
//        boolean result = alvos.igual(posi);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSubmarino method, of class Alvos.
//     */
//    @Test
//    public void testGetSubmarino() {
//        System.out.println("getSubmarino");
//        Submarino expResult = null;
//        Submarino result = alvos.getSubmarino();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getContratorpedeiro method, of class Alvos.
//     */
//    @Test
//    public void testGetContratorpedeiro() {
//        System.out.println("getContratorpedeiro");
//        ContraTorpedeiro expResult = null;
//        ContraTorpedeiro result = alvos.getContratorpedeiro();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNaviotanque method, of class Alvos.
//     */
//    @Test
//    public void testGetNaviotanque() {
//        System.out.println("getNaviotanque");
//        NavioTanque expResult = null;
//        NavioTanque result = alvos.getNaviotanque();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPortaviao method, of class Alvos.
//     */
//    @Test
//    public void testGetPortaviao() {
//        System.out.println("getPortaviao");
//        PortaAviao expResult = null;
//        PortaAviao result = alvos.getPortaviao();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPosicoes method, of class Alvos.
//     */
//    @Test
//    public void testGetPosicoes() {
//        System.out.println("getPosicoes");
//        String[][] expResult = null;
//        String[][] result = alvos.getPosicoes();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of toString method, of class Alvos.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        for (int i = 0; i < 10; i++) {
            Alvos alvos = new Alvos();
            String result = alvos.toString();
            System.out.println(result);
        }
    }
    
}
