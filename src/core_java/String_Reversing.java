package core_java;

public class String_Reversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Maharashtra";
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse+s.charAt(i);
		}
		System.out.println("Original String is : "+s);
		System.out.println("Reversed String is : "+reverse);

	}

}
