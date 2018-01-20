package ie.atm;

import java.util.Scanner;

public class Keypad {
	
	private Scanner input;   // reads data from the command line
	
	// no argument constructor to initialise the scanner
	public Keypad(){
		input = new Scanner(System.in);
	}
	
	// return an integer value entered by user
	public int getInput(){
		return input.nextInt();  // assume that users enters an integer
	}

}
