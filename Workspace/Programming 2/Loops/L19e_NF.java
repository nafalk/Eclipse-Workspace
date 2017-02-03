package Loops;

import java.util.Scanner;

public class L19e_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Vairiables
		Scanner input = new Scanner (System.in) ;
		String answer = "";

		while (!answer.equalsIgnoreCase("n") && !answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("y")&& !answer.equalsIgnoreCase ("yes"));
		System.out.print("Are you donating blood today?");	
		answer = input.next();

		// Yes
		if (answer.equalsIgnoreCase ("yes")){
			System.out.print("Oh Good for you!!!");
		}
		if (answer.equalsIgnoreCase ("y")){
			System.out.print("Oh Good for you!!!");
		}

		// no
		if (answer.equalsIgnoreCase ("no")){
			System.out.print("Shame on you fool");
		}
		if (answer.equalsIgnoreCase ("n")){
			System.out.print("Shame on you fool");
		}

		/*	do {
			System.out.print("Are you donating blood today?");	
			answer = input.next();

			// Yes
			if (answer.equalsIgnoreCase ("yes")){
				System.out.print("Oh Good for you!!!");
			}
			if (answer.equalsIgnoreCase ("y")){
			System.out.print("Oh Good for you!!!");
			}

			// no
			if (answer.equalsIgnoreCase ("no")){
				System.out.print("Shame on you fool");
			}
			if (answer.equalsIgnoreCase ("n")){
				System.out.print("Shame on you fool");
			}

		}while(!answer.equalsIgnoreCase("n") && !answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("y")&& !answer.equalsIgnoreCase ("yes"));
		 */
		
	}
	// while( (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("y")|| answer.equalsIgnoreCase ("yes")));
}



