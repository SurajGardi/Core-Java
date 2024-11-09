package core_java;

public class StringMethod_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//searches the sequence of character of a character in a given string
		//returns True if sequence of char value is found in the String otherwise returns --> False
		
		String s1= "Suraj";
		
		boolean result=s1.contains("raj");
		System.out.println(result);
		
			//OR
		
		System.out.println(s1.contains("abc"));
	}

}
