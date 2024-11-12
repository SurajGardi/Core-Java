package core_java;

public class StringMethod_replaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="java Welcome in java java";
		String result=s1.replaceAll("java(.)", "program");
		System.out.println(result);
		
		String result1=s1.replaceAll("java(.*)", "program");// * removes all other characters
		System.out.println(result1);
	}

}
