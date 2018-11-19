//Class describing players and computer controlled paddle object

public class Paddle extends ScreenObject{

    //constructor
    public Paddle(int xCoordinate, int yCoordinate, int xVelocity,
                  int yVelocity, int width, int height){

        //explicit call to superclass constructor
        super(xCoordinate, yCoordinate, xVelocity,
                yVelocity, width, height);
    }
}