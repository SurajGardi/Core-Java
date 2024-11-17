package core_java;

public class StringBufferMethod10_replace {

	//replace() ==> replaces string by taking startIndex,endIndex and replace string in it.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s = new StringBuffer("Java Programming");
		System.out.println(s.replace(2, 5, "RAM"));
		System.out.println(s.replace(2, 5, "R"));

	}

}
