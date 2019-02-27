package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot Rob = new Robot();
		//2. Set the speed to 100

Rob.miniaturize();
Rob.setSpeed(10);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color 1","Color 2", "Color 3"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 1) {
			Rob.setPenColor(100, 0, 0);
		}
		else if(colorChoice == 2) {
			Rob.setPenColor(0, 100, 0);
		}
		else {
			Rob.setPenColor(0, 0, 100);
		}
		//4. Ask the use how many polygons they want to be drawn.
String polygonAmount = JOptionPane.showInputDialog("How many polygons do you want drawn?");
		//5. Use the robot to draw the number of polygons the user requested.
		Integer polygons = Integer.parseInt(polygonAmount);
		for(int x = 0;polygons > 0; polygons--) {
			int bad = 0;
			bad = (polygons + 100);
			Rob.penDown();
			for(int i = 4; i > 0; i--) {
			Rob.move(100);
			Rob.turn(90);
			}
			Rob.penUp();
			Rob.turn(bad);
			Rob.move(100);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

