package level0;
import org.jointheleague.graphical.robot.*;

public class polygons {

	public static void main(String[] args) {
		int sides = 150;
		float angle = getAngle(sides);
		System.out.println(angle);
		
		Robot rob = new Robot();
		rob.setSpeed(300);
		rob.penDown();
		for(int i =0 ; i< sides; i = i+1){
			
			rob.move(300);
			rob.turn(250-(int) angle);
			
		}
		
	}

	public static float getAngle(int sides) {
		float total = sides * 180 - 360;
		float angle = total / sides;

		return angle;
	}
}
