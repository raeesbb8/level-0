import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.generic.IfInstruction;

public class CarDealer {
 public static void main(String[] args) {
	String car=JOptionPane.showInputDialog("what car ?");
	if (car.equals("lambo")){
		JOptionPane.showMessageDialog(null," your car is $200,000");
	}
	if (car.equals("camaro")){
		JOptionPane.showMessageDialog(null," your car is $25,000");
	}
	if (car.equals("limo")){
		JOptionPane.showMessageDialog(null," your car is $100");
	}
	if (car.equals(" privet jet")){
		JOptionPane.showMessageDialog(null," your plane is $4million");
  }
 }
} 