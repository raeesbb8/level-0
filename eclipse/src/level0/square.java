package level0;

import org.jointheleague.graphical.robot.Robot;

public class Square {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(450);
		rob.setRandomPenColor();
		for (int i = 0; i < 40; i = i + 1) {
			
			rob.move(200);
			rob.turn(50);

			for (int j = 0; j < 4; j = j + 1) {
				rob.move(200);
				rob.turn(90);
			}
		}
	}
}