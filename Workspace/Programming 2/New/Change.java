package New;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class Change {

	final static double DOLLARS = 1;             // number of cents in dollar
	final static double QUARTERS = .25;             // number of cents in quarter
	final static double DIMES = .10;                // number of cents in dime
	final static double NICKELS = .05;               // number of cents in nickel

	public Change() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in) ;




		//Make Random Num
		double start = 0;
		double end = 10;
		double random = new Random().nextDouble();
		double price = start + (random * (end - start));

		// Make vars
		double Amtpay = 0;
		double Change = 0;
		double cents;
		int numNickels;
		double centsLeft;
		int numQuarters;
		int numDimes;
		int numDollars;
		int numPennies;

	// print before rounding System.out.println(price);
		
		// round price
		int Round = (int) Math.round(price*100);
		double total = Round/100.0;
		// print after rounding System.out.println(total);
		
		// Get Payment
		System.out.println("Total amount due: " + total + "\nPlease enter amount of pay");

		Amtpay = input.nextDouble();
		
		System.out.println("Cash tendered: " + Amtpay);

		//Calculate change

		Change = Amtpay - total;
		double Change1 = Math.round(Change*100/100);
		System.out.println("\nChange:$ " + Change1);

		// compute total amount of dollars, quarter, dimes, nickels, and pennies
		numDollars = (int) (Change/DOLLARS);
		centsLeft =  Change % DOLLARS;
		int cents1 =  (int) (centsLeft *100);
		numQuarters = (int) (centsLeft/QUARTERS);
		centsLeft =  centsLeft % QUARTERS;
		numDimes = (int) (centsLeft/DIMES);
		centsLeft = centsLeft % DIMES;
		numNickels =(int) ( centsLeft/NICKELS);
		centsLeft =  centsLeft % NICKELS;
		numPennies =(int) (centsLeft *100);
		
		// display resulting number of coins
		
		System.out.println("\nDollers Returned: $"+ numDollars);
		System.out.println("Cents returned "+ cents1 + "¢");
		
		System.out.println("\nDollars = " + numDollars);
		System.out.println("Quarters = " + numQuarters);
		System.out.println("Dimes = " + numDimes);
		System.out.println("Nickels = " + numNickels);
		System.out.println("Pennies = " + numPennies);
		





		//	String output = NumberFormat.getCurrencyInstance().format(Change);
		 //System.out.println("test" + output);
	}

}
