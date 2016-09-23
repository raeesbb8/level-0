package level0;

import org.jointheleague.graphical.robot.Robot;

public class square {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(450);
		rob.setRandomPenColor();
		for (int i = 0; i < 6; i = i + 1) {
			
			rob.move(90);
			rob.turn(360);

			for (int j = 0; j < 4; j = j + 1) {
				rob.move(50);
				rob.turn(160);
		