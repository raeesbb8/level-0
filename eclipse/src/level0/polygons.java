package level0;

import org.jointheleague.graphical.robot.*;

public class polygons {

	public static void main(String[] args) {
		int sides = 4;
		float angle = getAngle(sides);
		System.out.println(angle);
        drawShape(500,300,300,4);
		Robot rob = new Robot();
		rob.setSpeed(300);
		rob.penDown();
		for (int i = 0; i < sides; i = i + 1) {

			rob.move(100);
			rob.turn(180 - (int) angle);

		}
		rob.penUp();
		rob.move(-180);
		rob.penDown();
		sides = 3;
		 angle = getAngle(sides);
		for (int i = 0; i < sides; i = i + 1) {

			rob.move(100);
			rob.turn(180 - (int) angle);

		}

	}  

	private static void drawShape(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		int sides = 4;
		float angle = getAngle(sides);
		System.out.println(angle);
        drawShape(500,300,300,4);
		Robot rob = new Robot();
		rob.setSpeed(300);
		rob.penDown();
		for (int i = 0; i < sides; i = i + 1) {

			rob.move(100);
			rob.turn(180 - (int) angle);

		}
       
	}

	public static float getAngle(int sides) {
		float total = sides * 180 - 360;
		float angle = total / sides;

		return angle;
	}
}
