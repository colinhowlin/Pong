public class Player{
    
    //instance variables
    private int score;
    private String name;
    private int credits;
    
    //***Constructor Class***//
    public Player(int score, String name, int credits){
        this.score = score;
        this.name = name;
        this.credits = credits;
    }
    
    public Player(){
        this(0, "", 0);
    }
    
    //getter and setter methods
    //get players score
    public int getScore(){
        return score;
    }
    
    //get players name
    public String getName(){
        return name;
    }
    
    //get players remaining credits
    public int getCredits(){
        return credits;
    }
    
    //set score
    public void setScore(int score){
        this.score = score;
    }
    
    //set name
    public void setName(String name){
        this.name = name;
    }
    
    public void setCredits(int credits){
        this.credits = credits;
    }
}