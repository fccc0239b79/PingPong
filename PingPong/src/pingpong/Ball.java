/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Pawel Szymczyk
 */
public class Ball extends AbstractElement implements InitValues {
    
    private double xDir, yDir;
    
    public Ball(double radius, double posX, double posY) {
        
        xDir = 1;
        yDir = -1;
        
        width = radius * 2;
        height = radius * 2;
        positionX = posX;
        positionY = posY;
        
        resetState();
    }
       
    public double getYDir() {
        return yDir;
    }
    
    public double getXDir() {
        return xDir;
    }
    
    public void setYDir(double yDir) {
        this.yDir = yDir;
    }
    
    public void setXDir(double xDir) {
        this.xDir = xDir;
    }
    
    private void resetState(){
        positionX = BALL_INITIAL_POS_X;
        positionY = BALL_INITIAL_POS_Y;
    }
     
    public void move() {
        
      if(positionX <= 0 || positionX > (BOARD_WIDTH - width - 5)) {
          xDir = -xDir;
      } else if (positionY < 0 || positionY > (BOARD_HEIGHT  - 20)) {
          yDir = -yDir;
      }
      
      //System.out.println(positionX);
      
      positionX += xDir;
      positionY += yDir;
    }
    
     public void paintComponent(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.orange);
        
        Ellipse2D ball = new Ellipse2D.Double(positionX, positionY, width, height);
        g2d.fill(ball);
        
        
    }
}
