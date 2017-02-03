package Calculator;

import java.util.Scanner;

public class Pythagorean_Theorem {

	public static void main() {

		// Vairiables
		Scanner input = new Scanner (System.in) ;
		Double a,b,c;
		String Choice;

		System.out.println("Which value woulf you like to find A, B or C");
		Choice = input.nextLine();

		if (Choice.equalsIgnoreCase ("A")){
			System.out.println("Please enter the value of b");
			b = input.nextDouble();

			System.out.println("Please enter the value of c");
			c = input.nextDouble();
			
			b=b*b;
			c=c*c;
			a= b+c;
			a= Math.sqrt(a);
			System.out.println("The value of a is " +a);
			Calculator_Menu.menu();
		}

		if (Choice.equalsIgnoreCase ("B")){
			System.out.println("Please enter the value of a");
			a = input.nextDouble();

			System.out.println("Please enter the value of c");
			c = input.nextDouble();
			
			a=a*a;
			c=c*c;
			b= a+c;
			b=Math.sqrt(b);
			System.out.println("The value of b is " +b);
			Calculator_Menu.menu();
		}

		if (Choice.equalsIgnoreCase ("C")){
			System.out.println("Please enter the value of a");
			a = input.nextDouble();

			System.out.println("Please enter the value of b");
			b = input.nextDouble();
			
			a=a*a;
			b=b*b;
			c= a+b;
			c=Math.sqrt(c);
			System.out.println("The value of c is " +c);
			Calculator_Menu.menu();
		}
		else{
			main();
		}
	}
}
