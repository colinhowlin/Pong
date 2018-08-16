
import javax.swing.JFrame;

public class PongTest{
    
    public static void main(String[] args){
        
        //create a panel that contains our drawing
        Pong panel = new Pong();
        
        //create a new frame to hold the panel
        JFrame application = new JFrame("Pong");
        
        //set the frame to exit when it is closed
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel); //add panel to the frame
        application.setSize(640, 480);  //set the size of the frame
        application.setVisible(true);   //make the frame visible
    }
}