package core_java;

public class forReturnStmtUsingMethod {

	//What is Method.?
	//==>Method is the Block of code when we required it... we can call it repeatedly..
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=add(3,5);//parameter
		int y=add(5,6);
		System.out.println(x);
		System.out.println(y);
}
		
		static int add(int i,int j) {
			int sum=i+j;//3+5=8
		return sum;
	}

}
