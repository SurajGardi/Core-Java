package core_java;

//There are three Methods..
//	1)By Reference
//	2)By Method
//	3)By Constructor

public class OOPSClassObject_Animal {
	
	String color="White";	//
	int age;
	
	public void initObj(String c,int a) {//Method 2 //Variables with methods //Variables Type = Local with instance
		
		color=c;	//
		age=a;		//Both ate Local Variables
	}
	
	public void display() {
		System.out.println(color+" "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OOPSClassObject_Animal cat=new OOPSClassObject_Animal();
		
		cat.color="white";//by Reference variable we assign string to it
		cat.age=2;
		System.out.println(cat.color+""+cat.age);//Method 1 //By referenace we printing it
		System.out.println(cat.age);
		
		cat.initObj("black", 2);
		cat.display();
	}

}
