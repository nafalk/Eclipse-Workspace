package Calculator;

import java.util.Random;
import java.util.Scanner;

public class Triangle_Maker {

	public static void main() {

		// Variables
		int number = 0;
		int times;
		double percent ;
		String Choice;
		Scanner input = new Scanner (System.in) ;


		System.out.print("How many times would you like to run the test? ");
		times = input.nextInt();

		// loop

		for(int i =0; i<times; i++){

			// Variables
			Random randNum = new Random();
			int randomNumber = randNum.nextInt(100) + 1;
			int randomNumber2 = randNum.nextInt(100) + 1;
			int num3;

			// calculate num3
			num3= 180- (randomNumber + randomNumber2);

			// give random numbers + call testing methods
			System.out.printf("\nThe Random numbers are = %d and %d \nThe missing value to get 180 is %d ", randomNumber, randomNumber2, num3);
			number = step1 (randomNumber, randomNumber2,num3, number);

		}

		// outside of loop
		percent =(double) number/times*100 ;
		System.out.println("\nIt works "+ number+ " out of "+times+ " times");
		System.out.println("The percenttage of getting the triangle to work is "+ percent  + "%");
		
		System.out.println("If you would like to do another calculation type yes.");
		Choice = input.nextLine();
		if (Choice.equalsIgnoreCase ("Yes")){
			System.out.println("\n");
			//Menu.menu();

		}
	}

	// testing methods
	//STEP1
	public static int step1(int randomNumber, int randomNumber2,int num3, int  number){
		if (randomNumber + randomNumber2 >= num3){
			number = step2 (randomNumber, randomNumber2,num3, number);
		}
		else {
			System.out.println("\nNo");
		}
		return number;
	}
	//STEP2

	public static int step2(int randomNumber, int randomNumber2,int num3, int  number){
		if (randomNumber + num3 >= randomNumber2){
			number = step3(randomNumber, randomNumber2, num3, number);
		}else{
			System.out.println("\nNo");}

		return number;
	}

	//STEP3
	public static int step3(int randomNumber, int randomNumber2,int num3,int number){

		if (randomNumber2 + num3 >= randomNumber){
			System.out.println("\nYes");
			number=number+1;

		}else{
			System.out.println("\nNo");}

		return number;

	}
	

}


