package InputOutput;
import java.util.Scanner;


public class IO5e_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Variables
	String name1 ;
	String name2 ;
	int age ;
	Scanner input = new Scanner (System.in) ;
	Scanner input1 = new Scanner (System.in) ;
	
//ask user their first name
	System.out.print("Please enter your first name.") ;
			
//Store their first name
	name1 = input.next();	
	
//ask user their last name
	System.out.print("Please enter your last name.") ;
			
//Store their last name
	name2 = input.next();	

// Ask age
	System.out.print("Please enter your age.") ;
	
//store age
	age = input1.nextInt();
	
// output
	System.out.printf("Hello %s %s I Didnt know that you were %d",name1, name2, age) ;
	
	}
	
}
