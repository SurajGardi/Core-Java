package core_java;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a=10,b=20,temp;
		
//		System.out.println("before swap");
//		System.out.println("a :"+a);
//		System.out.println("b :"+b);
		
//		temp=a;
//		a=b;
//		b=temp;
		
//		System.out.println("after swap");
//		System.out.println("a :"+a);
//		System.out.println("b :"+b);
		
		// without using third variable..
		
		
		int a=10,b=20;
		
		System.out.println("before swap");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		a=a+b;//a=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		System.out.println("after swap");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
	}

}
