package pingpong;

/**
 * This is interface with all initial values. 
 * 
 * @author Pawel Szymczyk
 */
public interface InitValues {
    
    public static final int FRAME_WIDTH = 1000;
    public static final int FRAME_HEIGHT = 800;
    
    public static final int BOARD_WIDTH = 500;
    public static final int BOARD_HEIGHT = 680;
    public static final int BOARD_POS_X = 100;
    public static final int BOARD_POS_Y = 50;
    
    public static final int SCORE_WIDTH = 300;
    public static final int SCORE_HEIGHT = 680;
    public static final int SCORE_POS_X = 650;
    public static final int SCORE_POS_Y = 50;
       
    public static final int BALL_INITIAL_X_DIR = 1;
    public static final int BALL_INITIAL_POS_X = 250;
    public static final int BALL_INITIAL_POS_Y = 339;
    public static final int BALL_RADIUS = 5;
    
    public static final int PADDLE_PLAYER_WIDTH = 50;
    public static final int PADDLE_PLAYER_HEIGHT = 5;
    public static final int PADDLE_PLAYER_INITIAL_POS_X = 235;
    public static final int PADDLE_PLAYER_INITIAL_POS_Y = 650;
    
    public static final int PADDLE_AI_WIDTH = 50;
    public static final int PADDLE_AI_HEIGHT = 5;
    public static final int PADDLE_AI_INITIAL_POS_X = 235;
    public static final int PADDLE_AI_INITIAL_POS_Y = 30;
    
    public static final int REDLINE_X_START = 0;
    public static final int REDLINE_X_END = 500;
    public static final int REDLINE_Y_HEIGHT = 346;
    
    public static final int GAME_SPEED = 5;
    
    public static final int GAMEOVER_AI_LINE = 20;
    public static final int GAMEOVER_PLAYER_LINE = 660;
}
