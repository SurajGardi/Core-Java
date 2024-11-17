package core_java;

public class Pattern4 {
	
	
	//	 *
	//	 * *
	//	 * * *
	//	 * * * *
	//	 * * *
	//	 * *
	//	 *


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		for(int i=0; i<n; i++) {		//row
			for(int j=0; j<=i; j++) {	//column
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for(int i=1; i<n; i++) {		//row
			for(int j=0; j<n-i; j++) {	//column  OR j>
			//for(int j=n; j>i; j--) {	
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		
				//LOGIC == 2
		
		
		
		
	}

}
