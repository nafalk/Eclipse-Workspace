package Methods;
import java.util.Scanner;


public class M12e_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	menu();
	}
	public static void menu() {
		//Variables
		int num1, num2;
		double num3,num4;
		String Choice;
		Scanner input = new Scanner (System.in) ;
		
		System.out.println("What function would you like to do? \nAdition, Subtraction, Multiplication or Division");
		
		Choice = input.nextLine();
		
		if (Choice.equalsIgnoreCase ("Adition")){
			System.out.println ("Please enter a number.");	
			num1 = input.nextInt();

			System.out.println ("Please enter another number");
			num2 = input.nextInt();
			add(num1,num2);
		}
		
		else if (Choice.equalsIgnoreCase ("Subtraction")){
			System.out.println ("Please enter a number.");	
			num1 = input.nextInt();

			System.out.println ("Please enter another number");
			num2 = input.nextInt();
			subtract(num1,num2);
		}	
		else if (Choice.equalsIgnoreCase ("Multiplication")){
				System.out.println ("Please enter a number.");	
				num3 = input.nextDouble();

				System.out.println ("Please enter another number");
				num4 = input.nextDouble();
				multiply(num3,num4);
		}	
		else if(Choice.equalsIgnoreCase ("Division")){
			System.out.println ("Please enter a number.");	
			num3 = input.nextDouble();

			System.out.println ("Please enter another number");
			num4 = input.nextDouble();
			divid(num3,num4);
	}
	
	}

	// add method
	public static void add (int num1, int num2){
		
		Scanner input = new Scanner (System.in) ;
		String Choice;
		
		System.out.printf("When you add %d and %d you get a sum of %d\n", num1, num2, (num1+num2));
		System.out.println("If you would like to do another calculation type yes.");
		
		Choice = input.nextLine();
		if (Choice.equalsIgnoreCase ("Yes")){
		menu();
		}
	}	
	
	// subtract method		
	public static void subtract (int num1, int num2){
		
		Scanner input = new Scanner (System.in) ;
		String Choice;

		System.out.printf("When you subtract %d and %d you get a diffrence of %d\n", num1, num2, (num1-num2));
		System.out.println("If you would like to do another calculation type yes.");
		Choice = input.nextLine();
		if (Choice.equalsIgnoreCase ("Yes")){
		menu();
		}
	}	
	
	// multiply method
	public static void multiply (double num3, double num4){

		Scanner input = new Scanner (System.in) ;
		String Choice;
		
		System.out.printf("When you multiply %f by %f you get a product of %.3f\n", num3, num4, (num3*num4));
		System.out.println("If you would like to do another calculation type yes.");
		Choice = input.nextLine();
		if (Choice.equalsIgnoreCase ("Yes")){
		menu();
		}
	}	
	
	// divid method
	public static void divid (double num3, double num4){
		
		Scanner input = new Scanner (System.in) ;
		String Choice;
		
		System.out.printf("When you divid %f by %f you get a dividen of %.3f\n", num3, num4, (num3/num4));
		System.out.println("If you would like to do another calculation type yes.");
		Choice = input.nextLine();
		if (Choice.equalsIgnoreCase ("Yes")){
		menu();
		
		}
	}		
}