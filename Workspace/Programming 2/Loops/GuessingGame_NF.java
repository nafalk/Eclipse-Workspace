package Loops;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables

		boolean win = false;
		Random randNum = new Random();
		Scanner input = new Scanner (System.in) ;
		int randomNumber = randNum.nextInt(100) + 1;
		int pickedNum;
		pickedNum = randomNumber;
		String yaOrNa;
		
		//System.out.println("randomNum =" + pickedNum);
		//loop
		while (win == false){


			// Ask user to guess the random number
			System.out.println("Pick a number between 1 and 100");
			pickedNum = input.nextInt();

			if(pickedNum > randomNumber ){
				System.out.println("Your too high.");
			}
			else if (pickedNum < randomNumber){
				System.out.println("Your too low.");
			}

			else if (pickedNum == randomNumber){
				win = true;
				System.out.println("Congradulations you geussed the number!");
			}
			

		}
	}
}