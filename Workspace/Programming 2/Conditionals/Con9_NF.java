package Conditionals;
import java.util.Scanner;


public class Con9_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		Scanner input = new Scanner(System.in);
		String FavColor ;

		System.out.print("What is your favorite color: ");
		FavColor= input.next();

		// If statments

		if (FavColor.equalsIgnoreCase("Red")){
			System.out.println("That's a hot color.");
		}

		else if (FavColor.equalsIgnoreCase("Green")){
			System.out.println("That's a calmiong color.");	
		}

		else if (FavColor.equalsIgnoreCase("Blue")){
			System.out.println("That's a calming color.");
		}

		else if (FavColor.equalsIgnoreCase("Yellow")){
			System.out.println("That's too bight.");
		}

		else 
			System.out.println("I'm not a fan of that color.");
	}


}
