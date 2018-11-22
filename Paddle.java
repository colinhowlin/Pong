//Class describing players and computer controlled paddle object

import java.awt.event.KeyEvent;

public class Paddle extends ScreenObject{

    //constructor
    public Paddle(int xCoordinate, int yCoordinate, int xVelocity,
                  int yVelocity, int width, int height){

        //explicit call to superclass constructor
        super(xCoordinate, yCoordinate, xVelocity,
                yVelocity, width, height);
    }

    public void update(int keyCode){
        if (keyCode == KeyEvent.VK_UP){
            if (this.getYCoordinate() >= 25) {
                this.setYCoordinate(this.getYCoordinate() - 5);
                System.out.println(this.getYCoordinate());
            }
        } else if (keyCode == KeyEvent.VK_DOWN){
            if (this.getYCoordinate() <= 425) {
                this.setYCoordinate(this.getYCoordinate() + 5);
                System.out.println(this.getYCoordinate());
            }
        }
    }
}