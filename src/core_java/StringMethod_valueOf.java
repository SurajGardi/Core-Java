package core_java;

public class StringMethod_valueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// valueOf() ===>  Convert primitive data types to their String representation.
		//Convert objects to their String representation (using their toString() method if it exists).
		
		int a = 10, b=10;
		System.out.println(a+b);	//returns 20 ==> addition occures becoz of Integer DataType
		
		String s1 = String.valueOf(a);
		String s2 = String.valueOf(b);

		System.out.println(a);	//returns 10 ==> but now the DataType of 10 is String 
		System.out.println(s1.concat(s2));	// concates both strings
		System.out.println(s1+s2);	// returns 1010 --> now s1 and s2 are String so here both are concat
	}

}


// WAP to reverse a string
