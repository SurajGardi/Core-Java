package core_java;

public class Pattern5 {

    //       * 
    //     * * 
    //   * * * 
    // * * * *

    public static void main(String[] args) {
        int n = 4; // Number of rows
        for (int i = 1; i <= n; i++) { // Rows
            for (int j = 1; j <= n - i; j++) { // Spaces
                System.out.print("  "); // Two spaces
            }
            for (int k = 1; k <= i; k++) { // Stars
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
