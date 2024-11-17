package core_java;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "madam";
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse+s.charAt(i);
		}
		System.out.println("Original String is : "+s);
		System.out.println("Reversed String is : "+reverse);
		
		if(s.equals(reverse)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is NOT Palindrrome");
		}
		
	}

}
