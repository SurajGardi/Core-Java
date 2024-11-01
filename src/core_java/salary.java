package core_java;

import java.util.Scanner;

public class salary {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to input basic salary of an EMPLOYEE & calculate the total Salary according to following..
		
		//BaseSalary <= 10000 : HRA = 20% Of Basic Salary, DA = 80% Of Basic Salary
		//BaseSalary <= 20000 : HRA = 25% Of Basic Salary, DA = 90% Of Basic Salary
		//BaseSalary <= 10000 : HRA = 35% Of Basic Salary, DA = 95% Of Basic Salary
		
		//TOTAL SALARY -> Basic Salary + HRA + DA

		//float BaseSalary =25000;
		float BaseSalary ;

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Your BaseSalary : ");
		BaseSalary=sc.nextFloat();
		float HRA;
		float DA;
		
		if(BaseSalary < 10000) {
			HRA = BaseSalary * 0.2F;
			DA = BaseSalary * 0.8F;
		}
		else if(BaseSalary < 20000) {
			HRA = BaseSalary * 0.25F;
			DA = BaseSalary * 0.9F;
		}else {
			HRA = BaseSalary * 0.3F;
			DA = BaseSalary * 0.95F;
		}
		
		float salary=BaseSalary + HRA + DA;
		System.out.println("TOTAL SALARY IS : "+ salary);

	}

}
