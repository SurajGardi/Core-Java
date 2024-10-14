package core_java;

public class forContinueStmt {

	//Continue stmt is used for skip the given cond^n and returns the loop again by incrementing i
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=5; i++) {
			if(i==3) {
				continue;//skip this cond^n
			}
			System.out.println(i);
		}
		System.out.println("Loop Finished..");
	}

}
