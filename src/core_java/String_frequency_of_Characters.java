package core_java;

public class String_frequency_of_Characters {
	
	//WAP to find frequency of characters in a string

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "rajaram";
		for(int i=0; i<s.length();i++) {
			int count = 0;
			for(int j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
					break;
				}
			}
			if(count==0) {
				for(int j=0;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						count++;
					}
				}
				System.out.println(s.charAt(i)+" "+count);
			}
		}
	}

}
//WAP to get lowest frequency character in String