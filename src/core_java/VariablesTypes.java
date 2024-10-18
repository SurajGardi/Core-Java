package core_java;

public class VariablesTypes {
	
	static int a = 10;	//static variable
	int b = 20;			//instance variable//wh

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c = 30;		//local variable
		System.out.println("Value of local variable : "+c);
		
		//Syntax for creating OBJECT..
		//classname objectname = new classname();
		
		VariablesTypes ref= new VariablesTypes();
		System.out.println("Value of instance variable : "+ref.b);
		
		System.out.println("Value of static variable : "+VariablesTypes.a);
	}

}
