package InputOutput;
import java.util.Scanner;


public class IO3_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables 
		Scanner input = new Scanner (System.in) ;
		String favcolor ;
// Ask user their favorite color
	System.out.print("What is your favorite color?") ;
		//store favcolor
	favcolor = input.next();
	System.out.println ("I like the color " + favcolor +".") ;
	}

}
