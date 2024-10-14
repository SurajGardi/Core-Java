package core_java;

public class forLoopBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=5; i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Finish Loop");
	}

}
