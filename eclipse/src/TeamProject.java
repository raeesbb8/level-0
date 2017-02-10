import javax.swing.JOptionPane;

public class TeamProject {
public static void main(String[] args) {
	String message="Enter a choice \n"+
                    "1. Add two numbers \n"+
			        "2. calculate chane \n"+
			        "3. Print Message \n"+
			        "4. Exit";
	String input= JOptionPane.showInputDialog(message);
    int Blaziken = Integer.parseInt(input);
    if(Blaziken<1)
    {
    	JOptionPane.showMessageDialog(null, "ERROR");
    	
    	
    	
    }
    else if(Blaziken>4)
    {
    	JOptionPane.showMessageDialog(null, "ERROR");
    	
    	
    	
    }
    if(Blaziken==1)
    {
    	String litten= JOptionPane.showInputDialog("Enter a number");
    	int snorlax = Integer.parseInt(litten);
    	 String Rowlet = JOptionPane.showInputDialog("Enter another number");
    	  int pikipek = Integer.parseInt(Rowlet);
    	  int sum = snorlax+pikipek;
    	  JOptionPane.showMessageDialog(null, "The sum is "+ sum);
    	  
    	 
    }
     if(Blaziken==4)
    	System.exit(0); 
     
    }
}

