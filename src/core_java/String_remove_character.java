package core_java;

public class String_remove_character {

	//WAP to remove specified character from given string
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "java programming";
		char c = 'v';
		
		String s1 = "";
		
		for(int i=0; i<=s.length()-1; i++) {
			if(s.charAt(i)!=c) {
				s1+=s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
