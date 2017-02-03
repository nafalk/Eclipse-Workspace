package Methods;
import java.math.BigDecimal;
import java.util.Scanner;
public class Falk_Math {

	public static void main(String[] args){
		main();
	}
	public static void main(){
		//variables
		Scanner input = new Scanner(System.in);
		BigDecimal length,width,radius,height,area;
		BigDecimal pi = new BigDecimal ("3.14");
		BigDecimal half = new BigDecimal(".5");
		int Choice;


		System.out.print("If you would like to determine area of a Rectangle press 1, Square press 2, Parallelogram press 3, Rhombus press 4, Triangle press 5 and Circle press 6: ");

		Choice = input.nextInt();

		// rectangle
		if (Choice == 1){

			System.out.print("What is the length: ");
			length = input.nextBigDecimal();

			System.out.print("What is the width: ");
			width = input.nextBigDecimal();

			areaOfRectangle(length, width);
			area=areaOfRectangle(length, width);
			System.out.printf("The area of a rectangle is %f * %f = %f", length, width, area );

			// Ask if want to do again
			System.out.println("\nTo calculate another area press 1.");
			Choice = input.nextInt();
			if (Choice ==1){
				main();
			}
			else{
				System.out.println("\nOK see you next time");
			}
		}

		// Square

		if (Choice == 2){

			System.out.print("What is the width: ");
			width = input.nextBigDecimal();

			System.out.print("What is the length: ");
			length = input.nextBigDecimal();
			areaOfaSquare(length, width);
			area=areaOfaSquare(length, width);
			//Print area
			System.out.printf("The area of a Sqaure is %f * %f =%f.", length, width,area );

			// Ask if want to do again
			System.out.print("\nTo calculate another area press 1.");
			Choice = input.nextInt();
			if (Choice ==1){
				main();
			}
			else{
				System.out.print("OK see you next time");
			}
		}

		// Parallelogram

		if (Choice == 3){

			System.out.print("What is the width: ");
			width = input.nextBigDecimal();

			System.out.print("What is the height: ");
			height = input.nextBigDecimal();
			areaOfaParallelogram(height, width);
			area=areaOfaParallelogram(height, width);

			//Print area
			System.out.printf("The area of a Parallelogram is %f * %f =%f.", height, width,area );

			// Ask if want to do again
			System.out.print("\nTo calculate another area press 1.");
			Choice = input.nextInt();
			if (Choice ==1){
				main();
			}
			else{
				System.out.print("\nOK see you next time");
			}
		}

		// Rhombus

		if (Choice == 4){

			System.out.print("What is the width: ");
			width = input.nextBigDecimal();

			System.out.print("What is the Height: ");
			height = input.nextBigDecimal();
			areaOfaRhombus(height, width);
			area=areaOfaRhombus(height, width);
			// Print area
			System.out.printf("The area of a Trapizoid is %f * %f =%f", width, height, area );

			// Ask if want to do again
			System.out.print("\nTo calculate another area press 1.");
			Choice = input.nextInt();

			if (Choice ==1){
				main();
			}
			else{
				System.out.print("\nOK see you next time");
			}
		}

		// triangle

		if (Choice == 5){
			System.out.print("What is the base: ");
			BigDecimal base = input.nextBigDecimal();

			System.out.print("What is the height: ");
			height = input.nextBigDecimal();

			areaOfTriangle(base,height,half);
			area=areaOfTriangle(base,height,half);
			// Print area

			System.out.printf("The area of a Triangle is 1/2 of %f * %f =%f", base, height, area );

			// Ask if want to do again
			System.out.print("\nTo calculate another area press 1.");
			Choice = input.nextInt();
			if (Choice ==1){
				main();
			}
			else{
				System.out.print("\nOK see you next time");
			}
		}

		// Circle

		if (Choice == 6){

			System.out.print("What is the radius: ");
			radius = input.nextBigDecimal();
			
			areaOfaCircle(radius,pi);
			area=areaOfaCircle(radius,pi);

			//Print area
			System.out.printf("The area of a Circla is %f^2 * %f =%f.", radius, pi,area );

			// Ask if want to do again
			System.out.print("\nTo calculate another area press 1.");
			Choice = input.nextInt();
			if (Choice ==1){
				main();
			}
			else{
				System.out.print("\nOK see you next time");
			}
		}
	}	

	// Methods

	//Rectangle
	public static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
		BigDecimal area;
		
		//calculate area
		area = width.multiply(length);
		return area;
	}


	//Square
	public static BigDecimal areaOfaSquare(BigDecimal length, BigDecimal width) {	

		// calculate area
		BigDecimal area;
		area = length.multiply(width);
		return area;
	}

	//Parallelogram
	public static BigDecimal areaOfaParallelogram(BigDecimal height, BigDecimal width) {	

		// calculate area
		BigDecimal area;
		area = height.multiply(width);
		return area;
	}


	// Rhombus
	public static BigDecimal areaOfaRhombus( BigDecimal base, BigDecimal height){
		BigDecimal area;
		
		//Calculate area
		area = base.multiply(height);
		return area;
	}

	// Triangle
	public static BigDecimal areaOfTriangle( BigDecimal base, BigDecimal height,BigDecimal half){
		BigDecimal area,base2;
		
		//calculate area
		base2 = half.multiply(base);
		area = base2.multiply(height);
		return area;
	}




	//Circle
	public static BigDecimal areaOfaCircle(BigDecimal radius, BigDecimal pi) {	
		BigDecimal area,radius2;

		// calculate area
		radius2 = radius.multiply(radius);
		area = radius2.multiply(pi);
		return area;
	}
}