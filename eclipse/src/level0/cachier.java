package level0;

import javax.swing.JOptionPane;

public class cachier {
public static void main(String[] args) {
	  String cashier =JOptionPane.showInputDialog(null, "How much money do you have?");
	  String tepig =JOptionPane.showInputDialog(null, "How much money does the item cost?");
	int torchick= Integer.parseInt(cashier);
	int snorelax= Integer.parseInt(tepig);
	int total =torchick-snorelax;
	System.out.println(total);
	if(total >=0){
		JOptionPane.showMessageDialog(null,"your chang is" + total);
   }
  }
}