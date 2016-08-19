package level0;

import org.jointheleague.graphical.robot.Robot;

public class star {
	public static void main(String[] args) {

		Robot poke = new Robot();
		poke.penDown();
		poke.setSpeed(450);
		poke.setRandomPenColor();
		for (int i = 0; i < 5; i = i + 1) {

			poke.move(100);
			poke.turn(150);

		}
		poke.move(100);
		for (int j = 0; j < 5; j = j + 1) {
			poke.move(100);
			poke.turn(150);
		}
		poke.move(150);
		for (int r = 0; r < 5; r = r + 1) {
			poke.move(100);
			poke.turn(150);
		}
		poke.move(200);
	}

	int r = 0;x<5;x=x+1){
		poke.move(100);
		poke.turn(150);
	
	
}
