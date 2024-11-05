package core_java;

public class Array {

	//Array..?
	//==> Array is collection of similar data types..
	
	//	  Array are use to store multiple values in single variable, instead of 
	//    declaring separate variables for each value
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{10,20,30},{40,50,60}};
//		int [] a=new int[6];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
