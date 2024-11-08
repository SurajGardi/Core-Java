package core_java;

public class StringMethod_compareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//compareTo() ==> used to comparing two strings lexicographically
		//Each character in both strings are converted into UniCode value and returns difference between both strings
		//returns ==> Integer
		
		String s1="A";//97
		String s2="a";//65     97-65=32
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.compareToIgnoreCase(s2));
	}

}
