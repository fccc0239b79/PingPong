/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

import  java.lang.Object;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Pawel Szymczyk
 */
public class ScorePanel extends AbstractPanel implements InitValues {
    
    JLabel aiLabel= new JLabel("AI: 0");
    
    private int score = 0;
    
    public ScorePanel() {
        
        setWidth(SCORE_WIDTH);
        setHeight(SCORE_HEIGHT);
        setPositionX(SCORE_POS_X);
        setPositionY(SCORE_POS_Y);
               
        panel();
       System.out.println(score);
      //  System.out.println("! " + getScore());
        
    }
    
    public ScorePanel(int width, int height) {
        
        setWidth(width);
        setHeight(height);
        
        panel();
        
    }
    
    @Override
    public void panel() {
        newPanel = new JPanel();
        
        this.setBounds(getPositionX(), getPositionY(), getWidth(), getHeight());
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.black, 6));
        this.setLayout(null);
        this.setVisible(true);
        
        
        label();
        
     
    }
    
    public void setScore(int point) {
        score = point;
    }
    
    public int getScore() {
        return score;
    }
    
    public void label() {
        JLabel scoreLabel = new JLabel();
               scoreLabel.setText("SCORE TABLE");
               scoreLabel.setBounds(30, 50, 300, 50);
               scoreLabel.setFont(new Font("Kalinga", Font.PLAIN, 34));
               scoreLabel.setForeground(Color.red);
               this.add(scoreLabel);
        
              /* 
               SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                aiLabel.setText("my text"  + score);
            }
        });
             */  
       // JLabel aiLabel = new JLabel("AI: 0");
               //aiLabel.setText(String.valueOf(getScore()));
              // setLabel(String.valueOf(getScore()));
               aiLabel.setBounds(100, 150, 200, 50);
               aiLabel.setFont(new Font("Kalinga", Font.PLAIN, 24));
               aiLabel.setForeground(Color.black);
               this.add(aiLabel);
               
               
        JLabel playerLabel = new JLabel("Player: 0");
             //  playerLabel.setText("Player: " + score);
               playerLabel.setBounds(50, 200, 200, 50);
               playerLabel.setFont(new Font("Kalinga", Font.PLAIN, 24));
               playerLabel.setForeground(Color.black);
               this.add(playerLabel);
        /*
        JLabel aiScoreLabel = new JLabel();
               aiScoreLabel.setText("0");
               aiScoreLabel.setBounds(150, 150, 200, 50);
               aiScoreLabel.setFont(new Font("Kalinga", Font.PLAIN, 24));
               aiScoreLabel.setForeground(Color.black);
               this.add(aiScoreLabel);
        
        JLabel playerScoreLabel = new JLabel();
               playerScoreLabel.setText("0");
               playerScoreLabel.setBounds(150, 200, 200, 50);
               playerScoreLabel.setFont(new Font("Kalinga", Font.PLAIN, 24));
               playerScoreLabel.setForeground(Color.black);
               this.add(playerScoreLabel);
        */
        this.repaint();
    }
   
    
    public String getLabel() {
        return aiLabel.getText();
    }
    
    public void setLabel(String st) {
        
        
          
        
       // aiLabel.setText(st);
        //repaint();
    } 
    
     
    
    
}
