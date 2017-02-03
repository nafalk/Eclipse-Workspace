package Collectons;

import java.util.ArrayList;


public class C24_PP {

	public static void main(String[] args) {
		

		
		// Store Colors
		ArrayList <String> colorArrayList = new ArrayList <String> ();
		colorArrayList.add("Green");
		colorArrayList.add("Blue");
		colorArrayList.add("Red");
		colorArrayList.add("Orange");			
		
		print(colorArrayList);
		colorArrayList.remove("Red");
		print(colorArrayList);
	}
	public static void print(ArrayList colorArrayList){
		
		// Print names
				for (int i=0; i<colorArrayList.size(); i++) {
					System.out.println(colorArrayList.get(i));
				}
				System.out.print("_______________\n");
				
				
				
	}
}
