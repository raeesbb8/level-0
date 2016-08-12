package level0;

import javax.swing.JOptionPane;

import apple.laf.JRSUIConstants.ShowArrows;

public class functiontester {

	public static void main(String[] args) {

		print("hi");
		show("my name is jigglypuff");
	}

	static void print(String s) {
		
		System.out.println(s);
		
		
	}
	static void show(String s){
		JOptionPane.showMessageDialog(null, s);
	}
}
