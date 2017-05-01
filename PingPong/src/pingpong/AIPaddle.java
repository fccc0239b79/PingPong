package pingpong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.Timer;

/**
 *
 * @author Pawel Szymczyk
 */
public class AIPaddle extends AbstractElement implements InitValues  {
    
    //public double xDir;
    
    private Ball ball = new Ball();
            
    public AIPaddle(double width, double height, double posX, double posY) {
        
        this.width = width;
        this.height = height;
        this.positionX = posX;
        this.positionY = posY;
        
        //xDir = BALL_INITIAL_X_DIR; //paddle x direction is the same as ball
        xDir = ball.getXDir();
        //System.out.println(xDir);
        
       
        resetState();
    }
    
    /**
     * Method return direction on X axis.
     * @return direction on X axis.
     */
   // public double getXDir() {
   //     return xDir;
   // }
    
    /**
     * Method sets direction on X axis.
     * @param xDir x direction.
     */
   // public void setXDir(double xDir) {
   //     this.xDir = xDir;
   // }
    
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
      
        ball.move();
        
        
        
        if(ball.getPositionY() <= REDLINE_Y_HEIGHT) {
            
            System.out.println(this.positionX);
                
         //   if(makeDecision() == true) { // decision
               /*    
                if(ball.getXDir() == 1) {
                    positionX += xDir;
                } else {
                    positionX -= xDir;
                }
                */
               /*
               if(ball.positionX >= 250 && ball.getXDir() == 1) {
                   positionX += xDir;
               } else if (ball.positionX >= 250) {
                   positionX -= xDir;
               }
               */
               //System.out.println(ball.getXDir());
              
                  this.positionX = ball.getPositionX();
              
               
              // if(this.positionX == ball.positionX) {
                //   this.positionX += this.xDir;
              //  this.positionX = ball.positionX;
               //} else if (ball.positionX <= this.positionX) {
               //    this.positionX -= xDir;
              // }
              
               
               //positionX = ball.positionX;
               
             //  System.out.println("ball: " + ball.positionX);
             //  System.out.println("paddle: " + this.positionX);
         //   }
            
        } else if(ball.getPositionY() > REDLINE_Y_HEIGHT) {
            resetState();
        }
        
        if(this.positionX <= 0) {
            this.positionX = 0;
        } else if(this.positionX >= BOARD_WIDTH - width) {
            this.positionX = BOARD_WIDTH - width;
        }
        
    }
    
    /**
     * This method is pseudorandom delay in AI move decision into 1s.
     * @return decision speed
     */
    public boolean makeDecision() {
       return Math.random() < 0.8; 
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
       // positionY = PADDLE_AI_INITIAL_POS_Y;
    }
}
