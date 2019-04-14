import org.jointheleague.graphical.robot.Robot;

public class Housiboi {
public static void main(String[] args) {
	
	Robot rob = new Robot();
	rob.setX(50);
    rob.setY(400);	
	rob.miniaturize();
    rob.penDown();
    rob.setPenWidth(5);
    rob.setPenColor(210,105,30);
	rob.setSpeed(50);
	flatHouse(rob);
	
}
static void flatHouse (Robot rob) {
	rob.move(120);
	rob.turn(90);
	rob.move(30);
	rob.turn(90);
	rob.move(120);
	rob.setPenColor(0,200,0);
	rob.turn(-90);
	rob.move(20);
	rob.turn(-90);
}
}
	