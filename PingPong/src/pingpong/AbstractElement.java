/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

/**
 *
 * @author Pawel Szymczyk
 */
public abstract class AbstractElement {
    
    protected int width;
    protected int height;
    protected int positionX;
    protected int positionY;
    
     // gettors
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getPositionX() {
        return positionX;
    }
    
    public int getPositionY() {
        return positionY;
    }
    
    // settors
    public void setWidth(int width) {
        this.width = width;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public void setPositionX(int posX) {
        positionX = posX;
    }
    
    public void setPositionY(int posY) {
        positionY = posY;
    }
}
