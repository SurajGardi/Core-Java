package core_java;

public class StringMethod_toCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WAP to convert string in character array in upperCase().
		
		//toCharArray() ==> convert given string into array of character

		String s = "I'm in Office";
		System.out.println(s);

		s=s.toUpperCase();
		char[] c = s.toCharArray();
		
		
		System.out.print("[");
		for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
		System.out.println("]");
	}

}
