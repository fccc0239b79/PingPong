/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Pawel Szymczyk
 */
public class AIPaddle extends AbstractElement implements InitValues {
  private double xDir;
    
    public AIPaddle(double width, double height, double posX, double posY) {
        
        this.width = width;
        this.height = height;
        this.positionX = posX;
        this.positionY = posY;
        
        resetState();
    }
    
    /**
     * Method return direction on X axis.
     * @return direction on X axis.
     */
    public double getXDir() {
        return xDir;
    }
    
    /**
     * Method sets direction on X axis.
     * @param xDir x direction.
     */
    public void setXDir(double xDir) {
        this.xDir = xDir;
    }
    
    /**
     * Method draws paddle.
     * @param g graphics.
     */
    public void paintComponent(Graphics g){
     
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        Rectangle2D paddle = new Rectangle2D.Double(positionX, positionY, width, height);
        g2d.fill(paddle);        
    }
    
    /**
     * Method responsible for moving paddle.
     */
    public void move() {
        
        if(positionX <= 0) {
            positionX = 0;
        } else if(positionX >= BOARD_WIDTH - width) {
            positionX = BOARD_WIDTH - width;
        }
        
        positionX += xDir;
    }
    
    /**
     * Method allows to move paddle in the left direction.
     */
    public void left() {
        xDir = -1;
    }
    
    /**
     * Method allows to move paddle in the right direction.
     */
    public void right() {
        xDir = 1; 
    }
    
    /**
     * Method reset position of a paddle.
     */
    private void resetState(){
        positionX = PADDLE_AI_INITIAL_POS_X;
        positionY = PADDLE_AI_INITIAL_POS_Y;
    }
}
