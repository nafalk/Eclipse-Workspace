package Conditionals;
import java.util.Scanner;



public class Con10_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		Scanner input = new Scanner(System.in);
		String color ;
		int sub ;


		//get color
		System.out.print("What is the color of your hair: ");
		color = input.nextLine();

		// if Statments

		if (color.equalsIgnoreCase("Blond")){
			System.out.println("Chose 1 for long or 2 for short hair:");
			sub =input.nextInt();

			if (sub == 1)
				System.out.println("You have long blond hair.");	

			else if (sub == 2){
				System.out.println("You have short blond hair.");	
			}
		}
		else if (color.equalsIgnoreCase("Black")){
				System.out.println("You have dark hair.");
			}
		else
				System.out.println("Your hair is not blond or black.");


		}
	}