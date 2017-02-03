package Methods;
import java.util.Scanner;

public class Ratkowski_Math {

	public static void main(String[] args) {
		//Main part ask what area they would like
		Scanner userInput= new Scanner(System.in); 
		System.out.println("To determine the area of.... ");
		System.out.println("a rectangle type 1, triangle type 2, circle type 3, trapezoid type 4, hextagon type 5, Octagon type 6: ");
		String answer=userInput.next();

		//If typed 1: Rectangle
		if  (answer.equalsIgnoreCase("1")){
			int Rectangle; 
			System.out.println("Enter Width: ");
			int width=userInput.nextInt(); 
			System.out.println("Enter Height: ");
			int height=userInput.nextInt();
			Rectangle= areaOfRectangle( width,  height);
			System.out.println("The area is " +  Rectangle);
		}

		//If typed 2: Triangle
		if (answer.equalsIgnoreCase("2")){
			int triangle;
			System.out.println("Enter Width: ");
			int width=userInput.nextInt(); 
			System.out.println("Enter Height: ");
			int height=userInput.nextInt();
			triangle=areaOfTriangle(width, height);
			System.out.println("The area is " + triangle);
		}

		//If typed 3: Circle
		if (answer.equalsIgnoreCase("3")){
			double circle;
			System.out.println("Enter radius: ");
			int radius=userInput.nextInt(); 
			circle=areaOfCircle(radius); 
			System.out.println("The area is " + circle);
		}

		//If typed 4: Trapezoid 
		if (answer.equalsIgnoreCase("4")){
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
		
		//If typed 5: Hexagon 
		if (answer.equalsIgnoreCase("5")){
		double hexagon;
		System.out.println("Enter a side length: ");
		double length=userInput.nextDouble(); 
		hexagon=areaOfHexagon(length); 
		System.out.println("The area is " + hexagon );
	}
	
	//If typed 6: Octagon
	if (answer.equalsIgnoreCase("6")){
	double octagon; 
	System.out.println("Enter a side length: ");
	double length=userInput.nextDouble();
	octagon=areaOfOctagon(length); 
	System.out.println("The area is " + octagon );
	}
	}
	
	//Area of Octagon
	public static double areaOfOctagon(double length){
		double sum;
		sum= (2.0*(1.0+Math.sqrt(2)*(length*length)));
		return sum; 
	}
	
	//Area of Hexagon
	public static double areaOfHexagon (double length) {
		double sum; 
		sum = ((length*length)*(3)*Math.sqrt(3.0)/2);
		return sum;
	}
	
	//Area of Rectangle
	public static int areaOfRectangle(int width, int height){
		int Sum; 
		Sum=(width*height); 
		return Sum;
	}
	//Area of Triangle
	public static int areaOfTriangle(int width, int height){
		int sum; 
		sum=((width*height)/2);
		return sum;
	}
	//Area of Circle
	public static double areaOfCircle(int radius){
		double sum;
		sum=((radius*radius)*Math.PI); 
		return sum; 
	}
	//Area of Trapezoid
	public static int areaOfTrapezoid(int base1 ,int base2, int height) {
		int sum;
		sum=(((base1+base2)/2)*height); 
		return sum;
	}
}