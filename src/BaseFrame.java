import java.awt.*;
import java.awt.event.*;

public class BaseFrame extends Frame {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseFrame() {
		
		addWindowListener(new ClosingBeobachter()  {
			
			public void windowClosing(WindowEvent e) {
		        System.exit(0);
		    } 
			
		  });
		
	
		setSize(300, 400);
		setLocationRelativeTo(null);
		
		
		

		} 
	

	
	}



