package New;



import java.util.Scanner;

public class Cents_To_Coins {


	final static int DOLLARS = 100;             // number of cents in dollar
	final static int QUARTERS = 25;             // number of cents in quarter
	final static int DIMES = 10;                // number of cents in dime
	final static int NICKELS = 5;               // number of cents in nickel

	public static void main (String[] args) {
		int cents;                               // total amount of cents
		int numDollars, numQuarters,             // number of dollars, quarters
		numDimes, numNickels;                // number of dimes, nickels
		int centsLeft;                           // cents left after coins

		System.out.println("Cents to Coins Program");
		System.out.println("----------------------");

		// prompt the user to enter a total number of cents
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter total number of cents (positive integer): ");
		cents = keyboard.nextInt();
		System.out.println();

		// compute total amount of dollars, quarter, dimes, nickels, and pennies
		numDollars = cents/DOLLARS;
		centsLeft = cents % DOLLARS;
		numQuarters = centsLeft/QUARTERS;
		centsLeft = centsLeft % QUARTERS;
		numDimes = centsLeft/DIMES;
		centsLeft = centsLeft % DIMES;
		numNickels = centsLeft/NICKELS;
		centsLeft = centsLeft % NICKELS;

		// display resulting number of coins
		System.out.print("For your total cents of  " + cents);
		System.out.println("dollars = " + numDollars);
		System.out.println("quarters = " + numQuarters);
		System.out.println("dimes = " + numDimes);
		System.out.println("nickels = " + numNickels);
		System.out.println("pennies = " + centsLeft);
		System.out.println();
	}


}


