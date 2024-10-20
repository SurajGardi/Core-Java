package core_java;

import java.util.HashSet;

public class Array2D_Common_Uncommon_Elements {

	 public static void main(String[] args) {
	        int[] a = {10, 20, 30, 40, 50};
	        int[] b = {10, 40, 70, 30, 80};

	        HashSet<Integer> common = new HashSet<>();
	        HashSet<Integer> uncommon = new HashSet<>();
	        
	        // Find common elements
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < b.length; j++) {
	                if (a[i] == b[j]) {
	                    common.add(a[i]);
	                    break;
	                }
	            }
	        }

	        // Add all elements from both arrays to the uncommon set
	        for (int i = 0; i < a.length; i++) {
	            if (!common.contains(a[i])) {
	                uncommon.add(a[i]);
	            }
	        }
	        for (int j = 0; j < b.length; j++) {
	            if (!common.contains(b[j])) {
	                uncommon.add(b[j]);
	            }
	        }

	        System.out.println("Common Elements: " + common);
	        
	        System.out.println("Uncommon Elements: " + uncommon);
	    }

}
