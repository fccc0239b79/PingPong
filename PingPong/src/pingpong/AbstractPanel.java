package pingpong;

import javax.swing.JPanel;


/**
 * This is an abstract panel for panels: boardPanel, scorePanel.
 * 
 * @author Pawel Szymczyk
 */
public abstract class AbstractPanel extends JPanel {
    
    protected int width;
    protected int height;
    protected int positionX;
    protected int positionY;
    
    protected JPanel newPanel;
    
    public AbstractPanel() {
       // width =  BOARD_WIDTH;//getWidth();
       // height = BOARD_HEIGHT;
       // positionX = 50;
       // positionY = 50;
      // System.out.println(getPositionX());
    }
    
    
    
    
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
    
    /**
     * Abstract panel method;
     */
    public abstract void panel();
    
    
    
}
