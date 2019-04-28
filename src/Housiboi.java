import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Housiboi {
public static void main(String[] args) {
	
	Robot rob = new Robot();
	rob.setX(50);
    rob.setY(400);	
	rob.miniaturize();
    rob.penDown();
    rob.setPenWidth(5);
	rob.setSpeed(50);
	
	for (int i = 0; i < 20; i++) {
		
		Random rand = new Random();
		String size = "";
		int h = rand.nextInt(3);
		if (h == 0) {
			size = "small";
			pointyHouse(rob, size);
		}
		else if (h == 1) {
			size = "Medium";
			pointyHouse(rob, size);
		}
		else {size = "Large";
		flatHouse(rob, size);}
	}
}
static void flatHouse (Robot rob, String height) {
	int househeightf = 0;
	if(height .equals("small")) {
	househeightf = 60;
	}
	else if (height .equals("Medium")) {
	househeightf = 120;
	}
	else {
		househeightf = 250;
	}
	rob.setRandomPenColor();
	rob.move(househeightf);
	rob.turn(90);
	rob.move(30);
	rob.turn(90);
	rob.move(househeightf);
	rob.setPenColor(0,200,0);
	rob.turn(-90);
	rob.move(20);
	rob.turn(-90);
}
static void pointyHouse (Robot rob, String heightp) {
	int househeightp = 0;
	if(heightp .equals("small")) {
	househeightp = 60;
	}
	else if (heightp .equals("Medium")) {
	househeightp = 120;
	}
	else {
		househeightp = 250;
	}
	rob.setRandomPenColor();
	rob.move(househeightp);
	rob.turn(60);
	rob.move(20);
	rob.turn(60);
	rob.move(20);
	rob.turn(60);
	rob.move(househeightp);
	rob.setPenColor(0,200,0);
	rob.turn(-90);
	rob.move(20);
	rob.turn(-90);
}
}
	