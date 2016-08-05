package level0;

import java.io.IOException;

public class BlastOff {
	public static void main(String[] args) throws InterruptedException, IOException {
		for (int i = 10; i > 0; i = i - 1) {
			System.out.println(i);
			Runtime.getRuntime().exec("say  " + i).waitFor();
		}
		Runtime.getRuntime().exec("say  " + "blastoff").waitFor();

	}
}
