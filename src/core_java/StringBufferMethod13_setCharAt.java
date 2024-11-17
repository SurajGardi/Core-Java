package core_java;

public class StringBufferMethod13_setCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s = new StringBuffer("Java Programming");
		s.setCharAt(2, 'P');
		System.out.println(s);
		System.out.println(s.substring(2));
	}

}
