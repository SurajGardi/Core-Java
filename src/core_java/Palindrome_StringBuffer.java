package core_java;

public class Palindrome_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s = new StringBuffer("madam");
		StringBuffer rev = new StringBuffer("");
		for(int i=s.length()-1;i>=0;i--) {
			rev.append(s.charAt(i));
		}
		System.out.println("Original String is : "+s);
		System.out.println("Reversed String is : "+rev);
		
		//if(s.equals(rev)) {
		if(s.toString().equals(rev.toString()))	{
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is NOT Palindrrome");
		}
	}

}
