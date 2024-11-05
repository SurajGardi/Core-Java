package core_java;

public class Constructor_Employee {
	
	String name;
	int empid;

	public Constructor_Employee(String name,int empid) {
		this.name=name;
		this.empid=empid;
		System.out.println(name);
		System.out.println(empid);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor_Employee e1= new Constructor_Employee("abc",101);
		Constructor_Employee e2=new Constructor_Employee("pqr",102);
		Constructor_Employee e3=new Constructor_Employee("xyz",103);

		//		e1.name="abc";
//		e1.empid=101;
//		
//		e2.name="abc";
//		e2.empid=101;
		

	}
}