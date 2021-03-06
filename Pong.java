import java.awt.*;
import javax.swing.JPanel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Pong extends JPanel{
    private int width = 640;
    private int height = 480;
    private Ball ball;
    private Paddle paddle1;
    private Paddle paddle2;
    private int ballSize = 20;

    public Pong(){
        addKeyListener(new KeyHandler());
        intialiseScreenObjects(width, height);  //Initialise ball and paddles
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        drawPitch(g, width, height);    //draw pitch and gutters and screenObjects

    }

    public void intialiseScreenObjects(int width, int height){
        ball = new Ball((width / 2) - (ballSize / 2),
                (height / 2) - (ballSize / 2), 0, 0, ballSize, ballSize);
        paddle1 = new Paddle(10, height / 2,
                0, 5, 10, 40);
        paddle2 = new Paddle(width - 30, height / 2,
                0, 0, 10, 40);
    }

    public void drawPitch(Graphics g, int width, int height){
        //Draw the pitch
        setBackground(Color.black);
        g.setColor(Color.WHITE);

        //draw the gutters
        g.fillRect(30, 0, 5, height);           //left gutter
        g.fillRect(width - 45, 0, 5, height);   //right gutter

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

    private class KeyHandler extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            paddle1.update(e.getKeyCode());
            repaint();
        }
    }
}

