package InputOutput;
import java.util.Scanner;


public class inputoutput_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Variables 
		Scanner input = new Scanner (System.in) ;
		String theirName;
		String theirfeelings ;
		
		//ask user their name
		System.out.print("What is your name?") ;
		
		//Store their name
		theirName = input.next();
	
		//ask user how are they
		System.out.println ("How are you " + theirName + "?" ) ;
		
		
	

	}

}
