package core_java;

public class StringMethod_equalsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//equalsIgnoreCase() ==> In this case UpperCase & LowerCase newer matters 

		
		String s1 = "Suraj";
		String s2 = "suraj";
		System.out.println(s1.equalsIgnoreCase(s2));
		if(s1.equalsIgnoreCase(s2)==true) {
			//if(s1.equals(s2)==true) {
			System.out.println("Both Strings are equal");
		}
		else {
			System.out.println("Both Strings are not equal");
		}
	}

}
