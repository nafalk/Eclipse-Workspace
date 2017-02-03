package Methods;

import java.math.BigDecimal;
import java.util.Scanner;

public class M15e_NF {

	public static void main(String[] args) {


		// Variables
		Scanner input = new Scanner(System.in);
		BigDecimal half = new BigDecimal(".5");
		BigDecimal length, width, area, base2;
		int Choice;
		
		System.out.print("Determine the area of a...\n1 for rectangle, 2 for a triangle ");
		Choice = input.nextInt();

		// rectangle
		if (Choice == 1){

			System.out.print("What is the length: ");
			length = input.nextBigDecimal();

			System.out.print("What is the width: ");
			width = input.nextBigDecimal();
			area = width.multiply(length);

			areaOfRectangle(length, width,area);
		}
		
		// triangle
		if (Choice == 2){
			System.out.print("What is the base: ");
			BigDecimal base = input.nextBigDecimal();

			System.out.print("What is the height: ");
			BigDecimal height = input.nextBigDecimal();
			base2 = half.multiply(base);
			area = base2.multiply(height);
			areaOfTriangle(base,height,area);
			
			}
	}
	
	public static void areaOfRectangle(BigDecimal length, BigDecimal width, BigDecimal area) {

		// Print area
		System.out.printf("The area of a rectangle is %f * %f = %f", length, width, area );
	}

	public static void areaOfTriangle( BigDecimal base, BigDecimal height,BigDecimal area){

		// Print area
		System.out.printf("The area of a Triangle is 1/2 of %f * %f =%f", base, height, area );
	}
}

