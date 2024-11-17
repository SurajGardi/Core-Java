package core_java;

public class Pattern7 {

    //      * 
    //    * 
    //  * 
    //*

    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 1; i <= n; i++) { // Rows
            for (int j = n; j > i; j--) { // Spaces before *
                System.out.print("  "); // Two spaces
            }
            System.out.println("*"); // Print * and move to the next line
        }
    }
}
