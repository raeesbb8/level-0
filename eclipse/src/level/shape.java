package level;

import org.jointheleague.graphical.robot.Robot;

public class shape {
	public static void main(String[] args) {
		drawShape(500,300,300,4);

	}

	public static float getAngle(int sides) {
		float total = sides * 180 - 360;
		float angle = total / sides;

		return angle;

	}

	public static void drawShape(int x, int y, int length, int sides) {
	
		float angle = getAngle(sides);
		System.out.println(angle);
		// drawShape(500,300,300,4);
		Robot rob = new Robot();
		rob.setSpeed(300);
		rob.penDown();
		for (int i = 0; i < sides; i = i + 1) {

			rob.move(100);
			rob.turn(180 - (int) angle);

		}
	}
}
