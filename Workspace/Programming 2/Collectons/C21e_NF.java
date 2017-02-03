package Collectons;

import java.util.Arrays;
import java.util.Scanner;

public class C21e_NF {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = -1,p=0;
		int[] numbers = new int[3];

		while(num!=p){
			
			

			System.out.print("Please enter the first out of 3 numbers");
			numbers[0] = input.nextInt();

			System.out.print("Please enter the second out of 3 numbers");
			numbers[1] = input.nextInt();

			System.out.print("Please enter the third out of 3 numbers");
			numbers[2] = input.nextInt();
			
			
			num=p;
		}
		Arrays.sort(numbers);
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);

		}

	}
}

