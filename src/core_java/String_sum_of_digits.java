package core_java;

public class String_sum_of_digits {

	//WAP to display sum of digits present in string
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a1b2c3";	//1=49 2=50 3=51...
		int sum = 0;
		
		for(int i=0; i<s.length();i++) {
			//a=97, b=98, c=99...
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int num = s.charAt(i)-48;
				sum = sum+num;
			}
		}
		System.out.println(sum);
	}

}
