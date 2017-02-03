package Misc;
import java.util.Scanner;
public class PP2 {
	
	public static void main(String[] args) {

		// Variables
		Scanner input = new Scanner(System.in);
		int length, width;

		System.out.print("What is the length: ");
		length = input.nextInt();

		System.out.print("What is the width: ");
		width = input.nextInt();
		areaOfRectangle(length, width);
		areaOfSqaure (length, width);
		areaOfCircle(length,width);
	}
	
	public static void areaOfRectangle(int length, int width) {	

		// Print area
		System.out.printf("The area of a rectangle is %d * %d =%d.", length, width, (length * width));
	}

		
	public static void areaOfSqaure (int length, int width) {

		// Print area
		System.out.printf("\nThe area of a sqaure"
				+ "is %d * %d =%d.", length, width, (length * width));
	}

	public static void areaOfCircle (int length, int width) {

		System.out.printf("\n The area of a circle is 2*%d^2 =%d.", length, (2 * length^2));
	}

}
