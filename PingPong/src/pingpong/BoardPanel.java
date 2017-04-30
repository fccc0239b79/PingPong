package pingpong;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 * This is Board panel.
 *
 * @author Pawel Szymczyk
 */
public class BoardPanel extends AbstractPanel implements InitValues{
    
    public BoardPanel() {
        
        setWidth(BOARD_WIDTH);
        setHeight(BOARD_HEIGHT);
        setPositionX(BOARD_POS_X);
        setPositionY(BOARD_POS_Y);
        
        panel();
    }
    
    /**
     * This constructor is in tests.
     * @param width panel width.
     * @param height panel height.
     */
    public BoardPanel(int width, int height) {
        
        setWidth(width);
        setHeight(height);
        
        panel();
    }
    
    /**
     * This method creates panel.
     */
    public void panel() {
        newPanel = new JPanel();
       
        this.setBounds(getPositionX(), getPositionY(), getWidth(), getHeight());
        this.setBackground(Color.decode("#006b00"));
        this.setBorder(BorderFactory.createLineBorder(Color.WHITE, 6));
        this.setVisible(true);
    }
    
   /**
    * This method draws RedLine.
    * @param g graphics
    */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        g2.setStroke(new BasicStroke(6));
        g2.drawLine( REDLINE_X_START,REDLINE_Y_HEIGHT,REDLINE_X_END,REDLINE_Y_HEIGHT );
    }
    
}
