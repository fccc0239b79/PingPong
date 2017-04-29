package pingpong;

import java.awt.Color;
import java.awt.FlowLayout;
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
        
      //  System.out.println(this.getPositionX());
        
        panel();
    }
    
    public BoardPanel(int width, int height) {
        
        setWidth(width);
        setHeight(height);
        
        panel();
    }
    
    public void panel() {
        newPanel = new JPanel();
       
        this.setBounds(getPositionX(), getPositionY(), getWidth(), getHeight());
        this.setBackground(Color.decode("#006b00"));
        this.setBorder(BorderFactory.createLineBorder(Color.WHITE, 6));
        this.setVisible(true);
    }
    
}
