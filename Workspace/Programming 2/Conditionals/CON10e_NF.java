package Conditionals;
import java.util.Scanner;


public class CON10e_NF {

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
				blond();

				//if (sub == 1)
				//longblond();

				//else if (sub == 2){
				//shortblond();
					}
				
				else if (color.equalsIgnoreCase("Black")){
						black();
					}
				else
						System.out.println("Your hair is not blond or black.");


				}

	// methods
	public static void blond(){
		Scanner input = new Scanner(System.in);
		int sub ;
		System.out.println("Chose 1 for long or 2 for short hair:");
		sub =input.nextInt();
		if (sub == 1)
			longblond();

	else if (sub == 2){
		shortblond();
	}
	}
	
	public static void longblond(){
		System.out.println("You have long blond hair.");
	}
	public static void shortblond(){
		System.out.println("You have short blond hair.");	
		
	}
	public static void black(){
		System.out.println("You have dark hair.");
	}
			}