package level0;

import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(300);
		rob.setRandomPenColor();
		for (int i = 0; i < 80; i = i + 1) {
			
			rob.move(300);
			rob.turn(90);

			for (int j = 0; j < 4; j = j + 1) {
				rob.move(300);
				rob.turn(90);
			}
		}
	}
}