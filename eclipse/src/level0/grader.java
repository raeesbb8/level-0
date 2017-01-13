package level0;

import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.generic.IfInstruction;

public class grader {
public static void main(String[] args) {
	String grader= JOptionPane.showInputDialog(null, "enter your grade score");
	int numgrader=Integer.parseInt(grader);
	if(numgrader<60){
		JOptionPane.showMessageDialog(null, "you got a F");
		
		
	  }
	else if(numgrader<70){
		JOptionPane.showMessageDialog(null, "you got a D");
  }
	else if(numgrader<80){
		JOptionPane.showMessageDialog(null, "you got a C");
  }
	else if(numgrader<90){
		JOptionPane.showMessageDialog(null, "you got a B");
				
 }
	else if(numgrader<101){
		JOptionPane.showMessageDialog(null, "you got a A");
  }
 }
}