package Conditionals;
import java.util.Scanner;


public class CON9e_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		Scanner input = new Scanner(System.in);
		String FavColor ;

		System.out.print("What is your favorite color: ");
		FavColor= input.next();

		// If statments

		if (FavColor.equalsIgnoreCase("Red")){
			userChoseRed();
		}

		else if (FavColor.equalsIgnoreCase("Green")){
			userChoseBlueOrGreen();
		}

		else if (FavColor.equalsIgnoreCase("Blue")){
			userChoseBlueOrGreen();
		}

		else if (FavColor.equalsIgnoreCase("Yellow")){
			userChoseYellow();
		}
	
		else{
			userChoseOther();
		}
	}

	// methods
	public static void userChoseRed(){
		System.out.println("That's a hot color.");
	}
	public static void userChoseBlueOrGreen(){
		System.out.println("That's a calmiong color.");	
	}

	public static void userChoseYellow(){
		System.out.println("That's too bight.");
	}

	public static void userChoseOther(){
		System.out.println("I'm not a fan of that color.");
	}
}