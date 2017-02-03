package Loops;

import java.util.Scanner;

public class L16e_NF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in) ;
		int num=0;

		while(num!=1 && num !=2){

			System.out.println("Enter the neumber 1 or 2");
			num = input.nextInt();
			if (num==1){
				equals1(num);
			}
			if (num == 2){
				equals2(num);
			}
		}
	}
	public static void equals1(int num){
		System.out.println("You entered in the number 1");			

	}
	public static void equals2(int num){
		System.out.println("You entered in the number 2");			

	}
}
