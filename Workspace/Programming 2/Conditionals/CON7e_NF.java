package Conditionals;
import java.util.Scanner;


public class CON7e_NF {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		//Varibales
		double money;
		Scanner input1 = new Scanner (System.in) ;
		Scanner inputINT = new Scanner (System.in) ;
		
		System.out.print("How much money do you have in the bank? ");{
		money= input1.nextDouble();
		
		if (money >= 100.0){
		more();

		}else{
			less();
		}}
				
	}
public static void less(){
System.out.print("You don't have enough money.");
}
public static void more(){
	System.out.print("You have a sufficent amount of money.");	
}}