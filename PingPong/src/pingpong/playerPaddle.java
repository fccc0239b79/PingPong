package pingpong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 * This is a player paddle class.
 * 
 * @author Pawel Szymczyk
 */
public class playerPaddle extends AbstractElement implements InitValues {
    
    private double xDir;
    
    public playerPaddle(double width, double height, double posX, double posY) {
        
        this.width = width;
        this.height = height;
        this.positionX = posX;
        this.positionY = posY;
        
        resetState();
    }
    
    public double getXDir() {
        return xDir;
    }
     
    public void setXDir(double xDir) {
        this.xDir = xDir;
    }
    
    public void paintComponent(Graphics g){
     
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        Rectangle2D paddle = new Rectangle2D.Double(positionX, positionY, width, height);
        g2d.fill(paddle);        
    }
     
    public void move() {
        
        if(positionX <= 0) {
            positionX = 0;
        } else if(positionX >= BOARD_WIDTH - width) {
            positionX = BOARD_WIDTH - width;
        }
        
        positionX += xDir;
    }
    
    public void left() {
        xDir = -1;
    }
    
    public void right() {
        xDir = 1; 
    }
     
    private void resetState(){
        positionX = PADDLE_PLAYER_INITIAL_POS_X;
        positionY = PADDLE_PLAYER_INITIAL_POS_Y;
    }
}
