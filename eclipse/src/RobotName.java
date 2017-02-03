import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotName {
public static void main(String[] args) {
	Robot Blaziken= new Robot();
	String blaziken= JOptionPane.showInputDialog(null, "Enter your name");
		if("Ra'ees".equals(blaziken)){
			
			
			Blaziken.penDown();
			Blaziken.move(300);
			Blaziken.turn(130);
			Blaziken.move(150);
			Blaziken.turn(130);
			Blaziken.move(130);
			Blaziken.turn(230);
			Blaziken.move(250);
		   }
		else{
			Blaziken.turn(720);
		}
		}
		 }

	
  
 
 