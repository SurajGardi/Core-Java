package core_java;

public class Pattern6 {

    //     * 
    //       * 
    //         * 
    //           *

    public static void main(String[] args) {
        int n = 4; 							// Number of rows
        for (int i = 1; i <= n; i++) { 		// Rows
            for (int j = 1; j < i; j++) {	 // Spaces before *
                System.out.print("  "); 	// Two spaces
            }
            System.out.println("*"); 		// Print * and next line
        }
    }
}
