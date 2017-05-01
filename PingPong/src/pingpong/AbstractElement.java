/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.awt.geom.Rectangle2D;

/**
 *
 * @author Pawel Szymczyk
 */
public abstract class AbstractElement {
    
    protected double width;
    protected double height;
    protected double positionX;
    protected double positionY;
    protected double xDir;
    
     // gettors
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getPositionX() {
        return positionX;
    }
    
    public double getPositionY() {
        return positionY;
    }
    
    public double getXDir() {
        return xDir;
    }
    
    // settors
    public void setWidth(double width) {
        this.width = width;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setPositionX(double posX) {
        positionX = posX;
    }
    
    public void setPositionY(double posY) {
        positionY = posY;
    }
    
    
    public void setXDir(double xDir) {
        this.xDir = xDir;
    }
    
    public Rectangle2D getBounds() {
       return new Rectangle2D.Double(getPositionX(), getPositionY(), getWidth(), getHeight());
    }
}
