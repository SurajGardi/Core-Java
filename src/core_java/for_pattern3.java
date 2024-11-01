package core_java;

public class for_pattern3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step 1: Draw the pattern 1st
		//step 2: Count the No. of Rows and Coloumns
		//i => ROW
		//j => COl
		
		//		PATTERN	    						LOGIC
		
		//	    j1 j2 j3 j4 j5						i-5
		
		//		*  *  *  *  *		c1				1-5
		//		*  *  *  *			c2				2-5
		//      *  *  *  			c3				3-5
		//      *  *  				c4				4-5
		//      *					c5				5-5
		
		// LOGIC----
		
		//CUBE       => j = 1; j<=size
		//INCREASING => j = 1; j<=i
		//DECRESING  => j = i; j<=size 		
		
		
		int size = 5;
		
		for(int i = 1; i<=size; i++) {
			
			for(int j=i; j<=size; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
