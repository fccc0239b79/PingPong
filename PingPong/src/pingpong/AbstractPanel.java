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
    protected int playerScore;
    
    protected JPanel newPanel;
    
    public AbstractPanel() {
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
    /*
    public void setAIScore(int scoreAi) {
        aiScore = scoreAi;
    }
    (/
    /**
     * Abstract panel method;
     */
    public abstract void panel();
    
}
