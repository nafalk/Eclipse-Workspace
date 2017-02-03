package Misc;
import java.util.ArrayList;
import java.util.Scanner;


public class exam {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1,num2,num3, sum;

		ArrayList  nums = new ArrayList <> ();

		System.out.println("Please enter 3 intergers between or equal to -100 and 100");
		num1= input.nextInt();


		while (num1 <-101 || num1>101){
			System.out.println("invalid input please input valid number");
			num1= input.nextInt();
		}
		num2= input.nextInt();

		while (num2 <-100 || num2>101){
			System.out.println("invalid input please input valid number");
			num2= input.nextInt();
		}
		num3= input.nextInt();


		while (num3 <-100 || num3>101){
			System.out.println("invalid input please input valid number");
			num3= input.nextInt();
		}

		nums.add(num1);
		nums.add(num2);
		nums.add(num3);
		sum = num1+num2+num3;
		print(sum,num1,num2,num3);
	}


	public static void print (int sum, int num1, int num2, int num3){

		System.out.printf("%d + %d + %d = %d",num1,num2,num3,sum );
	}

}