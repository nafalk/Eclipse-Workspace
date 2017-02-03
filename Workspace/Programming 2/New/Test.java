package New;

public class Test {
	
		  public static void main(String args[]) throws Exception{
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