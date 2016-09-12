package day06;

import java.util.Enumeration;
import java.util.*;
import java.util.Scanner;
class Test123{
	String a;
	String b;
	@Override
	public String toString() {
		return "Test123 [a=" + a + ", b=" + b + "]";
	}
	
}
public class HashtableTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Test123 t = new Test123();
		Hashtable<String, Object> ht = new Hashtable<>();
		Vector<String> v1 = new Vector<>();
		Vector<String> v2 = new Vector<>();
		v1.add("car");
		v1.add("Bus");
		v1.add("Truck");
		v2.add("Man");
		v2.add("Woman");
		v2.add("Child");
		
		t.a = sc.nextLine();
		t.b = sc.nextLine();
		ht.put("Car", t);
		
//		ht.put("Car", v1);
//		ht.put("Man", v2);
		
//		System.out.println(ht.get("Car"));
//		if(ht.containsKey("Man")){
//			System.out.println(ht.get("Man"));
//		}
		
//		Enumeration<Object> e = ht.elements();
//		while(e.hasMoreElements()){
//			System.out.println(e.nextElement());
//		}
		
		Enumeration<String> keys = ht.keys();
		Enumeration<Object> values = ht.elements();
		while(keys.hasMoreElements()){
			String key = keys.nextElement();
			System.out.println(key);
			System.out.println(t.toString());
		}
		
//		Set<String> keySet = ht.keySet();
//		
//		for (String string : keySet) {
//			System.out.println(string);
//			System.out.println(ht.get(string));
//		}
//		
//		Iterator<String> iter = keySet.iterator();
//		while(iter.hasNext()){
//			String key = iter.next();
//			System.out.println(key);
//			System.out.println(ht.get(key));
//		}

	}

}
