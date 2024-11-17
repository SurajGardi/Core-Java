package core_java;

public class StringBufferMethod16_compareTo {

	//WAP to compare given string by using StrBuffer..?
	
	//compareTo() ==> used to compare two StringBuffer instances lexicographically
		//Each character in both strings are converted into UniCode value and returns difference between both strings
	//returns ==> Integer
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s = new StringBuffer("a");//65
		StringBuffer c = new StringBuffer("A");//97

		System.out.println(s.compareTo(c));//97-65 = 32
	}

}
