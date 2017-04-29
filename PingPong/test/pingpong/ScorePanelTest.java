/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pawel Szymczyk
 */
public class ScorePanelTest {
    
    public ScorePanelTest() {
    }
    
    /**
     * Test of panel method, of class ScorePanel.
     */
    @Test
    public void testPanel() {
        System.out.println("panel");
        
        int width = 300;
        int height = 680;
        ScorePanel instance = new ScorePanel(width,height);
        Assert.assertNotNull(instance);
        
        
                Assert.assertEquals(300, instance.width);
                Assert.assertEquals(680, instance.height);
        
        //instance.panel();
        
       // assertTrue("Test: Value is wrong.", instance.getWidth() == 650);
        
       // assertEquals(posX, instance.positionX);
        // TODO review the generated test code and remove the default call to fail.
       // fail("Something went wrong.");
    }

    
}
