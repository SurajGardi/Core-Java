package core_java;

public class Pattern2 {
	
	 //	 * 
	 //  * * 
	 //  * * * 
	 //  * * * *

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		for(int i=0; i<n; i++) {		//row
			for(int j=0; j<=i; j++) {	//column
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
