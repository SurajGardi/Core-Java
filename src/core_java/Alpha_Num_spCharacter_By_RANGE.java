package core_java;

import java.util.Scanner;

public class Alpha_Num_spCharacter_By_RANGE {
	
	public static void main(String[] args) {
        //char ch = '#';
       // char ch = '1';
        //char ch = 'a';
    	
    	char ch;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number/Character/Sp.Character whatever you want.. : ");
        ch=sc.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is Number");
        } 
        //else if (ch >= 'A' && ch <= 'Z') {
//            System.out.println(ch + " is Character");
//        }
//	     else if (ch >= 'a' && ch <= 'z') {
//	        System.out.println(ch + " is Small Character");
            
            //OR
            
        else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
        	System.out.println(ch + " is Character");
	    }else {
            System.out.println(ch + " is Special Character");
        }
    }

}
