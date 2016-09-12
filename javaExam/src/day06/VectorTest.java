package day06;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[20];
		Vector v = new Vector();
		
		v.add("abc");
		v.add(10);
		v.add(new CalendarTest());
		v.add(new WrapperTest());
		
		Object obj = v.get(0);
		((String)obj).concat("");
		
		System.out.println(obj);
		
		Vector<String> v2 = new Vector<>();
		v2.add("test");
		String str = v2.get(0);
		str.concat("aaa");
		
		//System.out.println(v2);
		
		

	}

}
