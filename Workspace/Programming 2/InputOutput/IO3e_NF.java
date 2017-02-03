package InputOutput;
import java.util.Scanner;


public class IO3e_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Variables 
	Scanner input = new Scanner (System.in) ;
	int favnumber ;
	
// Ask user their favorite number
	System.out.print("What is your favorite number?") ;
	
//store favnumber
	favnumber = input.nextInt();

// Output
	System.out.printf ("But the number %d is twice as nice",  favnumber*2);
	}

}
