package core_java;

public class for_pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step 1: Draw the pattern 1st
		//step 2: Count the No. of Rows and Coloumns
		//i => ROW
		//j => COl
		
		// LOGIC---->
		
		//CUBE       => j = 1; j<=size
		//INCREASING => j = 1; j<=i
		//DECRESING  => j = i; j<=size 
		
		//		PATTERN	    						LOGIC
		
		//	    j1 j2 j3 j4 j5						i-5
		
		//	    *					c1				1-1
		//		*  *  				c2				1-2
		//      *  *  *  			c3				1-3
		//      *  *  *  * 			c4				1-4
		//      *  *  *  *  *		c5				1-5		
		
		
		int size=5;
		
		for(int i=1; i<=size; i++) {
			
			for(int j=1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
