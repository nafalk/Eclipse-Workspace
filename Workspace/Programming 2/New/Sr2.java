package New;

import java.lang.reflect.Array;

public class Sr2 {

	

	public static void main(String[] args) {
		 int i = 0;
			String testString = "Hello";
			System.out.println(testString);
		    String[]  array =  {testString};
		    array[i] = testString.replaceAll("[A-Z,a-z]", " _");
		    for (String string : array) {
		    	System.out.println(string);	  
		    }
		    		 
}
}