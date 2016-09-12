package day05;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("aBcAbCabcABC");
		
		System.out.println("2) "+s1.charAt(2));
		System.out.println("3) "+s1.indexOf("abc"));
		System.out.println("4) "+s1.length());
		System.out.println("5) "+s1.replace('a', 'R'));
		System.out.println("6) "+s1.replace("abc", "123"));
		System.out.println("7) "+s1.substring(0, 3));
		System.out.println("8) "+s1.toUpperCase());

	}

}
