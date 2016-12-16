import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String happy=JOptionPane.showInputDialog("are you happy");
		if (happy.equals("yes")){
			JOptionPane.showMessageDialog(null," you are doing good");
			
  }
		 else if(happy.equals("no")){
        happy=JOptionPane.showInputDialog("do you want to be happy");
			if (happy.equals("no")){
				JOptionPane.showMessageDialog(null," That's your problem");
				}

	 }
			else if(happy.equals("this is way to long")){ 
				happy=JOptionPane.showInputDialog("no it's not you basterds ");
				if (happy.equals("yes")){
					JOptionPane.showMessageDialog(null," you'r bullpoop");
    }	
   }	
  }
 }
