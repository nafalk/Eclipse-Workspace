import java.math.BigDecimal;
import java.util.Scanner;


public class Areas {

	public static void main(){
		//variables
		Scanner input = new Scanner(System.in);
		BigDecimal length,width,radius,height,area;
		BigDecimal pi = new BigDecimal ("3.14");
		BigDecimal half = new BigDecimal(".5");
		int Choice;


		System.out.print("If you would like to determine area of a Parallelogram press 1, Rectangle press 2, Square press 3, , Rhombus press 4, Hexagon prees 5, Octagon press 6, Triangle press 7 and Circle press 8: ");

		Choice = input.nextInt();

		// Parallelogram

		if (Choice == 1 ){

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
		
		// rectangle
		if (Choice == 2){

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

		if (Choice == 3){

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

	

		// Trapezoid 

		if (Choice== 4){
			int trapezoid;
			System.out.println("Enter base 1 : "); 
			int base1=userInput.nextInt(); 
			System.out.println("Enter base 2 : "); 
			int base2=userInput.nextInt(); 
			System.out.println("Enter a height: ");
			int height=userInput.nextInt();
			trapezoid=areaOfTrapezoid(base1, base2, height); 
			System.out.println("The area is " + trapezoid );
		}

		// Rhombus

		if (Choice == 5){

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


		// Hexagon 
		if (Choice == 6 ){
			double hexagon;
			System.out.println("Enter a side length: ");
			double length=userInput.nextDouble(); 
			hexagon=areaOfHexagon(length); 
			System.out.println("The area is " + hexagon );
		}	
		// Ask if want to do again
		System.out.print("\nTo calculate another area press 1.");
		Choice = input.nextInt();

		if (Choice ==1){
			main();
		}
		else{
			System.out.print("\nOK see you next time");
		}


		
		// Octagon
		if (Choice == 7 ){
			double octagon; 
			System.out.println("Enter a side length: ");
			double length=userInput.nextDouble();
			octagon=areaOfOctagon(length); 
			System.out.println("The area is " + octagon );
		}
		// Ask if want to do again
		System.out.print("\nTo calculate another area press 1.");
		Choice = input.nextInt();

		if (Choice ==1){
			main();
		}
		else{
			System.out.print("\nOK see you next time");
		}
		
	
		// Triangle

		if (Choice ==  8){
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
			if (Choice == 1){
				main();
			}
			else{
				System.out.print("\nOK see you next time");
			}

		}
		// Circle

		if (Choice == 9){

			System.out.print("What is the radius: ");
			radius = input.nextBigDecimal();

			areaOfaCircle(radius,pi);
			area=areaOfaCircle(radius,pi);

			//Print area
			System.out.printf("The area of a Circle is %f^2 * %f =%f.", radius, pi,area );

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

	//Parallelogram
	public static BigDecimal areaOfaParallelogram(BigDecimal height, BigDecimal width) {	

		// calculate area
		BigDecimal area;
		area = height.multiply(width);
		return area;
	}

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

	//Rhombus
	public static BigDecimal areaOfaRhombus( BigDecimal base, BigDecimal height){
		BigDecimal area;

		//Calculate area
		area = base.multiply(height);
		return area;
	}

	//Hexagon
	public static BigDecimal areaOfHexagon (Bigdecimal length) {
		BigDecimal area; 
		area = ((length*length)*(3)*Math.sqrt(3.0)/2);
		return area;
	}

	//Octagon
	public static BigDecimal areaOfOctagon(BigDecimal length){
		BigDecimal area;
		area= (2.0*(1.0+Math.sqrt(2)*(length*length)));
		return area; 
	}

	//Triangle
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
