package level0;
 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(5);
		// 2. Print out the random variable above
		
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
              String answer= JOptionPane.showInputDialog("Enter a guess using a pop-up window");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
              
			// 5. if the guess is correct
				// 6. win
               JOptionPane.showMessageDialog(null, "you win");
			// 7. if the guess is high
				// 8. tell them it's too high
               JOptionPane.showMessageDialog(null, "It's to high");
			// 9. if the guess is low
				// 10. tell them it's too low
                   JOptionPane.showMessageDialog(null, "It's to low");
		// 12. tell them they lose
               JOptionPane.showMessageDialog(null, "you lose");
	}

}


