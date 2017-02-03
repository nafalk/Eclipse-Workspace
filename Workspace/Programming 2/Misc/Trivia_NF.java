package Misc;
import java.util.Scanner;


public class Trivia_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		Scanner input = new Scanner (System.in) ;
		String userChoice;

		System.out.print("What is your grade in this class?");
		userChoice = input.nextLine();

	// if statements
		if (userChoice.equalsIgnoreCase("A")){
			A();
		}
		else if (userChoice.equalsIgnoreCase ("B")){
			B();
		}
		else if (userChoice.equalsIgnoreCase ("C")){
			C();
		}
		




	}
	public static void A(){
		Scanner input = new Scanner (System.in) ;
		String userChoice;
		
		System.out.println("What is favorite color?");
		userChoice = input.nextLine();
		if (userChoice.equalsIgnoreCase("Blue")){
			System.out.println("Mine too!");
		}
		else if (userChoice.equalsIgnoreCase ("B")){
			
		}
	}
	public static void B(){
		
	}
	public static void C(){
		
	}
}


