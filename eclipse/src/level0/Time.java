package level0;

import javax.swing.JOptionPane;

public class Time {
public static void main(String[] args) {
String Blaziken=	JOptionPane.showInputDialog("Put in a time from 10pm to 7pm");
int snorlax=Integer.parseInt(Blaziken);
if(snorlax>700 && snorlax<2200){
JOptionPane.showMessageDialog(null, "wake up B****");	
}
else{
	JOptionPane.showMessageDialog(null, "it's time to party");
}









}
}