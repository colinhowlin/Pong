import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;


public class Pong extends JPanel{
    
    public int ballSize = 20;
    //public int paddleSize = 40;
    
    //draws an X from the corners of the panel
    public void paintComponent(Graphics g){
        
        //call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        Ball ball = new Ball((width / 2) - (ballSize / 2),
                (height / 2) - (ballSize / 2), 0, 0, ballSize, ballSize);
        Paddle paddle1 = new Paddle(10, height / 2,
                0, 0, 10, 40);
        Paddle paddle2 = new Paddle(width - 20, height / 2,
                0, 0, 10, 40);
        
        //Draw the pitch
        setBackground(Color.black);
        g.setColor(Color.WHITE);
        
        //draw the gutters
        g.fillRect(30, 0, 5, height);
        g.fillRect(width - 35, 0, 5, height);
        
        //draw central divide
        for (int i = 0; i < 15; i++){
            g.fillRect(width / 2 - 2, 60 * i, 4, 40);
        }
        
        //draw the ball
        g.fillOval(ball.getXCoordinate(), ball.getYCoordinate(), ball.getWidth(), ball.getHeight());
        
        //draw the paddles
        g.fillRect(paddle1.getXCoordinate(), paddle1.getYCoordinate() - (paddle1.getHeight() / 2),
                paddle1.getWidth(), paddle1.getHeight());
        g.fillRect(paddle2.getXCoordinate(), paddle2.getYCoordinate() - (paddle2.getHeight() / 2),
                paddle2.getWidth(), paddle2.getHeight());
        
    }
}