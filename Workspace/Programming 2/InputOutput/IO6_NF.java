package InputOutput;
import java.util.Scanner;


public class IO6_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		String tvShow;
		String day;
		int time;
		Scanner input = new Scanner (System.in) ;

		// get tv show info 

		System.out.print("Please enter your favorite tv show: ");
		tvShow= input.next();

		System.out.print("Please enter the day of the week it airs: ");
		day= input.next();

		System.out.print("Please enter the time it airs: ");
		time= input.nextInt();

		// output
		
		System.out.print(tvShow + " Is on "+ day + " at " + time + ".");

	}
}
