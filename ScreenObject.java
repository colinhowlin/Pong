//Superclass for objects appearing on screen

public class ScreenObject {

    //instance variables
    private int xCoordinate;
    private int yCoordinate;
    private int xVelocity;
    private int yVelocity;
    private int width;
    private int height;

    //constructor
    public ScreenObject(int xCoordinate, int yCoordinate, int xVelocity,
                        int yVelocity, int width, int height){


        if (xCoordinate < 0 || yCoordinate < 0) {
            throw new IllegalArgumentException(
                    "Coordinate must be positive integer");
        }

        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        this.width = width;
        this.height = height;
    }

    public int getXCoordinate(){
        return xCoordinate;
    }

    public int getYCoordinate(){
        return yCoordinate;
    }

    public int getXVelocity(){
        return xVelocity;
    }

    public int getYVelocity(){
        return yVelocity;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void setXCoordinate(int xCoordinate){
        if (xCoordinate <= 0){
            throw new IllegalArgumentException(
                    "X Coordinate must be positive integer"
            );
        }
        this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(int yCoordinate){
        if (yCoordinate <= 0){
            throw new IllegalArgumentException(
                    "Y Coordinate must be positive integer"
            );
        }
        this.yCoordinate = yCoordinate;
    }

    public void setXVelocity(int xVelocity){
        this.xVelocity = xVelocity;
    }

    public void setYVelocity(int yVelocity){
        this.yVelocity = yVelocity;
    }
}
