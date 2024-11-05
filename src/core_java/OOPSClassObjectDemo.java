package core_java;

// OBJECT ==> 

// CLASS ==>

public class OOPSClassObjectDemo {//Take as Animal Class
	public void eat() {
		System.out.println("I'm eating..");
	}
	
	public void run() {
		System.out.println("I'm Running..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello..!");
		
		//Now we have to call above method by creating an Object..
		//Syntax for creating OBJECT..
		//className objectName = new className();
		
		System.out.println("Object for DOG.");
		OOPSClassObjectDemo dog=new OOPSClassObjectDemo();
		dog.eat();
		dog.run();
		System.out.println("Object for CAT.");
		OOPSClassObjectDemo cat=new OOPSClassObjectDemo();
		cat.eat();
		cat.run();
		
		System.out.println("Object Sparrow from Class OOPSClassObject_Bird() From Another Project..");
		
		OOPSClassObject_Bird sparrow= new OOPSClassObject_Bird();
		sparrow.fly();
	}

}
