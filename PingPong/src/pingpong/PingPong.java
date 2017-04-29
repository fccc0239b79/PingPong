package pingpong;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is simple Ping Pong Game. 
 * This game is between Player and AI Player.
 * 
 * @author Pawel Szymczyk
 */
public class PingPong extends JFrame {
    
    /**
     * This constructor creates frame, add panel called Board and add Window Listeners.
     */
    public PingPong() {
        
        /* These parameters sets frame on the center of screen. */
        int frameWidth = (Toolkit.getDefaultToolkit().getScreenSize().width  - getSize().width) / 4;
        int frameHeight = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 12;
        
        /* Frame parameters */
        setTitle("Ping Pong");
        setSize(InitValues.FRAME_WIDTH, InitValues.FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(frameWidth, frameHeight);
        setResizable(false);
        setVisible(true);
        
        /* Window Listeners */
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        /* Add Panel */
        
        Container panelContainer = getContentPane();
        panelContainer.add(new BoardPanel());
        panelContainer.add(new ScorePanel());
        
    }
        
    /**
     * This is main method, which run game.
     * @param args nothing.
     */
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
		JFrame frame = new PingPong();
                     frame.setLayout(null);
               
            }
        });    
    }
    
}
