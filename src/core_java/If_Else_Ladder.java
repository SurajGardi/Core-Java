package core_java;

import java.util.Scanner;

public class If_Else_Ladder {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll No. :");
		int roll=sc.nextInt();
		System.out.println("Enter marks of 5 Subjects :");
		System.out.println("Enter Marks of Physics :");
		int phy=sc.nextInt();
		System.out.println("Enter Marks of Chemistry :");
		int chem=sc.nextInt();
		System.out.println("Enter Marks of Biology :");
		int bio=sc.nextInt();
		System.out.println("Enter Marks of Mathmathics :");
		int math=sc.nextInt();
		System.out.println("Enter Marks of English :");
		int eng=sc.nextInt();
		
		int sum=phy+chem+bio+math+eng;
		int per=sum/5;
		
		if(per>=90)
			System.out.println("Roll NO : "+roll+" Got "+per+"% ==> A Grade");
		else if(per<90 && per>=70)
			System.out.println("Roll NO : "+roll+" Got "+per+"% ==> B Grade");
		else if(per<70 && per>=50)
			System.out.println("Roll NO : "+roll+" Got "+per+"% ==> C Grade");
		else if(per<50 && per>=35)
			System.out.println("Roll NO : "+roll+" Got "+per+"% ==> D Grade");
		else
			System.out.println("Roll NO : "+roll+" Got "+per+"% ==> Fail");
		}

}
