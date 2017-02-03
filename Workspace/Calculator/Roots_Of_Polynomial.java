package Calculator;

import java.util.Scanner;

public class Roots_Of_Polynomial {

	public static void main() {
		// TODO Auto-generated method stub

		//Variables	
		double a,b,c,d,e;
		int Degree;
		Scanner input = new Scanner (System.in);

		//System.out.println("Please enter in the degree of the polynomial");
		//Degree= input.nextInt();
		Degree = 2;

		if (Degree == 2){
			System.out.println("An examplee of this is ax^2 + bx + c = 0");
			System.out.println("Please enter the value for a");		
			a = input.nextInt();

			System.out.println("Please enter the value for b");		
			b = input.nextInt();

			System.out.println("Please enter the value for c");		
			c = input.nextInt();
			Second_Degree(a,b,c);
		}

		if (Degree == 3){
			System.out.println("An examplee of this is ax^3 + bx^2 + cx + d = 0");
			System.out.println("Please enter the value for a");		
			a = input.nextInt();

			System.out.println("Please enter the value for b");		
			b = input.nextInt();

			System.out.println("Please enter the value for c");		
			c = input.nextInt();

			System.out.println("Please enter the value for d");		
			d = input.nextInt();
			Third_Degree(a,b,c,d);
		}

	}


	public static void Second_Degree(double a, double b, double c){
		Double right1, right2, right3,right4, root1,root2,b2,c2,c3,c4;
		int a2;
		String Choice;
		Scanner input = new Scanner (System.in);

		a2=1;
		b2=b/a;
		c2=c/a;
		c3=b2/2;
		c4=c3*c3;


		right1 = -c2;
		right2 = right1+c4;		
		right3 = (Math.sqrt(right2));
		right4 = (Math.sqrt(right2)*-1);


		root1 = right3 + -c3; 
		root2 = right4 + -c3;
		System.out.println("a2 " +a2 + " b2 " + b2 + " c2 " + c2 + " c3 " + c3 + " c4 " + c4 +" right1 " + right1 + " right2 " + right2 +  " right3 " + right3  + " right4 " + right4 +  "\n");
		
		System.out.printf("The roots are %f and %f",root1,root2);
		System.out.println("If you would like to do another calculation type yes.");

		Choice = input.nextLine();
		if (Choice.equalsIgnoreCase ("Yes")){
			Calculator_Menu.menu();
		}
	}
	
	// not done
	public static void Third_Degree(double a, double b, double c, double d){
		Double right1, right2, right3,right4, root1,root2,b2,c2,c3,c4;
		int a2;
		String Choice;
		Scanner input = new Scanner (System.in);

		a2=1;
		b2=b/a;
		c2=c/a;
		c3=b2/2;
		c4=c3*c3;


		right1 = -c2;
		right2 = right1+c4;		
		right3 = (Math.sqrt(right2));
		right4 = (Math.sqrt(right2)*-1);


		root1 = right3 + -c3; 
		root2 = right4 + -c3;
		System.out.println("a2 " +a2 + " b2 " + b2 + " c2 " + c2 + " c3 " + c3 + " c4 " + c4 +" right1 " + right1 + " right2 " + right2 +  " right3 " + right3  + " right4 " + right4 +  "\n");
		
		System.out.printf("The roots are %f and %f",root1,root2);
		System.out.println("If you would like to do another calculation type yes.");

		Choice = input.nextLine();
		if (Choice.equalsIgnoreCase ("Yes")){
			Calculator_Menu.menu();
		}
	}
}