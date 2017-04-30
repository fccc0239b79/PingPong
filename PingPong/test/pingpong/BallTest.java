/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.awt.Graphics;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pawel Szymczyk
 */
public class BallTest {
    
    public BallTest() {
    }
    
  
    /**
     * Test of getYDir method, of class Ball.
     */
    @Test
    public void testGetYDir() {
        System.out.println("negative getYDir");
        Ball instance = new Ball(20, 20, 400, 400);
        double expResult = -1;
        double result = instance.getYDir();
        assertEquals("This test shows negative direction",expResult, result, 0);
        
        System.out.println(expResult);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    @Test
    public void testMove() {
        System.out.println("check x Position");
        
        Ball instance = new Ball(20,20,400,400);
        
        double expResult = 500;
        double actualResult = instance.getPositionX();
        
    }
    
}
