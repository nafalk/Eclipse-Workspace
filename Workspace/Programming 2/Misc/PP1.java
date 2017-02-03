package Misc;
import java.util.Scanner;
public class PP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Variables
		Scanner input = new Scanner(System.in);
		String Choice ;
		
		// Output
		System.out.println("Please select one of the options that follows: ");
		System.out.println("type about, about to learn more about this menu: ");
		System.out.println("type hydra, to use hydra to get free wifi: ");
		System.out.println("coming soon: ");
		
		// if statements
		
		Choice = input.nextLine();        
				
		if (Choice.equalsIgnoreCase("about"));{
			System.out.println("");
		}
		 if (Choice.equalsIgnoreCase("hydra"));{
			System.out.println("Jokes on you");
		}
		 if (Choice.equalsIgnoreCase("about"));{
			System.out.println("You are in option 3");
		}
		 if (Choice.equalsIgnoreCase("about"));{
			System.out.println("Type code to learn how this menu was made");
			System.out.print("Type creators to learn who made this menu");
		}
		        
	}

}
