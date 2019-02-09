import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;



public class ButtonTest {
  
	
	public static void main(String args[]) {
        Frame f = new BaseFrame();
        f.setLayout(new FlowLayout());
      
        
        Button exitButton = new Button("Programm beenden");
        ProgrammExitAction exitAction = new ProgrammExitAction();
        
        exitButton.addActionListener(exitAction);
        f.add(exitButton); 
               
        
        
        
        f.add(exitButton);
        f.setVisible(true);
    }
}
	

	