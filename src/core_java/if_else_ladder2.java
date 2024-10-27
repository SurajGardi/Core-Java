package core_java;

public class if_else_ladder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//mess thali McD KFC 5 Star
		
		
//		//mess to 5 star
//		if(amount<50) {
//			System.out.println("Mess");
//		}
//		else if(amount<200) {
//			System.out.println("Thali");
//		}
//		else if(amount<500) {
//			System.out.println("McD");
//		}
//		else if(amount<1000) {
//			System.out.println("KFC");
//		}
//		else  {
//			System.out.println("5 Star");
//		}
		
		
		
		// 5 star to mess
		
//		if(amount>1000) {
//			System.out.println("5 star");
//		}
//		else if(amount >500) {
//			System.out.println("KFC");
//		}
//		else if(amount >200) {
//			System.out.println("McD");
//		}
//		else if(amount > 50) {
//			System.out.println("Thali");
//		}
//		else {
//			System.out.println("Mess");
//		}
		
		
		
		//mess to 5 star nested
		
		
//		if(amount<50)
//			System.out.println("Mess");
//		else {
//			if(amount<200)
//				System.out.println("Thali");
//			else {
//				if(amount<500)
//					System.out.println("McD");
//				else {
//					if(amount<1000)
//						System.out.println("KFC");
//					else {
//							System.out.println("5 Star");
//					}
//				}
//			}
//		}
		
		
		//5 Star to mess
		int amount = 700;
		
		if(amount>1000)
			System.out.println("5 star");
		else {
			if(amount>500)
				System.out.println("KFC");
			else {
				if(amount>200)
					System.out.println("McD");
				else {
					if(amount>50)
						System.out.println("Thali");
					else {
						System.out.println("Mess");
					}
				}
			}
		}

	}

}
