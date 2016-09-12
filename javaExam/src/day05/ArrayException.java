package day05;

public class ArrayException {
//
//	public static void method1() throws Exception {
//		// TODO Auto-generated method stub
//		
//		int[] arr = new int[5];
//		arr[0] = 0;
//		
//		for(int i=0;i<5;i++){
//			arr[i+1] = i+1+arr[i];
//			System.out.println("arr["+i+"]"+"="+arr[i]);
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		method1();
//	}
//
//}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = new int[5];
		arr[0] = 0;
		
		try{
			for(int i=0;i<5;i++){
				arr[i+1] = i+1+arr[i];
				System.out.println("arr["+i+"]"+"="+arr[i]);
			}
		}catch(Exception e){
			System.out.println("arr["+4+"]"+"="+arr[4]);
		}
	}
}