public class Ball{
    
    //instance variables
    private int size;
    private int xCoord;
    private int yCoord;
    private int xVelocity;
    private int yVelocity;
    
    //***Constructor Class***//
    public Ball(int size, int xCoord, int yCoord, int yVelocity, int xVelocity){
        this.size = size;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
    }
    
    public Ball(){
        this(0, 0, 0, 0, 0);
    }
        
    //getter and setter methods
    //set size of ball
    public void setSize(int size){
        if (size < 0){
            throw new IllegalArgumentException("Size must be a positive integer");
        }
        this.size = size;
    }

    //set x-coordinate
    public void setXCoord(int xCoord){
        this.xCoord = xCoord;
    }
    
    //set y-coordinate
    public void setYCoord(int yCoord){
        this.yCoord = yCoord;
    }
    
    //set x Velocity
    public void setXVelocity(int xVelocity){
        this.xVelocity = xVelocity;
    }
    
    //set y Velocity
    public void setYVelocity(int yVelocity){
        this.yVelocity = yVelocity;
    }
    
    //get size of ball
    public int getSize(){
        return size;
    }
    
    //get x-Coordinate
    public int getXCoord(){
        return xCoord;
    }
    
    //get y-Coordinate
    public int getYCoord(){
        return yCoord;
    }
    
    //get xVelocity
    public int getXVelocity(){
        return xVelocity;
    }
    
    //get yVelocity
    public int getYVelocity(){
        return yVelocity;
    }
    
    //
}