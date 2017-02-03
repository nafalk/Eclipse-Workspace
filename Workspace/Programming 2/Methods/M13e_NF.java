package Methods;

import java.util.Scanner;

public class M13e_NF {
	public static void main(String[] args) {
		
		//Variables
		int number1;
		int number2;
		int sum1;
		Scanner input = new Scanner (System.in) ;
		
		// get numbers
		
		System.out.println ("Enter a number: ");	
		number1 = input.nextInt();

		System.out.println ("Enter another number: ");
		number2 = input.nextInt();
		
		sum1=add(number1,number2);
		System.out.printf("%d + %d = %d", number1, number2,sum1);


	}
	public static int add (int number1, int number2){
		int sum1;
		sum1= number1+number2;

		return sum1;
		
	}

}
