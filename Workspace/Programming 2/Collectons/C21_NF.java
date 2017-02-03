package Collectons;

import java.util.Arrays;
import java.util.Scanner;

public class C21_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[3];
		
		
		System.out.print("Please enter the first out of 3 numbers");
		numbers[0] = input.nextInt();
		
		System.out.print("Please enter the second out of 3 numbers");
		numbers[1] = input.nextInt();
		
		System.out.print("Please enter the third out of 3 numbers");
		numbers[2] = input.nextInt();
		Arrays.sort(numbers);
		
		for (int i=0; i<numbers.length; i++) {
			
			System.out.println(numbers[i]);
		
		
	


		
	}

}
}
