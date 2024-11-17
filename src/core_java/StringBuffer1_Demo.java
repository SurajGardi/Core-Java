package core_java;

public class StringBuffer1_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("Suraj");
		System.out.println(s.capacity());//16+5=21			//16 is Default capacity()

		StringBuffer d = new StringBuffer(100);
		System.out.println(d.capacity());//100
	}

}
