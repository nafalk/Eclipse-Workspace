package Calculator;

import java.util.Scanner;

public class Calculator_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		}
	
	
	public static void menu() {
		//Variables	
		String Choice;
		Scanner input = new Scanner (System.in);

		System.out.println("\nWhat type of claculation would you like to do? \nBasic opperations, for Squareing and square rooting opperations type Squares");
		System.out.println("for Random triangle maker type triangle, for The Pythagrean Therom thype therom, for solving polynomials type poly, for finding the area diffrent shapes type area");
		Choice = input.nextLine();

		if (Choice.equalsIgnoreCase ("Basic opperations")){
			Basic_Operations.Basic_Menu();
		}


		if (Choice.equalsIgnoreCase ("Squares")){
			Squares_Rooting.Squares_Menu();
		}
		
		if (Choice.equalsIgnoreCase ("Triangle")){
			Triangle_Maker.main();
		}
		
		if (Choice.equalsIgnoreCase ("Poly")){
			Roots_Of_Polynomial.main();
		}
	
		if (Choice.equalsIgnoreCase ("Therom")){
			Pythagorean_Theorem.main();
		}
		
		if (Choice.equalsIgnoreCase ("Area")){
			Areas.main();
		}
		else{
			System.out.println("Invalid input please try again");
			menu();
		}
	
	}}

