package Methods;
import java.util.Scanner;


public class M13_NF {

	public static void main(String[] args) {
		
		//Variables
		int num1;
		int num2;
		int sum;
		Scanner input = new Scanner (System.in) ;
		
		// get numbers
		
		System.out.println ("Enter a number: ");	
		num1 = input.nextInt();

		System.out.println ("Enter another number: ");
		num2 = input.nextInt();
		
		sum=add(num1,num2);
		System.out.printf("%d + %d = %d", num1, num2,sum);


	}
	public static int add (int num1, int num2){
		int sum;
		sum= num1+num2;

		return sum;
		
	}

}
