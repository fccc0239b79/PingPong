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
    
    protected double  yDir;
   
    
    public Ball() {
        double diameter = BALL_RADIUS * 2;
        
        xDir = BALL_INITIAL_X_DIR;
        yDir = -1;
        
        width = diameter;
        height = diameter;
        positionX = BALL_INITIAL_POS_X;
        positionY = BALL_INITIAL_POS_Y;
        
        resetState();
    }
    
    public Ball(double radius, double posX, double posY) {
        
        double diameter = radius * 2;
        
        xDir = BALL_INITIAL_X_DIR;
        yDir = -1;
        
        width = diameter;
        height = diameter;
        positionX = posX;
        positionY = posY;
        
        resetState();
    }
       
    public double getYDir() {
        return yDir;
    }
    
    @Override
    public double getXDir() {
        return this.xDir;
    }
    
    public void setYDir(double yDir) {
        this.yDir = yDir;
    }
    
    @Override
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
        //  setXDir(xDir);
      } else if (positionY < 0 || positionY > (BOARD_HEIGHT  - 20)) {
          yDir = -yDir;
      }
      
      //System.out.println(positionX);
     // setXDir(xDir);
      //System.out.println(getXDir());
      
      positionX += xDir;
      positionY += yDir;
      
     // System.out.println(getXDir());
      
    }
    
    
    
     public void paintComponent(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.orange);
        
        Ellipse2D ball = new Ellipse2D.Double(positionX, positionY, width, height);
        g2d.fill(ball);
        
        
    }
     
     
}
