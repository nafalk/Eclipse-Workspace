package Methods;
import java.util.Scanner;


public class M12_MF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		int num1;
		int num2;
		Scanner input = new Scanner (System.in) ;

		// get numbers

		System.out.println ("Please enter a number.");	
		num1 = input.nextInt();

		System.out.println ("Please enter another number");
		num2 = input.nextInt();
		// call methods
		add(num1,num2);
		sub(num1,num2);
		mult(num1,num2);
		div(num1,num2);
	}

	// add method
	public static void add (int num1, int num2){

		System.out.printf("When you add %d and %d you get a sum of %d\n", num1, num2, (num1+num2));
	}	
	
	// subtract method		
	public static void sub (int num1, int num2){
		
		System.out.printf("When you subtract %d and %d you get a diffrence of %d\n", num1, num2, (num1-num2));
	}	
	
	// multiply method
	public static void mult (int num1, int num2){
	

		System.out.printf("When you multiply %d by %d you get a product of %d\n", num1, num2, (num1*num2));
	}	
	
	// divid method
	public static void div (int num1, int num2){

		System.out.printf("When you divid %d by %d you get a dividen of %d\n", num1, num2, (num1/num2));
	}	
	
}
