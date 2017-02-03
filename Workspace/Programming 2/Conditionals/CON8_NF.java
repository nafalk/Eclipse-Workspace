package Conditionals;
import java.util.Scanner;


public class CON8_NF {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
		
		Scanner input = new Scanner (System.in) ;
		int age ;
		
		
		System.out.print("How old are you?: ");
		age= input.nextInt();
		
		//If statments
		
		if(age<=17){
			System.out.print("You can't vote yet. ");
		
		}else if (age >= 39){
			System.out.println("You are over the hill. ");
				
		}else if (age >= 17){
			System.out.println("You are not old."); 
		
		 }
		
		
		

		}
		
}