package InputOutput;
import java.util.Scanner;


public class IO4_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Variables
		double number1 ;
		double number2 ;
		double solution ;
		Scanner input = new Scanner (System.in) ;
		
// Ask user for value1
		System.out.print("Give me the first value to subtract.") ;
		
//Store 
		number1 = input.nextDouble();
		
// Ask user for value2
		System.out.print("Give me the second value to subtract.") ;
//Store
		number2 = input.nextDouble();
		solution = number1-number2;
	
		
// Output
		System.out.println (number1 + " - " + number2 +" = "+ solution)  ;
	}

}
