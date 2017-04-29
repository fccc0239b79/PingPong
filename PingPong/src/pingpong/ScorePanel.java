/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

import  java.lang.Object;

/**
 *
 * @author Pawel Szymczyk
 */
public class ScorePanel extends AbstractPanel implements InitValues {
    
    public ScorePanel() {
        
        setWidth(SCORE_WIDTH);
        setHeight(SCORE_HEIGHT);
        setPositionX(SCORE_POS_X);
        setPositionY(SCORE_POS_Y);
               
        panel();
    }
    
    public ScorePanel(int width, int height) {
        
        setWidth(width);
        setHeight(height);
        
        panel();
    }
    
     public void panel() {
        newPanel = new JPanel();
        
        this.setBounds(getPositionX(), getPositionY(), getWidth(), getHeight());
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.black, 6));
        this.setVisible(true);
    }
    
}
