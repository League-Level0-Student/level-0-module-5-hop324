package algorithms;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
String joe = JOptionPane.showInputDialog("Enter your name");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
System.out.println(joe.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
for(int Joe = 0; Joe < joe.length(); Joe++) {
	int Jeff = Joe+1;
	String character = joe.substring(Joe, Jeff);
	if(Joe%2 == 0) {
		character = character.toUpperCase();
		}
	else {
		character = character.toLowerCase();
	}

	goofyName = goofyName + character;
}

System.out.println(goofyName);
			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i 
			
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.

			
			// 6. ADD this String  (containing 1 char) to the goofyName String
JOptionPane.showMessageDialog(null, "Your goofy name is: " + goofyName);
		
		// 7. Use pop-up to show user their Goofy name

	}
}

