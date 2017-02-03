package Calculator;

import java.util.Scanner;

public class Squares_Rooting {

	public static void Squares_Menu() {

		//Variables
		double num;
		String Choice;
		Scanner input = new Scanner (System.in) ;

		System.out.println("What function would you like to do? \nSquareing, Square Rooting");

		Choice = input.nextLine();

		if (Choice.equalsIgnoreCase ("Squareing")){
			System.out.println ("Please enter a number.");	
			num = input.nextDouble();
			Squareing(num);
		}

		else if (Choice.equalsIgnoreCase ("Square Rooting")){
			System.out.println ("Please enter a number.");	
			num = input.nextDouble();
			Square_Rooting(num);
		}	
		else{
			System.out.println("Invalid input please try again");
			Squares_Menu();
		}
	}

	
	
	
	// Squareing method
	public static void Squareing (double num){

		Scanner input = new Scanner (System.in) ;
		String Choice;
		
		num=num*num;
		
		System.out.printf("When you Square %f you get  %f\n", num, num );
		System.out.println("If you would like to do another calculation type yes.");

		Choice = input.nextLine();
		if (Choice.equalsIgnoreCase ("Yes")){
			Calculator_Menu.menu();
		}
		
	}	

	// Square rooting method		
	public static void Square_Rooting (double num){

		Scanner input = new Scanner (System.in) ;
		String Choice;
		double num2;
		num2=(Math.sqrt(num));;
		
		System.out.printf("When you Square root %f you get %f\n", num,num2);
		System.out.println("If you would like to do another calculation type yes.");
		Choice = input.nextLine();
		if (Choice.equalsIgnoreCase ("Yes")){
			Calculator_Menu.menu();
		}
	}	
	}