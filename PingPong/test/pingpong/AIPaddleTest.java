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
public class AIPaddleTest {
    
    public AIPaddleTest() {
    }
    
 

   

    /**
     * Test of move method, of class AIPaddle.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        
        AIPaddle inst = new AIPaddle(50,5,235,650);
        double exp = 1.0;
       // double result = inst.getXDir();
        
      //  assertEquals(exp,result,1);

   
    }
    
    @Test
    public void testMove2() {
        System.out.println("move");
        
        AIPaddle inst = new AIPaddle(50,5,235,650);
        double exp = -1.0;
       // double result = inst.getXDir();
        
       // assertEquals(exp,result,1);

   
    }
}
