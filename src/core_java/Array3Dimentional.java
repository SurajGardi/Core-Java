package core_java;

public class Array3Dimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] a = new int[3][3][3];

		a[0][0][0] = 10;
		a[0][0][1] = 20;
		a[0][0][2] = 30;
		a[0][1][0] = 40;
		a[0][1][1] = 50;
		a[0][1][2] = 60;
		a[0][2][0] = 70;
		a[0][2][1] = 80;
		a[0][2][2] = 90;

		for (int i = 0; i < 1; i++) {
		    for (int j = 0; j <3; j++) {
		        for (int k = 0; k < 3; k++) {
		            System.out.print(a[i][j][k] + " ");
		        }
		        System.out.println();
		    }
		}
		
		
//		int[][][] a = {
//			    {
//			        {10, 20, 30}
//			    },
//			    {
//			         
//			        {40, 50, 60}
//			    },
//			    {
//			        
//			        {70, 80, 90}
//			    }
//			};
//
//
//		for (int i = 0; i < a.length; i++) {
//			    for (int j = 0; j < a[i].length; j++) {
//			        for (int k = 0; k < a[i][j].length; k++) {
//			            System.out.print(a[i][j][k] + " ");
//			        }
//			        System.out.println();  
//			    }
//			}

	}

}
