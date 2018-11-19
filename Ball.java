//Class describing ball object for Pong

public class Ball extends ScreenObject{

    //constructor
    public Ball(int xCoordinate, int yCoordinate, int xVelocity,
                int yVelocity, int width, int height){

        // Explicit call to superclass constructor
        super(xCoordinate, yCoordinate, xVelocity,
                yVelocity, width, height);
    }
}