import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String [] Args) {
	SkillPractice skills = new SkillPractice();
	skills.skill1();
	skills.skill2();
	skills.skill3();
	skills.skill4();
	skills.skill5();
	}
	
private void skill5() {
	String school = JOptionPane.showInputDialog("What's the name of your school?");
	JOptionPane.showMessageDialog(null, "I bet " + school + " is a fantastic school.");
}

private void skill4() {
	String gregory = JOptionPane.showInputDialog("What city do you live in?");
	if(gregory.contentEquals("San Diego")) {
		JOptionPane.showMessageDialog(null, "You live in America's finest city");
	}
	else {
		JOptionPane.showMessageDialog(null, "Move to San Diego");
	}
	int cars = 0;
	String chungus = JOptionPane.showInputDialog("How many cars does you family have?");
cars = Integer.parseInt(chungus);
	if(cars == 0) {
		JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
	
	}
	else if(cars == 1) {
		JOptionPane.showMessageDialog(null, "I dunno what that means");
		
	}
	else if (cars >= 2) {
		JOptionPane.showMessageDialog(null, "I bet those " + cars +  " cars have in total "+ cars*4 +  " wheels.");
	}
}

private void skill3() {
	int g = 0;
	Random f = new Random();
g =	f.nextInt(21);
int h = f.nextInt(11);
int j = g-h;
JOptionPane.showMessageDialog(null, j);
	
}

private void skill2() {
	for(int i = 0; i < 31; i++) {
		if(i%3 == 0) {
			System.out.println(i);
		}
	}
	
}

private void skill1() {
		String Yeet = JOptionPane.showInputDialog("How many dimes do you have?");
	int Jeff = Integer.parseInt(Yeet);
	int Greg = Jeff*=10;
	JOptionPane.showMessageDialog(null, "You have: " + Greg + " cents");
	String Yote = JOptionPane.showInputDialog("How tall are you?");
	int Geff = Integer.parseInt(Yote);
	if(Geff < 36) {
		JOptionPane.showMessageDialog(null, "Eat your Wheaties");}
	}
	
	}



