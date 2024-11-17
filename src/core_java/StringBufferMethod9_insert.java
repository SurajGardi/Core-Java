package core_java;

public class StringBufferMethod9_insert {

	//insert() ==> inserts specific char/string in previous string
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s = new StringBuffer("Java Programming");
		System.out.println(s.insert(2, 'r'));
		System.out.println(s.insert(2, false));
		System.out.println(s.insert(2, "xxxxxx"));
		

	}

}
