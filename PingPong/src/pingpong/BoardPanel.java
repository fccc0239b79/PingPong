package pingpong;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * This is Board panel.
 *
 * @author Pawel Szymczyk
 */
public class BoardPanel extends AbstractPanel implements InitValues, ActionListener, KeyListener {
    
    private Ball ball;
    private PlayerPaddle playerPaddle;
    private AIPaddle aiPaddle;
    
    private Timer timer;
    
    private boolean isGameOver = false;
    
    public BoardPanel() {
        
        setWidth(BOARD_WIDTH);
        setHeight(BOARD_HEIGHT);
        setPositionX(BOARD_POS_X);
        setPositionY(BOARD_POS_Y);
        
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        
        timer = new Timer(GAME_SPEED, this);
        
        panel();
        initGame();
    }
    
    /**
     * This constructor is in tests.
     * @param width panel width.
     * @param height panel height.
     */
    public BoardPanel(int width, int height) {
        
        setWidth(width);
        setHeight(height);
        
        panel();
    }
    
    /**
     * This method creates panel.
     */
    public void panel() {
        newPanel = new JPanel();
       
        this.setBounds(getPositionX(), getPositionY(), getWidth(), getHeight());
        this.setBackground(Color.decode("#006b00"));
        this.setBorder(BorderFactory.createLineBorder(Color.WHITE, 6));
        this.setVisible(true);
        
    }
    
    /**
     * initGame method creates new game elements and start timer.
     */
    public void initGame() {
       ball = new Ball(BALL_RADIUS, BALL_INITIAL_POS_X, BALL_INITIAL_POS_Y);
       playerPaddle = new PlayerPaddle(PADDLE_PLAYER_WIDTH, PADDLE_PLAYER_HEIGHT, PADDLE_PLAYER_INITIAL_POS_X, PADDLE_PLAYER_INITIAL_POS_Y);
       aiPaddle = new AIPaddle(PADDLE_AI_WIDTH, PADDLE_AI_HEIGHT, PADDLE_AI_INITIAL_POS_X, PADDLE_AI_INITIAL_POS_Y);
       
       timer.start();
    }
    
   /**
    * This method draws RedLine.
    * @param g graphics
    */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        g2.setStroke(new BasicStroke(6));
        g2.drawLine( REDLINE_X_START,REDLINE_Y_HEIGHT,REDLINE_X_END,REDLINE_Y_HEIGHT );
        
        ball.paintComponent(g);
        playerPaddle.paintComponent(g);
        aiPaddle.paintComponent(g);
    }
    
    /**
     * checkCollision - checks collision between:
     * ball and paddle - if there was a collision, direction of ball is changing on opposite.
     * ball and line below paddle - if there was a collision, it stops a game, and prints out message "GAME OVER"
     */
    int aiscore = 0;
    public void checkCollision() {
        
        
        
        if(ball.getBounds().getMaxY() >= GAMEOVER_PLAYER_LINE) {
            //System.out.println(GAMEOVER_PLAYER_LINE);
            //gameOver();
            aiscore++;
            this.setAIScore(aiscore);
            System.out.println(this.getAiScore());
            System.out.println("Score for AI");
        } else if (ball.getBounds().getMinY() <= GAMEOVER_AI_LINE) {
           // System.out.println(GAMEOVER_AI_LINE);
           // gameOver();
           
           
           System.out.println("Score for Player");
        }
        
        if(ball.getBounds().intersects(playerPaddle.getBounds())) {
            ball.setYDir(-1);
          //  System.out.println(ball.getYDir());
        } else if (ball.getBounds().intersects(aiPaddle.getBounds())) {
            ball.setYDir(1);
           // System.out.println(ball.getYDir());
        }
        
        
    }
    
    
    
    public void gameOver() {
        isGameOver = true;
        timer.stop();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        ball.move();
        playerPaddle.move();
        aiPaddle.move();
        checkCollision();
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
      
        if(code == KeyEvent.VK_RIGHT) {
            playerPaddle.right();
        } else if(code == KeyEvent.VK_LEFT) {
            playerPaddle.left();
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {}
    
    @Override
    public void keyReleased(KeyEvent e) {
        playerPaddle.setXDir(0);
    }
    
}
