package day06;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = Integer.parseInt("abc");
		
		int i2 = 10;
		
		Integer i3 = new Integer(i2);
		
		Integer i4 = i2;
		
		int i5 = i3.intValue();
		
		int i6 = i3;
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		
		

	}

}
