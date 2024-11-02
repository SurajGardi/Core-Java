package core_java;

class Calculator{
	public int add(int num1,int num2)
	{
		int r=num1 + num2;
		return r;
	}
}

public class Class_Object_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=5;
		int num2=6;
		
		Calculator calc = new Calculator();
		int result = calc.add(num1, num2);
		
		System.out.println(result);
	}

}
