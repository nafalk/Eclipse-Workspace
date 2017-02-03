package Conditionals;
import java.util.Scanner;


public class CON7_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		int money;
		
		Scanner inputint = new Scanner (System.in) ;
		
		System.out.print("How much money do you have in the bank? ");
		money= inputint.nextInt();
		
		if (money >= 100){
		System.out.print("You have a sufficent amount of money.");

		}else{
				System.out.print("You don't have enough money.");
	}

}}
