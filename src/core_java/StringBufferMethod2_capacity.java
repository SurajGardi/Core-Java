package core_java;

public class StringBufferMethod2_capacity {

	//capacity() ==> shows no. of character present in perticular string by adding its default capacity = 16
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s = new StringBuffer("Suraj");
		System.out.println(s.capacity());//16+5=21			//16 is Default capacity()

		StringBuffer d = new StringBuffer(100);
		System.out.println(d.capacity());//100
	}

}
