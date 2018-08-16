public class Paddle{
    
    //instance variables
    //private int paddleSize;
    private int yCoord;
    private int xCoord;
    private int yVelocity;
    private int xVelocity = 0;
    private int width = 10;
    private int height = 40;
    
    //***Constructor Class***//
    public Paddle(int xCoord, int yCoord, int yVelocity){
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.yVelocity = yVelocity;

    }
    
    public Paddle(){
        this(0, 0, 0);
    }
    
    //getter and setter methods
    //get paddle width
    public int getWidth(){
        return width;
    }
    
    //get paddle height
    public int getHeight(){
        return height;
    }
    
    //get xCoord
    public int getXCoord(){
        return xCoord;
    }
    
    //get yCoord
    public int getYCoord(){
        return yCoord;
    }
    
    //set xCoord
    public void setXCoord(int xCoord){
        this.xCoord = xCoord;
    }
       
    //set yCoord
    public void setYCoord(int yCoord){
        this.yCoord = yCoord;
    }
    
    //set yVelocity
    public void setYVelocity(int yVelocity){
        this.yVelocity = yVelocity;
    }
    
}