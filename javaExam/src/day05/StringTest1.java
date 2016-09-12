package day05;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "TEST";
		String s2 = new String("TEST");
		String s3 = "TEST";
		String s4 = new String("TEST");
		
		if(s1==s3){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		
		if(s1==s2){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		
		if(s2==s4){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		
		//s1.concat("abc");
		s1=s1.concat("abc");
		
		System.out.println(s1);

	}

}
