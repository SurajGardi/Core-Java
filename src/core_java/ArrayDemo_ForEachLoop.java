package core_java;

//Using For Each Loop

//using it for taking data from collection one by one..

public class ArrayDemo_ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] a= {10,20,30,40};
		int [] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		
		//for(datatype variablename : array name/collection name){
		//	ststement;
		//}
		//System.out.println(a[0]+ " "+a[1]+" "+" "+a[2]);
		for(int i:a) {
			System.out.println(i);
	}

	}	
}
