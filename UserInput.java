package kermisDanny;

import java.util.Scanner;

public class UserInput {

	Scanner scanner;
	
	public String getInput () {
	
	scanner = new Scanner (System.in);
	
	
	 System.out.print("input: ");
	 
	 //try {	 
		 
	 String input = scanner.nextLine();
	 
	 return input;
	 
	} // end getinput
	
	
	
} //end class
