package core_java;

public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {20,40,70,90,10,30};
		int max=a[0];
		int min=a[0];
		for(int i=0; i<a.length;i++) {
			
			if(max<a[i]) {
				max=a[i];
			}
			else if(min>a[i]) {
				min=a[i];
			}
		}

		System.out.println("Maximum No From Given Array is :" +max);
		System.out.println("Minimum NO From Given Array is :" +min);
	}

}
