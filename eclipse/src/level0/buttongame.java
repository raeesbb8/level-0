



package level0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.print.Printable;

import javax.swing.JFrame;
import javax.swing.Timer;

public class buttongame  implements KeyListener, ActionListener{
	
 public static void main(String[] args) {
new buttongame().run();	
 }
 
 
 JFrame Blaziken=new JFrame();
 
 int buttoncount = 0;
 
 Timer t = new Timer(1000,this);
 void run(){
	 Blaziken.setVisible(true);
	 Blaziken.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	 Blaziken.setSize(400, 400);
	 Blaziken.addKeyListener(this);
	 
	 t.start();
 }
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getKeyCode()== KeyEvent.VK_SPACE){
		System.out.println("hello people");
		 buttoncount=0+1;
	}
	}
 

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("hello");
}
}