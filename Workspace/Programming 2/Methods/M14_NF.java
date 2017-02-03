package Methods;

import java.util.Scanner;

public class M14_NF {

	public static void main(String[] args) {
		String name;
		name = askAndGetName();
		System.out.printf("Your name is %s",name);
	}
	
	public static String askAndGetName(){

		// variables
		String name;
		Scanner input = new Scanner (System.in) ;

		System.out.print("What is your name? ");
		name = input.nextLine();
		return name;
	}
}


