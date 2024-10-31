package core_java;

public class for_pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step 1: Draw the pattern 1st
		//step 2: Count the No. of Rows and Coloumns
		//i=row
		//j=col
		
		//		PATTERN	    						LOGIC
		
		//	    j1 j2 j3 j4 j5						
		
		//		*  *  *  *  *		c1				
		//		*  *  *  *	*		c2				
		//      *  *  *  *	*		c3				
		//      *  *  *	 *	*		c4				
		//      *  *  *  *  *		c5				
		
		// LOGIC----
		
		//CUBE       => j = 1; j<=size
		//INCREASING => j = 1; j<=i
		//DECRESING  => j = i; j<=size 		
		
		
		int size=5;
		
		for(int i=1; i<=size; i++) {
		
			for(int j=1; j<=size;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}

	}

}
