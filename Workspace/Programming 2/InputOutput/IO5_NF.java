package InputOutput;
import java.util.Scanner;


public class IO5_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Variables
	String name1 ;
	String name2 ;
	int age ;
	Scanner input = new Scanner (System.in) ;
	
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
	age = input.nextInt();
	
// output
	System.out.print("Hello, "+ name1 + " " +name2 +". I Didnt know that you were " + age) ;
	
	
	
	
	
	
	
	
	
	
	}

}
