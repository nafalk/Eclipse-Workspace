package Methods;
import java.util.Scanner;


public class M11_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		add(num1,num2);
	}
	public static void add (int num1, int num2){

		System.out.printf("%d + %d = %d", num1, num2, (num1+num2));


	}
}