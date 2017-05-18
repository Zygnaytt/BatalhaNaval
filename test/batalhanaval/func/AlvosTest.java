/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval.func;

import batalhanaval.func.pecas.Submarino;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Marina
 */
public class AlvosTest {
    Alvos as;
    
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
        as = new Alvos();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        for(int i = 0; i < 11; i++)
        System.out.println(as.toString());
    }
    
}
