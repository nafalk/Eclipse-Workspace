

import java.util.Scanner;

import Hail_Hitler.Hail_Hitler;

public class Text_Game_Menu {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		// Variables
		Scanner input = new Scanner (System.in);
		String Choice;

		System.out.println("Shall we play a game?");

		// Response
		Choice = input.nextLine();

		//If statments
		if (Choice.equalsIgnoreCase ("Yes")){
			menu(Choice);
		}


		else if (Choice.equalsIgnoreCase ("No")){
			System.out.println("\nAre you sure?");
			Choice = input.nextLine();

			if (Choice.equalsIgnoreCase ("Yes")){
				System.out.println("\nEnding game Launcher");
			}

			if (Choice.equalsIgnoreCase ("No")){
				main(args);
			}

			else{
				System.out.println("Invalid input please try again");
				Choice = input.nextLine();
				main(args);
			}
		}
		/*else{
			System.out.println("\nInvalid input please try again");
			main(args);
		*/

	}



	public static void menu(String Choice) throws Exception{
		Scanner input = new Scanner (System.in);

		System.out.println("\nWhat game shall we play?");
		System.out.println("Hail Hitler, Battleship or Chess?");
		Choice = input.nextLine();

		if (Choice.equalsIgnoreCase ("Hail Hitler")){
			System.out.println("\nIntializing Hail Hitler");
			Hail_Hitler.main();
		}

		if (Choice.equalsIgnoreCase ("Battleship")){
			System.out.println("\nIntializing Battleship\n");
			Battleship.main(null);
		}

		else if (Choice.equalsIgnoreCase ("Chess")){
			System.out.println("Unavalible at this time");
			menu(Choice);
		}
		else{
			System.out.println("\nInvalid input please try again");
			menu(Choice);
		}
	}
}